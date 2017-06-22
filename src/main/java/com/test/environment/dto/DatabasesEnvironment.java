package com.test.environment.dto;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE,
setterVisibility=JsonAutoDetect.Visibility.NONE, creatorVisibility=JsonAutoDetect.Visibility.NONE)
public class DatabasesEnvironment {
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
	
	public DatabasesEnvironment() {
	}

	public DatabasesEnvironment(Tags tags, String engine, String storageSize, String flavour) {
		super();
		this.tags = tags;
		this.engine = engine;
		this.storageSize = storageSize;
		this.flavour = flavour;
	}

	@Override
	public String toString() {
		return "Databases [tags=" + tags + ", engine=" + engine + ", storageSize=" + storageSize + ", flavour="
				+ flavour + "]";
	}

}
