package com.example.SpringDemo.StudentDao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.example.SpringDemo.entites.Student;

public class StudentDaoImpl implements StudentDao {

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

//insert details
	@Override
	public int insert(Student student) {

		String query = "insert into student(id,name,city)value(?,?,?)";
		int re = this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
		return re;
	}

//update detail
	@Override
	public int updateData(Student st) {

		String query = "update student set name=? where id=?";
		int upd = this.jdbcTemplate.update(query, st.getName(), st.getId());

		return upd;
	}

//by id
	@Override
	public int updateInt(int i) {
		// Student s = new Student();

		String q = "select * from student where id=?";
		RowMapper<Student> rowmapper = new RowMapperimpl();
		Student student = this.jdbcTemplate.queryForObject(q, rowmapper, i);
		// print row
		System.out.println("student=" + student);
		System.out.println("i==" + student.getId());

		if (student.getId() == i) {
			String query = "update student set name=? where id=?";
			int up = this.jdbcTemplate.update(query, student.getName(), student.getId());
			System.out.println("up=" + up);
		} else {
			System.out.println("plz check id");
		}
		return i;

	}

}
