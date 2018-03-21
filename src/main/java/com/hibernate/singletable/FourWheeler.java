package com.hibernate.singletable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "FOUR_WHEELER")
@DiscriminatorValue(value = "Car")
public class FourWheeler extends Vehicle{
	@Column(name = "STEERING_TYPE")
	private String steeringFourWheeler;

	public FourWheeler() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FourWheeler(String vehicleName, String steer) {
		super(vehicleName);
		this.steeringFourWheeler=steer;
		// TODO Auto-generated constructor stub
	}

	public String getSteeringFourWheeler() {
		return steeringFourWheeler;
	}

	public void setSteeringFourWheeler(String steeringFourWheeler) {
		this.steeringFourWheeler = steeringFourWheeler;
	}
}
