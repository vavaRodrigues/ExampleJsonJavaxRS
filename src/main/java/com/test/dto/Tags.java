package com.test.dto;

import org.codehaus.jackson.annotate.JsonProperty;

public class Tags {

	@JsonProperty("configuration_type")
	private String configurationType;

	public String getConfigurationType() {
		return configurationType;
	}

	public void setConfigurationType(String configurationType) {
		this.configurationType = configurationType;
	}

	public Tags(String configurationType) {
		super();
		this.configurationType = configurationType;
	}

	@Override
	public String toString() {
		return "Tags [configurationType=" + configurationType + "]";
	}

}
