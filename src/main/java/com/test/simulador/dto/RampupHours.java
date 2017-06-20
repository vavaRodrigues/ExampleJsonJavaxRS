package com.test.simulador.dto;

public class RampupHours {

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

	@Override
	public String toString() {
		return "RampupHours [hours=" + hours + ", stage=" + stage + "]";
	}

}
