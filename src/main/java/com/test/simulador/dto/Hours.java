package com.test.simulador.dto;

import java.util.Arrays;

public class Hours {

	private String[] sat;

	private String[] thu;

	private String[] wed;

	private String[] mon;

	private String[] tue;

	private String[] sun;

	private String[] fri;

	public String[] getSat() {
		return sat;
	}

	public void setSat(String[] sat) {
		this.sat = sat;
	}

	public String[] getThu() {
		return thu;
	}

	public void setThu(String[] thu) {
		this.thu = thu;
	}

	public String[] getWed() {
		return wed;
	}

	public void setWed(String[] wed) {
		this.wed = wed;
	}

	public String[] getMon() {
		return mon;
	}

	public void setMon(String[] mon) {
		this.mon = mon;
	}

	public String[] getTue() {
		return tue;
	}

	public void setTue(String[] tue) {
		this.tue = tue;
	}

	public String[] getSun() {
		return sun;
	}

	public void setSun(String[] sun) {
		this.sun = sun;
	}

	public String[] getFri() {
		return fri;
	}

	public void setFri(String[] fri) {
		this.fri = fri;
	}

	public Hours(String[] sat, String[] thu, String[] wed, String[] mon, String[] tue, String[] sun, String[] fri) {
		super();
		this.sat = sat;
		this.thu = thu;
		this.wed = wed;
		this.mon = mon;
		this.tue = tue;
		this.sun = sun;
		this.fri = fri;
	}

	@Override
	public String toString() {
		return "Hours [sat=" + Arrays.toString(sat) + ", thu=" + Arrays.toString(thu) + ", wed=" + Arrays.toString(wed)
				+ ", mon=" + Arrays.toString(mon) + ", tue=" + Arrays.toString(tue) + ", sun=" + Arrays.toString(sun)
				+ ", fri=" + Arrays.toString(fri) + "]";
	}

}
