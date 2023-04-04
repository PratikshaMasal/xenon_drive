package com.login.loginpage.service;

import java.util.List;

import com.login.loginpage.model.Student;

public interface StudentService {
	public Student saveStudent(Student student);
	public List<Student> getAllStudents();
	
}
