package com.test.simulador.dto;

public class Client {
	
	private String name;
	private String t_code;
	private String type;
	private String category;
	private String email;
	private boolean in_datacenter;
	private Consultant consultant;
	private String cnpj;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getT_code() {
		return t_code;
	}
	public void setT_code(String t_code) {
		this.t_code = t_code;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public boolean isIn_datacenter() {
		return in_datacenter;
	}
	public void setIn_datacenter(boolean in_datacenter) {
		this.in_datacenter = in_datacenter;
	}
	
	public Consultant getConsultant() {
		return consultant;
	}
	public void setConsultant(Consultant consultant) {
		this.consultant = consultant;
	}
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public Client(){}
	
	public Client(String name, String t_code, String type, String category, String email, boolean in_datacenter, Consultant consultant, String cnpj) {
		this.name = name;
		this.t_code = t_code;
		this.type = type;
		this.category = category;
		this.email = email;
		this.in_datacenter = in_datacenter;
		this.consultant = consultant;
		this.cnpj = cnpj;
	}
	
	@Override
	public String toString() {
		return "Client [name=" + name + ", t_code=" + t_code + ", type=" + type + ", category=" + category + ", email="
				+ email + ", in_datacenter=" + in_datacenter + ", consultant=" + consultant + ", cnpj=" + cnpj + "]";
	}
	
}
