package com.xworkz.orm.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "population")
public class PopularionEntity implements Serializable {

	@Id
	@GenericGenerator(name = "pop", strategy = "increment")
	@GeneratedValue(generator = "pop")
	private int pid;
	private String state;
	private String gender;
	private Double employementPercentage;

	public PopularionEntity() {

		System.out.println("created.....\t" + this.getClass().getSimpleName());
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Double getEmployementPercentage() {
		return employementPercentage;
	}

	public void setEmployementPercentage(Double employementPercentage) {
		this.employementPercentage = employementPercentage;
	}

	@Override
	public String toString() {
		return "PopularionEntity [pid=" + pid + ", state=" + state + ", gender=" + gender + ", employementPercentage="
				+ employementPercentage + "]";
	}

}
