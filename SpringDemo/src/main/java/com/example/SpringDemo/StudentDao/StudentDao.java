package com.example.SpringDemo.StudentDao;

import com.example.SpringDemo.entites.Student;

public interface StudentDao {
	public int insert(Student student);

	public int updateData(Student st);

	public int updateInt(int i);

}
