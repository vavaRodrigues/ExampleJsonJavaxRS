package com.test.environment.dto;

public class Storages {

	private Tags tags;
	private String type;
	private int size;
	private boolean additional;

	public void setTags(Tags tags) {
		this.tags = tags;
	}

	public Tags getTags() {
		return tags;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	public void setAdditional(boolean additional) {
		this.additional = additional;
	}

	public boolean getAdditional() {
		return additional;
	}

	@Override
	public String toString() {
		return "Storages [tags=" + tags + ", type=" + type + ", size=" + size + ", additional=" + additional + "]";
	}

	public Storages() {
	}

	public Storages(Tags tags, String type, int size, boolean additional) {
		super();
		this.tags = tags;
		this.type = type;
		this.size = size;
		this.additional = additional;
	}

}