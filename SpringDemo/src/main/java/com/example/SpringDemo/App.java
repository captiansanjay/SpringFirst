package com.example.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.example.SpringDemo.StudentDao.StudentDao;
import com.example.SpringDemo.StudentDao.StudentDaoImpl;
import com.example.SpringDemo.entites.Student;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Spring jdbc");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/example/SpringDemo/config.xml");
		/*
		 * JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);
		 * 
		 * String query = "insert into student(id,name,city)value(?,?,?)"; int result =
		 * template.update(query, 1, "sss", "xyz"); System.out.println("record inserted"
		 * + result);
		 */

		StudentDao sd = context.getBean("studentDao", StudentDao.class);
		Student st = new Student();
		st.setId(2);
		st.setName("RAM 1");
		// st.setCity("PUNE");

		// int i = sd.insert(st);
		// System.out.println("record added=" + i);

		//int up = sd.updateData(st);
		//System.out.println("record update=" + up);

		int dp = sd.updateInt(2);
		System.out.println("update=" + dp);
		
		

	}

}
