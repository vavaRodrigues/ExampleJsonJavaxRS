package com.test.environment.dto;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE, creatorVisibility = JsonAutoDetect.Visibility.NONE)
public class Databases {

	private Tags tags;
	private String flavour;
	private String engine;
	@JsonProperty("storage_size")
	private int storageSize;

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

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public int getStorageSize() {
		return storageSize;
	}

	public void setStorageSize(int storageSize) {
		this.storageSize = storageSize;
	}

	public Databases() {
	}

	public Databases(Tags tags, String flavour, String engine, int storageSize) {
		super();
		this.tags = tags;
		this.flavour = flavour;
		this.engine = engine;
		this.storageSize = storageSize;
	}

	@Override
	public String toString() {
		return "Databases [tags=" + tags + ", flavour=" + flavour + ", engine=" + engine + ", storageSize="
				+ storageSize + "]";
	}

}
