package com.test.simulador.dto;

import java.util.Arrays;

public class CoreInstance {

	private String additional;

	private String kind;

	private Ebses[] ebses;

	public String getAdditional() {
		return additional;
	}

	public void setAdditional(String additional) {
		this.additional = additional;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public Ebses[] getEbses() {
		return ebses;
	}

	public void setEbses(Ebses[] ebses) {
		this.ebses = ebses;
	}

	@Override
	public String toString() {
		return "CoreInstance [additional=" + additional + ", kind=" + kind + ", ebses=" + Arrays.toString(ebses) + "]";
	}

}
