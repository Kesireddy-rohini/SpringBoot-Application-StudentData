package com.student.service;

import java.util.ArrayList;

import com.student.pojo.Student;

public interface StudentService {
	
	public ArrayList<Student> studentDetails();
	
	public ArrayList<Student> getStudentById(int studentId);
	public ArrayList<Student> getStudentDetailsByCourseAndFees(String studentCourse, float courseFee);

	public void createStudentDetails(Student student);

	public void updateStudentCourse(String studentCourse, int studentId);

	public void deleteStudentDetails(int studentId);

}
