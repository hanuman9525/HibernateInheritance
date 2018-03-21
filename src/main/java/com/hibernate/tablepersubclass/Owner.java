package com.hibernate.tablepersubclass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "owner_tbl")
@PrimaryKeyJoinColumn(name = "person_id")
public class Owner extends Person {
	@Column(name = "stock")
	private int stock;
	@Column(name = "partnership_stock")
	private int partnershipStock;
	public Owner() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Owner(String firstName, String lastName, int stock, int partnershipStock) {
		super(firstName, lastName);
		this.stock = stock;
		this.partnershipStock = partnershipStock;
	}
	@Override
	public String toString() {
		return "Owner [stock=" + stock + ", partnershipStock=" + partnershipStock + ", toString()=" + super.toString()
				+ "]";
	}
	
}
