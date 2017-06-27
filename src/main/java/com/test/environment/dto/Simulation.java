package com.test.environment.dto;

import java.util.Arrays;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE, creatorVisibility = JsonAutoDetect.Visibility.NONE)
public class Simulation {
	@JsonProperty("scaling_type")
	private String scalingType;

	@JsonProperty("billing_type")
	private String billingType;

	@JsonProperty("alert_enabled")
	private String alertEnabled;

	@JsonProperty("additional_capacity")
	private int additionalCapacity;

	@JsonProperty("additional_capacity_days")
	private String[] additionalCapacityDays;

	@JsonProperty("cost_alert")
	private double costAlert;

	@JsonProperty("max_number_of_devices")
	private int maxNumberOfDevices;

	@JsonProperty("number_of_devices")
	private int numberOfDevices;

	@JsonProperty("segment_factor_number")
	private int segmentFactorNumber;

	private Stages stages;

	public String getScalingType() {
		return scalingType;
	}

	public void setScalingType(String scalingType) {
		this.scalingType = scalingType;
	}

	public String getBillingType() {
		return billingType;
	}

	public void setBillingType(String billingType) {
		this.billingType = billingType;
	}

	public String getAlertEnabled() {
		return alertEnabled;
	}

	public void setAlertEnabled(String alertEnabled) {
		this.alertEnabled = alertEnabled;
	}

	public int getAdditionalCapacity() {
		return additionalCapacity;
	}

	public void setAdditionalCapacity(int additionalCapacity) {
		this.additionalCapacity = additionalCapacity;
	}

	public String[] getAdditionalCapacityDays() {
		return additionalCapacityDays;
	}

	public void setAdditionalCapacityDays(String[] additionalCapacityDays) {
		this.additionalCapacityDays = additionalCapacityDays;
	}

	public double getCostAlert() {
		return costAlert;
	}

	public void setCostAlert(double costAlert) {
		this.costAlert = costAlert;
	}

	public int getMaxNumberOfDevices() {
		return maxNumberOfDevices;
	}

	public void setMaxNumberOfDevices(int maxNumberOfDevices) {
		this.maxNumberOfDevices = maxNumberOfDevices;
	}

	public int getNumberOfDevices() {
		return numberOfDevices;
	}

	public void setNumberOfDevices(int numberOfDevices) {
		this.numberOfDevices = numberOfDevices;
	}

	public int getSegmentFactorNumber() {
		return segmentFactorNumber;
	}

	public void setSegmentFactorNumber(int segmentFactorNumber) {
		this.segmentFactorNumber = segmentFactorNumber;
	}

	public Stages getStages() {
		return stages;
	}

	public void setStages(Stages stages) {
		this.stages = stages;
	}

	public Simulation() {
	}

	public Simulation(String scalingType, String billingType, String alertEnabled, int additionalCapacity,
			String[] additionalCapacityDays, double costAlert, int maxNumberOfDevices, int numberOfDevices,
			int segmentFactorNumber, Stages stages) {
		super();
		this.scalingType = scalingType;
		this.billingType = billingType;
		this.alertEnabled = alertEnabled;
		this.additionalCapacity = additionalCapacity;
		this.additionalCapacityDays = additionalCapacityDays;
		this.costAlert = costAlert;
		this.maxNumberOfDevices = maxNumberOfDevices;
		this.numberOfDevices = numberOfDevices;
		this.segmentFactorNumber = segmentFactorNumber;
		this.stages = stages;
	}

	@Override
	public String toString() {
		return "Simulation [scalingType=" + scalingType + ", billingType=" + billingType + ", alertEnabled="
				+ alertEnabled + ", additionalCapacity=" + additionalCapacity + ", additionalCapacityDays="
				+ Arrays.toString(additionalCapacityDays) + ", costAlert=" + costAlert + ", maxNumberOfDevices="
				+ maxNumberOfDevices + ", numberOfDevices=" + numberOfDevices + ", segmentFactorNumber="
				+ segmentFactorNumber + ", stages=" + stages + "]";
	}

}