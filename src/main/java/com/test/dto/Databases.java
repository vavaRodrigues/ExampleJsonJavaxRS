package com.test.dto;


import org.codehaus.jackson.annotate.JsonProperty;

public class Databases {
	private Tags tags;

	private String engine;

	@JsonProperty("storage_size")
	private String storageSize;

	private String flavour;

	public Tags getTags() {
		return tags;
	}

	public void setTags(Tags tags) {
		this.tags = tags;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getStorageSize() {
		return storageSize;
	}

	public void setStorageSize(String storageSize) {
		this.storageSize = storageSize;
	}

	public String getFlavour() {
		return flavour;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	@Override
	public String toString() {
		return "Databases [tags=" + tags + ", engine=" + engine + ", storageSize=" + storageSize + ", flavour="
				+ flavour + "]";
	}

}
