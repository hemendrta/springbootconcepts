package com.jpaexample.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private Long aadhar;
	private String pan;
	private String firstName;
	private String middleName;
	private String lastName;
	private Long mobile;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(int id, Long aadhar, String pan, String firstName, String middleName, String lastName, Long mobile) {
		super();
		this.id = id;
		this.aadhar = aadhar;
		this.pan = pan;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.mobile = mobile;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Long getAadhar() {
		return aadhar;
	}

	public void setAadhar(Long aadhar) {
		this.aadhar = aadhar;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", aadhar=" + aadhar + ", pan=" + pan + ", firstName=" + firstName + ", middleName="
				+ middleName + ", lastName=" + lastName + ", mobile=" + mobile + "]";
	}

}
