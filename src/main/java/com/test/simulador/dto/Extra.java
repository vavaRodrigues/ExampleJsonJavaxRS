package com.test.simulador.dto;

public class Extra {

	private String total;

	private String portal;

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public String getPortal() {
		return portal;
	}

	public void setPortal(String portal) {
		this.portal = portal;
	}

	@Override
	public String toString() {
		return "Extra [total=" + total + ", portal=" + portal + "]";
	}

}
