package com.test.simulador.dto;

import java.util.Arrays;

import org.codehaus.jackson.annotate.JsonProperty;

public class Hardware {

	@JsonProperty("core_instance")
	private CoreInstance[] coreInstance;

	@JsonProperty("in_transfer")
	private String inTransfer;

	private Databases[] databases;

	@JsonProperty("transfer_public_ip_elastic_ip")
	private String transferPublicIpElasticIp;

	@JsonProperty("load_balancer")
	private String loadBalancer;

	@JsonProperty("core_service_elastic")
	private String[] coreServiceElastic;

	@JsonProperty("core_instance_elastic")
	private String[] coreInstanceElastic;

	@JsonProperty("out_transfer")
	private String outTransfer;

	@JsonProperty("core_service")
	private String[] coreService;

	public CoreInstance[] getCoreInstance() {
		return coreInstance;
	}

	public void setCoreInstance(CoreInstance[] coreInstance) {
		this.coreInstance = coreInstance;
	}

	public String getInTransfer() {
		return inTransfer;
	}

	public void setInTransfer(String inTransfer) {
		this.inTransfer = inTransfer;
	}

	public Databases[] getDatabases() {
		return databases;
	}

	public void setDatabases(Databases[] databases) {
		this.databases = databases;
	}

	public String getTransferPublicIpElasticIp() {
		return transferPublicIpElasticIp;
	}

	public void setTransferPublicIpElasticIp(String transferPublicIpElasticIp) {
		this.transferPublicIpElasticIp = transferPublicIpElasticIp;
	}

	public String getLoadBalancer() {
		return loadBalancer;
	}

	public void setLoadBalancer(String loadBalancer) {
		this.loadBalancer = loadBalancer;
	}

	public String[] getCoreServiceElastic() {
		return coreServiceElastic;
	}

	public void setCoreServiceElastic(String[] coreServiceElastic) {
		this.coreServiceElastic = coreServiceElastic;
	}

	public String[] getCoreInstanceElastic() {
		return coreInstanceElastic;
	}

	public void setCoreInstanceElastic(String[] coreInstanceElastic) {
		this.coreInstanceElastic = coreInstanceElastic;
	}

	public String getOutTransfer() {
		return outTransfer;
	}

	public void setOutTransfer(String outTransfer) {
		this.outTransfer = outTransfer;
	}

	public String[] getCoreService() {
		return coreService;
	}

	public void setCoreService(String[] coreService) {
		this.coreService = coreService;
	}

	@Override
	public String toString() {
		return "Hardware [coreInstance=" + Arrays.toString(coreInstance) + ", inTransfer=" + inTransfer
				+ ", databases=" + Arrays.toString(databases) + ", transferPublicIpElasticIp="
				+ transferPublicIpElasticIp + ", loadBalancer=" + loadBalancer + ", coreServiceElastic="
				+ Arrays.toString(coreServiceElastic) + ", coreInstanceElastic=" + Arrays.toString(coreInstanceElastic)
				+ ", outTransfer=" + outTransfer + ", coreService=" + Arrays.toString(coreService) + "]";
	}

}
