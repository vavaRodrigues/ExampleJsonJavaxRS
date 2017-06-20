package com.test.simulador.dto;

import java.util.Arrays;

import org.codehaus.jackson.annotate.JsonProperty;

public class Predictability {

	@JsonProperty("scheduled_additional_load")
	private String scheduledAdditionalLoad;

	@JsonProperty("additional_load_alert_value")
	private String additionalLoadAlertValue;

	@JsonProperty("additional_load")
	private String additionalLoad;

	@JsonProperty("additional_load_limit")
	private String additionalLoadLimit;

	@JsonProperty("additional_days")
	private String[] additionalDays;

	public String getScheduledAdditionalLoad() {
		return scheduledAdditionalLoad;
	}

	public void setScheduledAdditionalLoad(String scheduledAdditionalLoad) {
		this.scheduledAdditionalLoad = scheduledAdditionalLoad;
	}

	public String getAdditionalLoadAlertValue() {
		return additionalLoadAlertValue;
	}

	public void setAdditionalLoadAlertValue(String additionalLoadAlertValue) {
		this.additionalLoadAlertValue = additionalLoadAlertValue;
	}

	public String getAdditionalLoad() {
		return additionalLoad;
	}

	public void setAdditionalLoad(String additionalLoad) {
		this.additionalLoad = additionalLoad;
	}

	public String getAdditionalLoadLimit() {
		return additionalLoadLimit;
	}

	public void setAdditionalLoadLimit(String additionalLoadLimit) {
		this.additionalLoadLimit = additionalLoadLimit;
	}

	public String[] getAdditionalDays() {
		return additionalDays;
	}

	public void setAdditionalDays(String[] additionalDays) {
		this.additionalDays = additionalDays;
	}

	@Override
	public String toString() {
		return "Predictability [scheduledAdditionalLoad=" + scheduledAdditionalLoad + ", additionalLoadAlertValue="
				+ additionalLoadAlertValue + ", additionalLoad=" + additionalLoad + ", additionalLoadLimit="
				+ additionalLoadLimit + ", additionalDays=" + Arrays.toString(additionalDays) + "]";
	}

}
