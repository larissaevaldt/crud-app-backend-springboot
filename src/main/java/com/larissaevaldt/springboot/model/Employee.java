package com.larissaevaldt.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employees")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "profession")
	private String profession;
	@Column(name = "city")
	private String city;
	@Column(name = "branch")
	private String branch;
	
	protected Employee() {
		
	}

	public Employee(String firstName, String lastName, String profession, String city, String branch) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.profession = profession;
		this.city = city;
		this.branch = branch;
	}

	public long getId() {
		return id;
	}

	public void setId(long code) {
		this.id = code;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", profession="
				+ profession + ", city=" + city + ", branch=" + branch + "]";
	}
	
	
	
	
	
	
}
