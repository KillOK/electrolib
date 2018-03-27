package ua.killok.dao.model.entities;

import java.util.Set;

import ua.killok.dao.model.interfaces.LibEntity;

public class Author implements LibEntity{
	
	private int id;
	private String name;
	private String surname;
	private String secondname;
	private byte[] authorpicture;
	
	private Set<Book> books;

	public Author() {}
	
	public Author(String name, String surname, String secondname, byte[] authorpicture) {
		this.name = name;
		this.surname = surname;
		this.secondname = secondname;
		this.authorpicture = authorpicture;
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
	public String getSecondname() {
		return secondname;
	}
	public void setSecondname(String secondname) {
		this.secondname = secondname;
	}
	public byte[] getAuthorpicture() {
		return authorpicture;
	}
	public void setAuthorpicture(byte[] authorpicture) {
		this.authorpicture = authorpicture;
	}
	
	public Set<Book> getBooks() {
		return books;
	}
	
	public void setBooks(Set<Book> books) {
		this.books = books;
	}
	
}
