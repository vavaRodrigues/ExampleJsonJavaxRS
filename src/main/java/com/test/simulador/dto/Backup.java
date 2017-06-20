package com.test.simulador.dto;

public class Backup {
	private String interval;

	private String size;

	public String getInterval() {
		return interval;
	}

	public void setInterval(String interval) {
		this.interval = interval;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Backup [interval=" + interval + ", size=" + size + "]";
	}

}
