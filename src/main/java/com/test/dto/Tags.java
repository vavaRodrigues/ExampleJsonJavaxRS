package com.test.dto;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE,
setterVisibility=JsonAutoDetect.Visibility.NONE, creatorVisibility=JsonAutoDetect.Visibility.NONE)
public class Tags {

	@JsonProperty("configuration_type")
	private String configurationType;

	public String getConfigurationType() {
		return configurationType;
	}

	public void setConfigurationType(String configurationType) {
		this.configurationType = configurationType;
	}
	
	public Tags() {
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
