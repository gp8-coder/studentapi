package com.studentapi.students.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.studentapi.students.entity.student;
import com.studentapi.students.entity.studentSkill;
import com.studentapi.students.service.StudentService;

@RestController
@RequestMapping("/studentapi")
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@GetMapping("/students")
	public List<student> findAllStudents() {
		return service.findAll();
	}
	
	@GetMapping("/students/{studentId}")
	public student getStudent(@PathVariable int studentId) {
		student s=service.findById(studentId);
		
		if(s == null) {
			throw new RuntimeException("Student ID not found : "+ studentId);
			
		}
		
		return s;
	}
	
	@PostMapping("/students")
	public student addStudent(@RequestBody student st) {
		service.save(st);
		return st;
	}
	
	@PutMapping("/students")
	public student updateEmployee(@RequestBody student st) {
		service.save(st);
		return st;
	}
	
	@DeleteMapping("/students/{studentId}")
	public String deleteEmployee(@PathVariable int studentId) {
		student temp = service.findById(studentId);
		
		if(temp == null) {
			throw new RuntimeException("Student ID not found : "+ studentId);
		}
		
		service.deleteById(studentId);
		
		return "Deleted student : " + studentId;
	}
	
	@PostMapping("/skillUpdate/{id}")
	public student addSkill(@PathVariable int id,@RequestBody studentSkill stdskill) {
		student s = service.findById(id);
		stdskill.setS(s);
		service.saveSkill(stdskill);
		return s;
	}
}
