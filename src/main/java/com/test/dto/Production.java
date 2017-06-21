package com.test.dto;


import java.util.Arrays;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE,
setterVisibility=JsonAutoDetect.Visibility.NONE, creatorVisibility=JsonAutoDetect.Visibility.NONE)
public class Production {

	@JsonProperty("working_hours")
	private WorkingHoursEnvironment workingHours;

	@JsonProperty("max_core_instance_elastic")
	private String maxCoreInstanceElastic;

	@JsonProperty("max_instances")
	private String maxInstances;

	@JsonProperty("warm_ups")
	private WarmUps warmUps;

	@JsonProperty("scaling_instances")
	private String[] scalingInstances;

	@JsonProperty("max_core_service_elastic")
	private String maxCoreServiceElastic;

	private DatabasesEnvironment[] databases;

	private InstancesEnvironment[] instances;

	public WorkingHoursEnvironment getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(WorkingHoursEnvironment workingHours) {
		this.workingHours = workingHours;
	}

	public String getMaxCoreInstanceElastic() {
		return maxCoreInstanceElastic;
	}

	public void setMaxCoreInstanceElastic(String maxCoreInstanceElastic) {
		this.maxCoreInstanceElastic = maxCoreInstanceElastic;
	}

	public String getMaxInstances() {
		return maxInstances;
	}

	public void setMaxInstances(String maxInstances) {
		this.maxInstances = maxInstances;
	}

	public WarmUps getWarmUps() {
		return warmUps;
	}

	public void setWarmUps(WarmUps warmUps) {
		this.warmUps = warmUps;
	}

	public String[] getScalingInstances() {
		return scalingInstances;
	}

	public void setScalingInstances(String[] scalingInstances) {
		this.scalingInstances = scalingInstances;
	}

	public String getMaxCoreServiceElastic() {
		return maxCoreServiceElastic;
	}

	public void setMaxCoreServiceElastic(String maxCoreServiceElastic) {
		this.maxCoreServiceElastic = maxCoreServiceElastic;
	}

	public DatabasesEnvironment[] getDatabases() {
		return databases;
	}

	public void setDatabases(DatabasesEnvironment[] databases) {
		this.databases = databases;
	}

	public InstancesEnvironment[] getInstances() {
		return instances;
	}

	public void setInstances(InstancesEnvironment[] instances) {
		this.instances = instances;
	}
	
	public Production() {
	}

	public Production(WorkingHoursEnvironment workingHours, String maxCoreInstanceElastic, String maxInstances,
			WarmUps warmUps, String[] scalingInstances, String maxCoreServiceElastic, DatabasesEnvironment[] databases,
			InstancesEnvironment[] instances) {
		super();
		this.workingHours = workingHours;
		this.maxCoreInstanceElastic = maxCoreInstanceElastic;
		this.maxInstances = maxInstances;
		this.warmUps = warmUps;
		this.scalingInstances = scalingInstances;
		this.maxCoreServiceElastic = maxCoreServiceElastic;
		this.databases = databases;
		this.instances = instances;
	}

	@Override
	public String toString() {
		return "Production [workingHours=" + workingHours + ", maxCoreInstanceElastic=" + maxCoreInstanceElastic
				+ ", maxInstances=" + maxInstances + ", warmUps=" + warmUps + ", scalingInstances="
				+ Arrays.toString(scalingInstances) + ", maxCoreServiceElastic=" + maxCoreServiceElastic
				+ ", databases=" + Arrays.toString(databases) + ", instances=" + Arrays.toString(instances) + "]";
	}

}
