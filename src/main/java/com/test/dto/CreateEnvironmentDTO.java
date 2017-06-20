package com.test.dto;


import org.codehaus.jackson.annotate.JsonProperty;

public class CreateEnvironmentDTO {
	
	@JsonProperty("product_params")
	private ProductParams productParams;
	
	@JsonProperty("customer_company")
	private CustomerCompany customerCompany;
	
	@JsonProperty("product_version")
	private String productVersion;
	
	@JsonProperty("product_id")
	private String productId;
	
	@JsonProperty("provider_params")
	private ProviderParams providerParams;

	private Simulation simulation;
	
	@JsonProperty("provider_name")
	private String providerName;

	public ProductParams getProductParams() {
		return productParams;
	}

	public void setProductParams(ProductParams productParams) {
		this.productParams = productParams;
	}

	public CustomerCompany getCustomerCompany() {
		return customerCompany;
	}

	public void setCustomerCompany(CustomerCompany customerCompany) {
		this.customerCompany = customerCompany;
	}

	public String getProductVersion() {
		return productVersion;
	}

	public void setProductVersion(String productVersion) {
		this.productVersion = productVersion;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public ProviderParams getProviderParams() {
		return providerParams;
	}

	public void setProviderParams(ProviderParams providerParams) {
		this.providerParams = providerParams;
	}

	public Simulation getSimulation() {
		return simulation;
	}

	public void setSimulation(Simulation simulation) {
		this.simulation = simulation;
	}

	public String getProviderName() {
		return providerName;
	}

	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}

	@Override
	public String toString() {
		return "CreateEnvironmentDTO [productParams=" + productParams + ", customerCompany=" + customerCompany
				+ ", productVersion=" + productVersion + ", productId=" + productId + ", providerParams="
				+ providerParams + ", simulation=" + simulation + ", providerName=" + providerName + "]";
	}

}