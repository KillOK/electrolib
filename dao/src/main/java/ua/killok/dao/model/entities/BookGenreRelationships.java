package ua.killok.dao.model.entities;

import ua.killok.dao.model.interfaces.LibEntity;

public class BookGenreRelationships implements LibEntity{
	
	private int id;
	private Book book;
	private Genre genre;
	
	public BookGenreRelationships() {}

	public BookGenreRelationships(Book book, Genre genre) {
		this.book = book;
		this.genre = genre;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	
}
