package com.hibernate.tablepersubclass;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "employee_tbl")
@PrimaryKeyJoinColumn(name = "person_id")

public class Employee extends Person {
	@Column(name = "joining_date")
	private String joiningDate;
	@Column(name = "department_name")
	private String departmentName;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String firstName, String lastName,String joiningDate, String departmentName) {
		super(firstName, lastName);
		this.joiningDate = joiningDate;
		this.departmentName = departmentName;
	}
	@Override
	public String toString() {
		return "Employee [joiningDate=" + joiningDate + ", departmentName=" + departmentName + ", toString()="
				+ super.toString() + "]";
	}
	
}
