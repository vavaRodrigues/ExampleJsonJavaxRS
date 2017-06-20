package com.test.simulador.dto;

public class Product {
	
	private int id;
	private String name;
	private String version;
	
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
	
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	
	public Product() {}
	
	public Product(int id, String name, String version) {
		this.id = id;
		this.name = name;
		this.version = version;
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", version=" + version + "]";
	}
	
}
