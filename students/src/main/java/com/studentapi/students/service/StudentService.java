package com.studentapi.students.service;

import java.util.List;

import com.studentapi.students.entity.student;
import com.studentapi.students.entity.studentSkill;

public interface StudentService {

	public List<student> findAll();
	public student findById(int id);
	public void save(student st);
	public void deleteById(int id);
	public void saveSkill(studentSkill s);
}
