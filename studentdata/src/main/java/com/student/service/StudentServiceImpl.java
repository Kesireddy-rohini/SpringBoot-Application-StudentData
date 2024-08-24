package com.student.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.dao.StudentDao;
import com.student.pojo.Student;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	
	StudentDao studentDao;
	@Override
	public ArrayList<Student> studentDetails() {
		
		return studentDao.studentDetails();
	}
	@Override
	public ArrayList<Student> getStudentById(int studentId) {
		
		return studentDao.getStudentById(studentId);
	}
	@Override
	public ArrayList<Student> getStudentDetailsByCourseAndFees(String studentCourse, float courseFee) {
		
		return studentDao.getStudentDetailsByCourseAndFees(studentCourse, courseFee);
	}
	@Override
	public void createStudentDetails(Student student) {
		studentDao.createStudentDetails(student);
	}
	@Override
	public void updateStudentCourse(String studentCourse, int studentId) {
		
		studentDao.updateStudentCourse(studentCourse, studentId);
		
	}
	@Override
	public void deleteStudentDetails(int studentId) {
		studentDao.deleteStudentDetails(studentId);
		
	}

}
