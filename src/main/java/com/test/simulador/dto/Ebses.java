package com.test.simulador.dto;

import org.codehaus.jackson.annotate.JsonProperty;

public class Ebses {

	private String device;

	@JsonProperty("storage_type")
	private String storageType;

	private String size;

	public String getDevice() {
		return device;
	}

	public void setDevice(String device) {
		this.device = device;
	}

	public String getStorageType() {
		return storageType;
	}

	public void setStorageType(String storageType) {
		this.storageType = storageType;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Ebses [device=" + device + ", storageType=" + storageType + ", size=" + size + "]";
	}

}
