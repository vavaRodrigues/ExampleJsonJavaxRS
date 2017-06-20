package com.test.simulador.dto;

public class Consultant {
	private String t_code;
	private String name;
	
	public String getT_code() {
		return t_code;
	}
	public void setT_code(String t_code) {
		this.t_code = t_code;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Consultant() {}
	
	public Consultant(String t_code, String name) {
		this.t_code = t_code;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Consultant [t_code=" + t_code + ", name=" + name + "]";
	}

}
