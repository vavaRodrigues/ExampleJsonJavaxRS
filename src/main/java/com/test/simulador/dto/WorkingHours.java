package com.test.simulador.dto;

public class WorkingHours {

	private Hours hours;

	private String stage;

	public Hours getHours() {
		return hours;
	}

	public void setHours(Hours hours) {
		this.hours = hours;
	}

	public String getStage() {
		return stage;
	}

	public void setStage(String stage) {
		this.stage = stage;
	}

	public WorkingHours(Hours hours, String stage) {
		super();
		this.hours = hours;
		this.stage = stage;
	}

	@Override
	public String toString() {
		return "WorkingHours [hours=" + hours + ", stage=" + stage + "]";
	}

}
