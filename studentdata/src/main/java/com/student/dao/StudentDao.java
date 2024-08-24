package com.student.dao;

import java.util.ArrayList;

import com.student.pojo.Student;

public interface StudentDao {
	
	public ArrayList<Student> studentDetails();
	
	public ArrayList<Student> getStudentById(int studentId);
	
	public ArrayList<Student> getStudentDetailsByCourseAndFees(String studentCourse, float courseFee);

	public void createStudentDetails(Student student);

	public void updateStudentCourse(String studentCourse, int studentId);

	public void deleteStudentDetails(int studentId);

}
