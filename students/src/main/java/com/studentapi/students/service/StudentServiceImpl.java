package com.studentapi.students.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentapi.students.DAO.SkillRepo;
import com.studentapi.students.DAO.StudentRepo;
import com.studentapi.students.entity.student;
import com.studentapi.students.entity.studentSkill;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepo std;
	
	@Autowired
	private SkillRepo skill;
	
	@Override
	public List<student> findAll() {
		
		return std.findAll();
	}

	@Override
	public student findById(int id) {
		Optional<student> op = std.findById(id);
		student s=new student();
		if(op.isPresent()) {
			 s = op.get();
		 }
		 else {
			 throw new RuntimeException("Did not find student id : " + id);
			 }
		return s;
	}

	@Override
	public void save(student st) {
		std.save(st);
		
	}

	@Override
	public void deleteById(int id) {
		std.deleteById(id);
		
	}
	
	@Override
	public void saveSkill(studentSkill s) {
		skill.save(s);
		
	}

}
