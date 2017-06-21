package com.test.dto;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE,
setterVisibility=JsonAutoDetect.Visibility.NONE, creatorVisibility=JsonAutoDetect.Visibility.NONE)
public class CustomerCompany {

	@JsonProperty("federal_id")
	private String federalId;

	private String email;

	@JsonProperty("corporate_name")
	private String corporateName;

	public String getFederalId() {
		return federalId;
	}

	public void setFederalId(String federalId) {
		this.federalId = federalId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCorporateName() {
		return corporateName;
	}

	public void setCorporateName(String corporateName) {
		this.corporateName = corporateName;
	}
	
	public CustomerCompany() {
	}

	public CustomerCompany(String federalId, String email, String corporateName) {
		super();
		this.federalId = federalId;
		this.email = email;
		this.corporateName = corporateName;
	}
}
