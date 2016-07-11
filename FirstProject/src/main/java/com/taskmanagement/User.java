package com.taskmanagement;

import java.util.Date;

public class User {
	private int id;
	private String name;
	private String email;
	private Date birthdate;
	private String telephone;

	public User() {
	}

	public User(int id, String name, String email, Date birthdate, String telephone) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.birthdate = birthdate;
		this.telephone = telephone;
	}

	public User(String name, String email, Date birthdate, String telephone) {
		this.name = name;
		this.email = email;
		this.birthdate = birthdate;
		this.telephone = telephone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	// http://www.codejava.net/frameworks/hibernate/writing-a-basic-hibernate-based-program-with-eclipse?showall=1&limitstart=
}