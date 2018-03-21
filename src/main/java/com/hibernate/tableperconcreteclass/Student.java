package com.hibernate.tableperconcreteclass;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student_tbl")
@AttributeOverrides({ @AttributeOverride(name = "college_id", column = @Column(name = "college_id") ),
		@AttributeOverride(name = "college_name", column = @Column(name = "college_name") ) })

public class Student extends College{
	@Column(name = "student_name")
	private String studentName;
	@Column(name = "student_city")
	private String studentCity;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String collegeName, String studentName, String studentCity) {
		super(collegeName);
		this.studentName = studentName;
		this.studentCity = studentCity;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
}
