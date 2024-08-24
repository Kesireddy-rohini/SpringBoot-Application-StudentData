package com.student.LocalDataBase;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import com.student.pojo.Student;

@Component
public class LocalDataBase {
	
	ArrayList<Student> al = new ArrayList<Student>();
	public LocalDataBase() {
		
		studentDetails();
		
	}
	
	public ArrayList<Student> studentDetails() {
		
		Student s1 = new Student();
		s1.setStudentId(101);
		s1.setStudentName("rohini");
		s1.setStudentCourse("java");
		s1.setStudentAddress("macherla");
		s1.setCourseFee(10000);
		
		
		Student s2 = new Student();
		s2.setStudentId(102);
		s2.setStudentName("srivani");
		s2.setStudentCourse("python");
		s2.setStudentAddress("martur");
		s2.setCourseFee(9000);
		
		Student s3 = new Student();
		s3.setStudentId(103);
		s3.setStudentName("teja");
		s3.setStudentCourse("reactjs");
		s3.setStudentAddress("narasaraopeta");
		s3.setCourseFee(7000);
		
		Student s4 = new Student();
		s4.setStudentId(104);
		s4.setStudentName("puji");
		s4.setStudentCourse("python");
		s4.setStudentAddress("ongole");
		s4.setCourseFee(10000);
		
		Student s5 = new Student();
		s5.setStudentId(105);
		s5.setStudentName("priyanka");
		s5.setStudentCourse("aws");
		s5.setStudentAddress("rentachintala");
		s5.setCourseFee(8000);
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		
		
	return al;

	}
	
	public ArrayList<Student> getStudentDetails(){
		
		return al;
		
	}

	public void createStudentDetails(Student student) {
		
		al.add(student);
		
		
	}
	
public void deleteStudentDetails(Student student) {
		
		al.remove(student);
		
	}
	
	}


