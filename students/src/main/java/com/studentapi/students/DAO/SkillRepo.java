package com.studentapi.students.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studentapi.students.entity.studentSkill;

public interface SkillRepo extends JpaRepository<studentSkill,Integer> {

}
