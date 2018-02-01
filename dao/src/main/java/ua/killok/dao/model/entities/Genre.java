package ua.killok.dao.model.entities;

import ua.killok.dao.model.interfaces.LibEntity;

public class Genre implements LibEntity{
	
	private int id;
	private String name;
	
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
