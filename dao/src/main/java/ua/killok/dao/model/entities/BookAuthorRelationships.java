package ua.killok.dao.model.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import ua.killok.dao.model.interfaces.LibEntity;

@Entity
@Table(name="electro_lib.book_author")
public class BookAuthorRelationships implements LibEntity{
	
	private int id;

	@JoinColumn(name="bookid", referencedColumnName="id")
	private Book book;
	
	@JoinColumn(name="autorid", referencedColumnName="id")
	private Author author;
	
	public BookAuthorRelationships() {}

	public BookAuthorRelationships(Book book, Author author) {
		this.book = book;
		this.author = author;
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

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}
	
}
