package com.test.environment.dto;

import java.util.Arrays;

import org.codehaus.jackson.annotate.JsonProperty;

public class ScalingInstances {

	private Tags tags;
	private String flavour;
	private Storages[] storages;
	@JsonProperty("max_instances")
	private int maxInstances;

	public Tags getTags() {
		return tags;
	}

	public void setTags(Tags tags) {
		this.tags = tags;
	}

	public String getFlavour() {
		return flavour;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	public Storages[] getStorages() {
		return storages;
	}

	public void setStorages(Storages[] storages) {
		this.storages = storages;
	}

	public int getMaxInstances() {
		return maxInstances;
	}

	public void setMaxInstances(int maxInstances) {
		this.maxInstances = maxInstances;
	}

	public ScalingInstances() {

	}

	public ScalingInstances(Tags tags, String flavour, Storages[] storages, int maxInstances) {
		super();
		this.tags = tags;
		this.flavour = flavour;
		this.storages = storages;
		this.maxInstances = maxInstances;
	}

	@Override
	public String toString() {
		return "ScalingInstances [tags=" + tags + ", flavour=" + flavour + ", storages=" + Arrays.toString(storages)
				+ ", maxInstances=" + maxInstances + "]";
	}

}
