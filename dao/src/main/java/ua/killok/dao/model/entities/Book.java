package ua.killok.dao.model.entities;

import java.sql.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import ua.killok.dao.model.interfaces.LibEntity;

@Entity
@Table(name="electro_lib.book")
public class Book implements LibEntity{
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="picture")
	private byte[] picture;
	@Column(name="shortdescription")
	private String shortDescription;
	@Column(name="addingDate")
	private Date addingDate;
	
	private Set<Author> authors;
	private Set<Genre> genres;
	private Set<BookContent> bookContent;
	

	public Set<BookContent> getBookContent() {
		return bookContent;
	}

	public void setBookContent(Set<BookContent> bookContent) {
		this.bookContent = bookContent;
	}

	public Book() {}
	
	public Book(String name, byte[] picture, String shortDescription, Date addingDate) {
		this.name = name;
		this.picture = picture;
		this.shortDescription = shortDescription;
		this.addingDate = addingDate;
	}

	public Set<Genre> getGenres() {
		return genres;
	}

	public void setGenres(Set<Genre> genres) {
		this.genres = genres;
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

	public byte[] getPicture() {
		return picture;
	}

	public void setPicture(byte[] picture) {
		this.picture = picture;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public Date getAddingDate() {
		return addingDate;
	}

	public void setAddingDate(Date addingDate) {
		this.addingDate = addingDate;
	}
	
	public Set<Author> getAuthors() {
		return authors;
	}
	
	public void setAuthors(Set<Author> authors) {
		this.authors = authors;
	}
	
	
}
