package ua.killok.dao.model.entities;

import ua.killok.dao.model.interfaces.LibEntity;

public class BookContent implements LibEntity {

	private int id;
	private Book book;
	private String fileName;
	private byte[] file;

	public BookContent() {
	}

	public BookContent(Book book, String fileName, byte[] file) {
		this.book = book;
		this.fileName = fileName;
		this.file = file;
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

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public byte[] getFile() {
		return file;
	}

	public void setFile(byte[] file) {
		this.file = file;
	}

}
