package ua.killok.dao.model.entities;

import ua.killok.dao.model.interfaces.LibEntity;

public class User implements LibEntity{
	
	private int id;
	private String name ;
	private String surname ;
	private byte[] picture;
	private String login ;
	private String password ;
	private String email ;
	
	public User() {}

	public User(String name, String surname, byte[] picture, String login, String password, String email) {
		this.name = name;
		this.surname = surname;
		this.picture = picture;
		this.login = login;
		this.password = password;
		this.email = email;
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

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public byte[] getPicture() {
		return picture;
	}

	public void setPicture(byte[] picture) {
		this.picture = picture;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
