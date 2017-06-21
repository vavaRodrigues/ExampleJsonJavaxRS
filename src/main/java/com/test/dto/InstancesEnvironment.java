package com.test.dto;

import java.util.Arrays;

public class InstancesEnvironment {
	private Tags tags;

	private Storages[] storages;

	private String flavour;

	public Tags getTags() {
		return tags;
	}

	public void setTags(Tags tags) {
		this.tags = tags;
	}

	public Storages[] getStorages() {
		return storages;
	}

	public void setStorages(Storages[] storages) {
		this.storages = storages;
	}

	public String getFlavour() {
		return flavour;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}
	
	public InstancesEnvironment() {
	}

	public InstancesEnvironment(Tags tags, Storages[] storages, String flavour) {
		super();
		this.tags = tags;
		this.storages = storages;
		this.flavour = flavour;
	}

	@Override
	public String toString() {
		return "Instances [tags=" + tags + ", storages=" + Arrays.toString(storages) + ", flavour=" + flavour + "]";
	}

}
