package com.test.simulador.dto;

public class Provider {
	
	private String name;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Provider [name=" + name + "]";
	}

}
