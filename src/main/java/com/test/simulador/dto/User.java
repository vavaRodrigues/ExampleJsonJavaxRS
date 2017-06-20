package com.test.simulador.dto;

public class User {

	private String category;

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "User [category=" + category + "]";
	}

}
