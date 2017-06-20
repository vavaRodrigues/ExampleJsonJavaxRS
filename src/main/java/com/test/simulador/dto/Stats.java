package com.test.simulador.dto;

import org.codehaus.jackson.annotate.JsonProperty;

public class Stats {

	@JsonProperty("network_transfer")
	private String networkTransfer;

	private String volume;

	private String database;

	private String backup;

	public String getNetworkTransfer() {
		return networkTransfer;
	}

	public void setNetworkTransfer(String networkTransfer) {
		this.networkTransfer = networkTransfer;
	}

	public String getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}

	public String getDatabase() {
		return database;
	}

	public void setDatabase(String database) {
		this.database = database;
	}

	public String getBackup() {
		return backup;
	}

	public void setBackup(String backup) {
		this.backup = backup;
	}

	@Override
	public String toString() {
		return "Stats [networkTransfer=" + networkTransfer + ", volume=" + volume + ", database=" + database
				+ ", backup=" + backup + "]";
	}

}
