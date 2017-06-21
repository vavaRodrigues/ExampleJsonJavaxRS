package com.test.dto;

import java.util.Arrays;

import org.codehaus.jackson.annotate.JsonProperty;

public class Simulation {
	@JsonProperty("billing_type")
	private String billingType;

	@JsonProperty("cost_alert")
	private String costAlert;

	@JsonProperty("scaling_type")
	private String scalingType;

	@JsonProperty("max_number_of_devices")
	private String maxNumberOfDevices;

	@JsonProperty("additional_capacity")
	private String additionalCapacity;

	@JsonProperty("alert_enabled")
	private String alertEnabled;

	private Stages stages;

	@JsonProperty("additional_capacity_days")
	private String[] additionalCapacityDays;

	@JsonProperty("segment_factor_number")
	private String segmentFactorNumber;

	@JsonProperty("number_of_devices")
	private String numberOfDevices;

	public String getBillingType() {
		return billingType;
	}

	public void setBillingType(String billingType) {
		this.billingType = billingType;
	}

	public String getCostAlert() {
		return costAlert;
	}

	public void setCostAlert(String costAlert) {
		this.costAlert = costAlert;
	}

	public String getScalingType() {
		return scalingType;
	}

	public void setScalingType(String scalingType) {
		this.scalingType = scalingType;
	}

	public String getMaxNumberOfDevices() {
		return maxNumberOfDevices;
	}

	public void setMaxNumberOfDevices(String maxNumberOfDevices) {
		this.maxNumberOfDevices = maxNumberOfDevices;
	}

	public String getAdditionalCapacity() {
		return additionalCapacity;
	}

	public void setAdditionalCapacity(String additionalCapacity) {
		this.additionalCapacity = additionalCapacity;
	}

	public String getAlertEnabled() {
		return alertEnabled;
	}

	public void setAlertEnabled(String alertEnabled) {
		this.alertEnabled = alertEnabled;
	}

	public Stages getStages() {
		return stages;
	}

	public void setStages(Stages stages) {
		this.stages = stages;
	}

	public String[] getAdditionalCapacityDays() {
		return additionalCapacityDays;
	}

	public void setAdditionalCapacityDays(String[] additionalCapacityDays) {
		this.additionalCapacityDays = additionalCapacityDays;
	}

	public String getSegmentFactorNumber() {
		return segmentFactorNumber;
	}

	public void setSegmentFactorNumber(String segmentFactorNumber) {
		this.segmentFactorNumber = segmentFactorNumber;
	}

	public String getNumberOfDevices() {
		return numberOfDevices;
	}

	public void setNumberOfDevices(String numberOfDevices) {
		this.numberOfDevices = numberOfDevices;
	}
	
	public Simulation() {
	}

	public Simulation(String billingType, String costAlert, String scalingType, String maxNumberOfDevices,
			String additionalCapacity, String alertEnabled, Stages stages, String[] additionalCapacityDays,
			String segmentFactorNumber, String numberOfDevices) {
		super();
		this.billingType = billingType;
		this.costAlert = costAlert;
		this.scalingType = scalingType;
		this.maxNumberOfDevices = maxNumberOfDevices;
		this.additionalCapacity = additionalCapacity;
		this.alertEnabled = alertEnabled;
		this.stages = stages;
		this.additionalCapacityDays = additionalCapacityDays;
		this.segmentFactorNumber = segmentFactorNumber;
		this.numberOfDevices = numberOfDevices;
	}

	@Override
	public String toString() {
		return "Simulation [billingType=" + billingType + ", costAlert=" + costAlert + ", scalingType=" + scalingType
				+ ", maxNumberOfDevices=" + maxNumberOfDevices + ", additionalCapacity=" + additionalCapacity
				+ ", alertEnabled=" + alertEnabled + ", stages=" + stages + ", additionalCapacityDays="
				+ Arrays.toString(additionalCapacityDays) + ", segmentFactorNumber=" + segmentFactorNumber
				+ ", numberOfDevices=" + numberOfDevices + "]";
	}

}