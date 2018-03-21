package com.hibernate.annotations.crud;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;

@Entity
@Table(name = "stud_practice_tbl")
public class Student {
	@Id
	@Column(name = "roll_num", nullable = true, unique = true)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int rollNumber;
	
	@Column(name = "stud_name")
	private String name;
	@Column(name = "stud_mark")
	private int marks;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int marks) {
		super();
	//	this.rollNumber = rollNumber;
		this.name = name;
		this.marks = marks;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + ", marks=" + marks + "]";
	}

}
