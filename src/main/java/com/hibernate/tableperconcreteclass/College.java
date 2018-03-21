package com.hibernate.tableperconcreteclass;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import org.hibernate.annotations.ValueGenerationType;

@Entity
@Table(name = "college_tbl")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

public class College {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	@Column(name = "college_id")
	private int collegeId;

	@Column(name = "college_name")
	private String collegeName;

	public College() {
		super();
		// TODO Auto-generated constructor stub
	}

	public College(String collegeName) {
		super();
		this.collegeName = collegeName;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

}
