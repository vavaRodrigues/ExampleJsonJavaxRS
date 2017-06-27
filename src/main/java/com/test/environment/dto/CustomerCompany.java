package com.test.environment.dto;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE, creatorVisibility = JsonAutoDetect.Visibility.NONE)
public class CustomerCompany {

	@JsonProperty("federal_id")
	private String federalId;
	@JsonProperty("corporate_name")
	private String corporateName;
	private String email;

	public void setFederalId(String federalId) {
		this.federalId = federalId;
	}

	public String getFederalId() {
		return federalId;
	}

	public void setCorporateName(String corporateName) {
		this.corporateName = corporateName;
	}

	public String getCorporateName() {
		return corporateName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public CustomerCompany() {

	}

	public CustomerCompany(String federalId, String corporateName, String email) {
		super();
		this.federalId = federalId;
		this.corporateName = corporateName;
		this.email = email;
	}

}