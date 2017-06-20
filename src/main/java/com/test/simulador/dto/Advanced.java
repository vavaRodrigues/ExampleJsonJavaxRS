package com.test.simulador.dto;

import org.codehaus.jackson.annotate.JsonProperty;

public class Advanced {

	@JsonProperty("pub_docs_average_month")
	private String pubDocsAverageMonth;

	@JsonProperty("installed_operational_system")
	private String installedOperationalSystem;

	@JsonProperty("other_system_names")
	private String otherSystemNames;

	@JsonProperty("proccess_init_average_month")
	private String proccessInitAverageMonth;

	@JsonProperty("other_system_integration")
	private boolean otherSystemIntegration;

	@JsonProperty("totvs_system_integration")
	private boolean totvsSystemIntegration;

	@JsonProperty("fluig_data")
	private String fluigData;

	@JsonProperty("communities_qtt")
	private String communitiesQtt;

	@JsonProperty("pages_access_average")
	private String pagesAccessAverage;

	@JsonProperty("database_size")
	private String databaseSize;

	private String product;

	private String email;

	@JsonProperty("pub_docs_size_average")
	private String pubDocsSizeAverage;

	@JsonProperty("dev_pages_qtt")
	private String devPagesQtt;

	@JsonProperty("communities_pub_average")
	private String communitiesPubAverage;

	@JsonProperty("workflow_qtt")
	private String workflowQtt;

	@JsonProperty("docs_qtt")
	private String docsQtt;

	public String getPubDocsAverageMonth() {
		return pubDocsAverageMonth;
	}

	public void setPubDocsAverageMonth(String pubDocsAverageMonth) {
		this.pubDocsAverageMonth = pubDocsAverageMonth;
	}

	public String getInstalledOperationalSystem() {
		return installedOperationalSystem;
	}

	public void setInstalledOperationalSystem(String installedOperationalSystem) {
		this.installedOperationalSystem = installedOperationalSystem;
	}

	public String getOtherSystemNames() {
		return otherSystemNames;
	}

	public void setOtherSystemNames(String otherSystemNames) {
		this.otherSystemNames = otherSystemNames;
	}

	public String getProccessInitAverageMonth() {
		return proccessInitAverageMonth;
	}

	public void setProccessInitAverageMonth(String proccessInitAverageMonth) {
		this.proccessInitAverageMonth = proccessInitAverageMonth;
	}

	public boolean isOtherSystemIntegration() {
		return otherSystemIntegration;
	}

	public void setOtherSystemIntegration(boolean otherSystemIntegration) {
		this.otherSystemIntegration = otherSystemIntegration;
	}

	public boolean isTotvsSystemIntegration() {
		return totvsSystemIntegration;
	}

	public void setTotvsSystemIntegration(boolean totvsSystemIntegration) {
		this.totvsSystemIntegration = totvsSystemIntegration;
	}

	public String getFluigData() {
		return fluigData;
	}

	public void setFluigData(String fluigData) {
		this.fluigData = fluigData;
	}

	public String getCommunitiesQtt() {
		return communitiesQtt;
	}

	public void setCommunitiesQtt(String communitiesQtt) {
		this.communitiesQtt = communitiesQtt;
	}

	public String getPagesAccessAverage() {
		return pagesAccessAverage;
	}

	public void setPagesAccessAverage(String pagesAccessAverage) {
		this.pagesAccessAverage = pagesAccessAverage;
	}

	public String getDatabaseSize() {
		return databaseSize;
	}

	public void setDatabaseSize(String databaseSize) {
		this.databaseSize = databaseSize;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPubDocsSizeAverage() {
		return pubDocsSizeAverage;
	}

	public void setPubDocsSizeAverage(String pubDocsSizeAverage) {
		this.pubDocsSizeAverage = pubDocsSizeAverage;
	}

	public String getDevPagesQtt() {
		return devPagesQtt;
	}

	public void setDevPagesQtt(String devPagesQtt) {
		this.devPagesQtt = devPagesQtt;
	}

	public String getCommunitiesPubAverage() {
		return communitiesPubAverage;
	}

	public void setCommunitiesPubAverage(String communitiesPubAverage) {
		this.communitiesPubAverage = communitiesPubAverage;
	}

	public String getWorkflowQtt() {
		return workflowQtt;
	}

	public void setWorkflowQtt(String workflowQtt) {
		this.workflowQtt = workflowQtt;
	}

	public String getDocsQtt() {
		return docsQtt;
	}

	public void setDocsQtt(String docsQtt) {
		this.docsQtt = docsQtt;
	}

	@Override
	public String toString() {
		return "Advanced [pubDocsAverageMonth=" + pubDocsAverageMonth + ", installedOperationalSystem="
				+ installedOperationalSystem + ", otherSystemNames=" + otherSystemNames + ", proccessInitAverageMonth="
				+ proccessInitAverageMonth + ", otherSystemIntegration=" + otherSystemIntegration
				+ ", totvsSystemIntegration=" + totvsSystemIntegration + ", fluigData=" + fluigData
				+ ", communitiesQtt=" + communitiesQtt + ", pagesAccessAverage=" + pagesAccessAverage
				+ ", databaseSize=" + databaseSize + ", product=" + product + ", email=" + email
				+ ", pubDocsSizeAverage=" + pubDocsSizeAverage + ", devPagesQtt=" + devPagesQtt
				+ ", communitiesPubAverage=" + communitiesPubAverage + ", workflowQtt=" + workflowQtt + ", docsQtt="
				+ docsQtt + "]";
	}

}
