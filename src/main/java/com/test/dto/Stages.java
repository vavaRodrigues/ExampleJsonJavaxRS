package com.test.dto;

public class Stages {
	private Production production;

	public Production getProduction() {
		return production;
	}

	public void setProduction(Production production) {
		this.production = production;
	}

	public Stages(Production production) {
		super();
		this.production = production;
	}
	
	@Override
	public String toString() {
		return "Stages [production=" + production + "]";
	}

}
