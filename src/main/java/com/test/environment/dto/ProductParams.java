package com.test.environment.dto;


public class ProductParams {
	private String language;

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	@Override
	public String toString() {
		return "ProductParams [language=" + language + "]";
	}

}
