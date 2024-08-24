package com.student.dao;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.student.LocalDataBase.LocalDataBase;
import com.student.pojo.Student;

@Repository
public class StudentDaoImpl implements StudentDao {
	
	
	
	@Autowired
	LocalDataBase localDatabase;
	
	

	@Override
	public ArrayList<Student> studentDetails() {
		
		return localDatabase.getStudentDetails();
		

	}
	
	

	@Override
	public ArrayList<Student> getStudentById(int studentId) {

		ArrayList<Student> returnstudentById = new ArrayList<Student>();
		
		for(Student s :localDatabase.studentDetails() ) {
			if(s.getStudentId()==studentId) {
				
				returnstudentById.add(s);
				
				
			}
		}
		return returnstudentById;
		
	
	}
	
	public ArrayList<Student> getStudentDetailsByCourseAndFees(String studentCourse, float courseFee) {
		

		
		ArrayList<Student> returnByStudentCourseAndFee = new ArrayList<Student>();
		for(Student ss:localDatabase.studentDetails()) {
			
			if(ss.getStudentCourse().equals(studentCourse) && (ss.getCourseFee()==courseFee))
			
			{
				returnByStudentCourseAndFee.add(ss);
				
			}
		}
		
		return returnByStudentCourseAndFee ;
		
	}

	@Override
	public void createStudentDetails(Student student) {
		localDatabase.createStudentDetails(student);
		
	}

	@Override
	public void updateStudentCourse(String studentCourse, int studentId) {
		
		ArrayList<Student> studentList = getStudentById(studentId);
		
		for( Student e:studentList) {
			e.setStudentCourse(studentCourse);
			
			
		}	
		
	}

	@Override
	public void deleteStudentDetails(int studentId) {
		ArrayList<Student> studentDetails = getStudentById(studentId);
		for(Student e:studentDetails) {
	localDatabase.deleteStudentDetails(e);
			
		}
		
		
	}
	}
