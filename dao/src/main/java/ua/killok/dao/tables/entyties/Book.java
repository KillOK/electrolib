package ua.killok.dao.tables.entyties;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import ua.killok.dao.tables.models.LibEntity;

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
	
	public Book() {}
	
	public Book(String name, byte[] picture, String shortDescription, Date addingDate) {
		this.name = name;
		this.picture = picture;
		this.shortDescription = shortDescription;
		this.addingDate = addingDate;
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
	
	
}
