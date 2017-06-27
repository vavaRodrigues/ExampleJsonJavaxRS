package com.test.environment.dto;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Stages {
	private Production production;

	private Development development;

	private Qa qa;

	public Production getProduction() {
		return production;
	}

	public void setProduction(Production production) {
		this.production = production;
	}

	public Development getDevelopment() {
		return development;
	}

	public void setDevelopment(Development development) {
		this.development = development;
	}

	public Qa getQa() {
		return qa;
	}

	public void setQa(Qa qa) {
		this.qa = qa;
	}

	public Stages() {
	}

	public Stages(Production production) {
		super();
		this.production = production;
	}

	public Stages(Development development, Qa qa) {
		super();
		this.development = development;
	}

	public Stages(Qa qa) {
		super();
		this.qa = qa;
	}

	@Override
	public String toString() {
		return "Stages [production=" + production + ", development=" + development + ", qa=" + qa + "]";
	}
}
