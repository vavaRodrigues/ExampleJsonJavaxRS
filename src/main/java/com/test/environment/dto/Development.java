package com.test.environment.dto;

import java.util.Arrays;

import org.codehaus.jackson.annotate.JsonProperty;

import com.test.simulador.dto.WorkingHours;

public class Development {

	@JsonProperty("max_instances")
	private int maxInstances;
	@JsonProperty("max_core_instance_elastic")
	private int maxCoreInstanceElastic;
	@JsonProperty("max_core_service_elastic")
	private int maxCoreServiceElastic;
	private Databases[] databases;
	private Instances[] instances;
	@JsonProperty("scaling_instances")
	private ScalingInstances[] scalingInstances;
	@JsonProperty("working_hours")
	private WorkingHours workingHours;
	@JsonProperty("warm_ups")
	private WarmUps warmUps;

	public int getMaxInstances() {
		return maxInstances;
	}

	public void setMaxInstances(int maxInstances) {
		this.maxInstances = maxInstances;
	}

	public int getMaxCoreInstanceElastic() {
		return maxCoreInstanceElastic;
	}

	public void setMaxCoreInstanceElastic(int maxCoreInstanceElastic) {
		this.maxCoreInstanceElastic = maxCoreInstanceElastic;
	}

	public int getMaxCoreServiceElastic() {
		return maxCoreServiceElastic;
	}

	public void setMaxCoreServiceElastic(int maxCoreServiceElastic) {
		this.maxCoreServiceElastic = maxCoreServiceElastic;
	}

	public Databases[] getDatabases() {
		return databases;
	}

	public void setDatabases(Databases[] databases) {
		this.databases = databases;
	}

	public Instances[] getInstances() {
		return instances;
	}

	public void setInstances(Instances[] instances) {
		this.instances = instances;
	}

	public ScalingInstances[] getScalingInstances() {
		return scalingInstances;
	}

	public void setScalingInstances(ScalingInstances[] scalingInstances) {
		this.scalingInstances = scalingInstances;
	}

	public WorkingHours getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(WorkingHours workingHours) {
		this.workingHours = workingHours;
	}

	public WarmUps getWarmUps() {
		return warmUps;
	}

	public void setWarmUps(WarmUps warmUps) {
		this.warmUps = warmUps;
	}

	public Development() {
	}

	public Development(int maxInstances, int maxCoreInstanceElastic, int maxCoreServiceElastic, Databases[] databases,
			Instances[] instances, ScalingInstances[] scalingInstances, WorkingHours workingHours, WarmUps warmUps) {
		super();
		this.maxInstances = maxInstances;
		this.maxCoreInstanceElastic = maxCoreInstanceElastic;
		this.maxCoreServiceElastic = maxCoreServiceElastic;
		this.databases = databases;
		this.instances = instances;
		this.scalingInstances = scalingInstances;
		this.workingHours = workingHours;
		this.warmUps = warmUps;
	}

	@Override
	public String toString() {
		return "Development [maxInstances=" + maxInstances + ", maxCoreInstanceElastic=" + maxCoreInstanceElastic
				+ ", maxCoreServiceElastic=" + maxCoreServiceElastic + ", databases=" + Arrays.toString(databases)
				+ ", instances=" + Arrays.toString(instances) + ", scalingInstances="
				+ Arrays.toString(scalingInstances) + ", workingHours=" + workingHours + ", warmUps=" + warmUps + "]";
	}

}
