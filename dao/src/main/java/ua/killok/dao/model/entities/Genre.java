package ua.killok.dao.model.entities;

import java.util.Set;

import ua.killok.dao.model.interfaces.LibEntity;

public class Genre implements LibEntity{
	
	private int id;
	private String name;
	private Set<Book> books;
	
	public Set<Book> getBooks() {
		return books;
	}

	public void setBooks(Set<Book> books) {
		this.books = books;
	}

	public Genre() {	}

	public Genre(String name) {
		this.name = name;
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
	
}
