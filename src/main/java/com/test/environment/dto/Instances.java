package com.test.environment.dto;

import java.util.Arrays;

public class Instances {
	private Tags tags;
	private String flavour;
	private Storages[] storages;

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

	public Instances() {

	}

	public Instances(Tags tags, String flavour, Storages[] storages) {
		super();
		this.tags = tags;
		this.flavour = flavour;
		this.storages = storages;
	}

	@Override
	public String toString() {
		return "InstancesEnvironment [tags=" + tags + ", flavour=" + flavour + ", storages="
				+ Arrays.toString(storages) + "]";
	}

}
