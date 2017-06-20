package com.test.simulador.dto;

public class Instances {

	private String total;

	private String development;

	private String additional;

	private Extra extra;

	private String qa;

	private String production;

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public String getDevelopment() {
		return development;
	}

	public void setDevelopment(String development) {
		this.development = development;
	}

	public String getAdditional() {
		return additional;
	}

	public void setAdditional(String additional) {
		this.additional = additional;
	}

	public Extra getExtra() {
		return extra;
	}

	public void setExtra(Extra extra) {
		this.extra = extra;
	}

	public String getQa() {
		return qa;
	}

	public void setQa(String qa) {
		this.qa = qa;
	}

	public String getProduction() {
		return production;
	}

	public void setProduction(String production) {
		this.production = production;
	}

	@Override
	public String toString() {
		return "Instances [total=" + total + ", development=" + development + ", additional=" + additional + ", extra="
				+ extra + ", qa=" + qa + ", production=" + production + "]";
	}

}
