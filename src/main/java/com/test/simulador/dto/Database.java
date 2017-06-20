package com.test.simulador.dto;

public class Database {

	private String tag;

	private String name;

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Database [tag=" + tag + ", name=" + name + "]";
	}

}
