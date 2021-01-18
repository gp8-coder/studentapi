package com.studentapi.students.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studentapi.students.entity.student;

public interface StudentRepo extends JpaRepository<student,Integer> {

}
