package com.test.simulador.dto;

import java.util.Arrays;

import org.codehaus.jackson.annotate.JsonProperty;

public class SimulationDTO {

	private Summary summary;

	@JsonProperty("working_hours")
	private WorkingHours[] workingHours;

	private Client client;

	private Stats stats;

	private Predictability predictability;

	private Manifest[] manifest;

	@JsonProperty("source_type")
	private String sourceType;

	private Instances instances;

	private String type;

	private Contact contact;

	private String id;

	private String approved;

	private Advanced advanced;

	private String in_use;

	@JsonProperty("created_at")
	private String created_at;

	private String connections;

	@JsonProperty("rampup_hours")
	private RampupHours[] rampupHours;

	@JsonProperty("segment_factor_number")
	private String segmentFactorNumber;

	private String[] services;

	private Support support;

	@JsonProperty("product_version")
	private String productVersion;

	private String reviewable;

	private Provider provider;

	private String available;

	@JsonProperty("current_status")
	private String currentStatus;

	private String[] stages;

	private Database database;

	private String editable;

	private Product product;

	@JsonProperty("install_type")
	private String installType;

	private String plan;

	private String clonable;

	@JsonProperty("expiration_date")
	private String expirationDate;

	private String modality;

	private User user;

	private String step;

	public Summary getSummary() {
		return summary;
	}

	public void setSummary(Summary summary) {
		this.summary = summary;
	}

	public WorkingHours[] getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(WorkingHours[] workingHours) {
		this.workingHours = workingHours;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Stats getStats() {
		return stats;
	}

	public void setStats(Stats stats) {
		this.stats = stats;
	}

	public Predictability getPredictability() {
		return predictability;
	}

	public void setPredictability(Predictability predictability) {
		this.predictability = predictability;
	}

	public Manifest[] getManifest() {
		return manifest;
	}

	public void setManifest(Manifest[] manifest) {
		this.manifest = manifest;
	}

	public String getSourceType() {
		return sourceType;
	}

	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}

	public Instances getInstances() {
		return instances;
	}

	public void setInstances(Instances instances) {
		this.instances = instances;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getApproved() {
		return approved;
	}

	public void setApproved(String approved) {
		this.approved = approved;
	}

	public Advanced getAdvanced() {
		return advanced;
	}

	public void setAdvanced(Advanced advanced) {
		this.advanced = advanced;
	}

	public String getIn_use() {
		return in_use;
	}

	public void setIn_use(String in_use) {
		this.in_use = in_use;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public String getConnections() {
		return connections;
	}

	public void setConnections(String connections) {
		this.connections = connections;
	}

	public RampupHours[] getRampupHours() {
		return rampupHours;
	}

	public void setRampupHours(RampupHours[] rampupHours) {
		this.rampupHours = rampupHours;
	}

	public String getSegmentFactorNumber() {
		return segmentFactorNumber;
	}

	public void setSegmentFactorNumber(String segmentFactorNumber) {
		this.segmentFactorNumber = segmentFactorNumber;
	}

	public String[] getServices() {
		return services;
	}

	public void setServices(String[] services) {
		this.services = services;
	}

	public Support getSupport() {
		return support;
	}

	public void setSupport(Support support) {
		this.support = support;
	}

	public String getProductVersion() {
		return productVersion;
	}

	public void setProductVersion(String productVersion) {
		this.productVersion = productVersion;
	}

	public String getReviewable() {
		return reviewable;
	}

	public void setReviewable(String reviewable) {
		this.reviewable = reviewable;
	}

	public Provider getProvider() {
		return provider;
	}

	public void setProvider(Provider provider) {
		this.provider = provider;
	}

	public String getAvailable() {
		return available;
	}

	public void setAvailable(String available) {
		this.available = available;
	}

	public String getCurrentStatus() {
		return currentStatus;
	}

	public void setCurrentStatus(String currentStatus) {
		this.currentStatus = currentStatus;
	}

	public String[] getStages() {
		return stages;
	}

	public void setStages(String[] stages) {
		this.stages = stages;
	}

	public Database getDatabase() {
		return database;
	}

	public void setDatabase(Database database) {
		this.database = database;
	}

	public String getEditable() {
		return editable;
	}

	public void setEditable(String editable) {
		this.editable = editable;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public String getInstallType() {
		return installType;
	}

	public void setInstallType(String installType) {
		this.installType = installType;
	}

	public String getPlan() {
		return plan;
	}

	public void setPlan(String plan) {
		this.plan = plan;
	}

	public String getClonable() {
		return clonable;
	}

	public void setClonable(String clonable) {
		this.clonable = clonable;
	}

	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getModality() {
		return modality;
	}

	public void setModality(String modality) {
		this.modality = modality;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getStep() {
		return step;
	}

	public void setStep(String step) {
		this.step = step;
	}

	@Override
	public String toString() {
		return "SimulationDTO [summary=" + summary + ", workingHours=" + Arrays.toString(workingHours) + ", client="
				+ client + ", stats=" + stats + ", predictability=" + predictability + ", manifest="
				+ Arrays.toString(manifest) + ", sourceType=" + sourceType + ", instances=" + instances + ", type="
				+ type + ", contact=" + contact + ", id=" + id + ", approved=" + approved + ", advanced=" + advanced
				+ ", in_use=" + in_use + ", created_at=" + created_at + ", connections=" + connections
				+ ", rampupHours=" + Arrays.toString(rampupHours) + ", segmentFactorNumber=" + segmentFactorNumber
				+ ", services=" + Arrays.toString(services) + ", support=" + support + ", productVersion="
				+ productVersion + ", reviewable=" + reviewable + ", provider=" + provider + ", available=" + available
				+ ", currentStatus=" + currentStatus + ", stages=" + Arrays.toString(stages) + ", database=" + database
				+ ", editable=" + editable + ", product=" + product + ", installType=" + installType + ", plan=" + plan
				+ ", clonable=" + clonable + ", expirationDate=" + expirationDate + ", modality=" + modality
				+ ", user=" + user + ", step=" + step + "]";
	}

}
