package com.test.simulador.dto;

public class Manifest {

	private Hardware hardware;

	private String stage;

	public Hardware getHardware() {
		return hardware;
	}

	public void setHardware(Hardware hardware) {
		this.hardware = hardware;
	}

	public String getStage() {
		return stage;
	}

	public void setStage(String stage) {
		this.stage = stage;
	}

	@Override
	public String toString() {
		return "Manifest [hardware=" + hardware + ", stage=" + stage + "]";
	}

}
