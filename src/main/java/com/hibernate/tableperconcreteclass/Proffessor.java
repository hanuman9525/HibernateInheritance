package com.hibernate.tableperconcreteclass;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "proffessor")
@AttributeOverrides({ @AttributeOverride(name = "college_id", column = @Column(name = "college_id") ),
		@AttributeOverride(name = "college_name", column = @Column(name = "college_name") ) })

public class Proffessor extends College {
	@Column(name = "proffessor_name")
	private String proffessorName;
	@Column(name = "Proffessot_type")
	private String proffessorType;

	public Proffessor() {
		super();
	}

	public Proffessor(String collegeName, String proffessorName, String proffessorType) {
		super(collegeName);
		this.proffessorName = proffessorName;
		this.proffessorType = proffessorType;
	}

	public String getProffessorName() {
		return proffessorName;
	}

	public void setProffessorName(String proffessorName) {
		this.proffessorName = proffessorName;
	}

	public String getProffessorType() {
		return proffessorType;
	}

	public void setProffessorType(String proffessorType) {
		this.proffessorType = proffessorType;
	}

}
