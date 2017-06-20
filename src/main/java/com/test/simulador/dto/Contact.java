package com.test.simulador.dto;

public class Contact {

	private String phone;

	private String email;

	private String name;

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Contact [phone=" + phone + ", email=" + email + ", name=" + name + "]";
	}

}
