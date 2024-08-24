package com.student.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.student.pojo.Student;
import com.student.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@GetMapping("/studentDetails")
	public ArrayList<Student> studentDetails() {
		
		return studentService.studentDetails();
		
	}
	
	@GetMapping("/getStudentDetailsById")
	public ArrayList<Student> getStudentById(@RequestParam int studentId){
		
		return studentService.getStudentById(studentId);
		
	}

	@GetMapping("/getStudentDetailsByCourseAndFees")
	public ArrayList<Student> getStudentDetailsByCourseAndFees(String studentCourse, float courseFee){
		
		
		return studentService.getStudentDetailsByCourseAndFees(studentCourse, courseFee);
		
	}
	
	@PostMapping("/createStudentDetails")
	public void createStudentDetails(@RequestBody Student student){
		
	 studentService.createStudentDetails(student);
		
	}
	
	@PutMapping("/updateStudentCourse")
	public void updateSudentCourse(@RequestParam String studentCourse , @RequestParam  int studentId) {
		
		studentService.updateStudentCourse(studentCourse, studentId);
		
	}
	@DeleteMapping("/deleteStudentDetails/{studentId}")
	public void deleteStudentDetails(@PathVariable int studentId) {
		studentService.deleteStudentDetails(studentId);
		
	}
}
