package com.studentapi.students.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="students")
public class student {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="dob")
	private String dob;
	
	@OneToMany(mappedBy="s",cascade={CascadeType.DETACH,
			CascadeType.MERGE,CascadeType.PERSIST,
			CascadeType.REFRESH})
	private List<studentSkill> std;

	public student() {
		
	}
	public student(int id, String name, String dob, List<studentSkill> std) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.std = std;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public List<studentSkill> getStd() {
		return std;
	}

	public void setStd(List<studentSkill> std) {
		this.std = std;
	}
	
	
	
}
