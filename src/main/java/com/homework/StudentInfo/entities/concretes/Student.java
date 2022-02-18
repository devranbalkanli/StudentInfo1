package com.homework.StudentInfo.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private long id;
	
	@Column(name="first_name", nullable=false)
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="gano")
	private double gano;
	
	
	public Student() {
		
	}
	
	public Student(long id,String firstName,String lastName,double gano) {
		super();
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
		this.gano=gano;
		
	}
	
	public void setId(long id) {
		this.id=id;
	}
	
	public long getId() {
		return id;
	}
	
	public void setFirstName(String firstName) {
		this.firstName=firstName;
	}
	
	public String getFirstName() {
		return firstName;
		}
	
	public void setLastName(String lastName) {
		this.lastName=lastName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setGano(float gano) {
		this.gano=gano;
	}
	
	public double getGano() {
		return gano;
	}


}
