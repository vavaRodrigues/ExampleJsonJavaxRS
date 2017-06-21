package com.test.dto;

public class Storages {
	private Tags tags;

	private String additional;

	private String type;

	private String size;

	public Tags getTags() {
		return tags;
	}

	public void setTags(Tags tags) {
		this.tags = tags;
	}

	public String getAdditional() {
		return additional;
	}

	public void setAdditional(String additional) {
		this.additional = additional;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public Storages(Tags tags, String additional, String type, String size) {
		super();
		this.tags = tags;
		this.additional = additional;
		this.type = type;
		this.size = size;
	}

	@Override
	public String toString() {
		return "Storages [tags=" + tags + ", additional=" + additional + ", type=" + type + ", size=" + size + "]";
	}

}
