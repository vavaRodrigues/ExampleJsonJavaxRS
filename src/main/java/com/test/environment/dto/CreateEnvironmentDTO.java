package com.test.environment.dto;


import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE,
setterVisibility=JsonAutoDetect.Visibility.NONE, creatorVisibility=JsonAutoDetect.Visibility.NONE)
public class CreateEnvironmentDTO {
	
	@JsonProperty("product_params")
	private ProductParams productParams;
	
	@JsonProperty("customer_company")
	private CustomerCompany customerCompany;
	
	@JsonProperty("product_version")
	private String productVersion;
	
	@JsonProperty("product_id")
	private int productId;
	
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

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
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
}
