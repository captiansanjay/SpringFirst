package com.example.SpringDemo.StudentDao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.SpringDemo.entites.Student;

public class RowMapperimpl implements RowMapper<Student> {

	@Override

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.setId(rs.getInt(1));// column name-1
		student.setName(rs.getString(2));// column name-2
		student.setCity(rs.getString(3));

		return student;
	}

}
