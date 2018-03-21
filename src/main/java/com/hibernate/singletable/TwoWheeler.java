package com.hibernate.singletable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "twowheeler_tbl")
@DiscriminatorValue(value = "Bike")
public class TwoWheeler extends Vehicle{
	@Column(name = "STEERING_TYPE")
	private String steeringTwoWheeler;

	
	public TwoWheeler(String name, String steeringTwoWheeler) {
		super(name);
		this.steeringTwoWheeler = steeringTwoWheeler;
	}

	public TwoWheeler() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getSteeringTwoWheeler() {
		return steeringTwoWheeler;
	}

	public void setSteeringTwoWheeler(String steeringTwoWheeler) {
		this.steeringTwoWheeler = steeringTwoWheeler;
	}
}
