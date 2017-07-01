package com.test.environment.dto;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE, creatorVisibility = JsonAutoDetect.Visibility.NONE)
public class CreateEnvironmentDTO {
	@JsonProperty("product_id")
	private String productId;
	@JsonProperty("product_version")
	private String productVersion;
	@JsonProperty("provider_name")
	private String providerName;
	@JsonProperty("customer_company")
	private CustomerCompany customerCompany;
	@JsonProperty("product_params")
	private ProductParams productParams;
	@JsonProperty("provider_params")
	private ProviderParams providerParams;
	private Object simulation;
	
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductVersion() {
		return productVersion;
	}
	public void setProductVersion(String productVersion) {
		this.productVersion = productVersion;
	}
	public String getProviderName() {
		return providerName;
	}
	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}
	public CustomerCompany getCustomerCompany() {
		return customerCompany;
	}
	public void setCustomerCompany(CustomerCompany customerCompany) {
		this.customerCompany = customerCompany;
	}
	public ProductParams getProductParams() {
		return productParams;
	}
	public void setProductParams(ProductParams productParams) {
		this.productParams = productParams;
	}
	public ProviderParams getProviderParams() {
		return providerParams;
	}
	public void setProviderParams(ProviderParams providerParams) {
		this.providerParams = providerParams;
	}
	public Object getSimulation() {
		return simulation;
	}
	public void setSimulation(Object simulation) {
		this.simulation = simulation;
	}
	public CreateEnvironmentDTO(String productId, String productVersion, String providerName,
			CustomerCompany customerCompany, ProductParams productParams, ProviderParams providerParams,
			Object simulation) {
		super();
		this.productId = productId;
		this.productVersion = productVersion;
		this.providerName = providerName;
		this.customerCompany = customerCompany;
		this.productParams = productParams;
		this.providerParams = providerParams;
		this.simulation = simulation;
	}
	
	public CreateEnvironmentDTO(String productId, String productVersion, String providerName,
			CustomerCompany customerCompany, ProductParams productParams, 
			Object simulation) {
		super();
		this.productId = productId;
		this.productVersion = productVersion;
		this.providerName = providerName;
		this.customerCompany = customerCompany;
		this.productParams = productParams;
		this.simulation = simulation;
	}
	

}
