package com.test.simulador.dto;

import org.codehaus.jackson.annotate.JsonProperty;

public class Databases {

	@JsonProperty("database_id")
	private String databaseId;

	private String kind;

	private Backup backup;

	private String size;

	public String getDatabaseId() {
		return databaseId;
	}

	public void setDatabaseId(String databaseId) {
		this.databaseId = databaseId;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public Backup getBackup() {
		return backup;
	}

	public void setBackup(Backup backup) {
		this.backup = backup;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Databases [databaseId=" + databaseId + ", kind=" + kind + ", backup=" + backup + ", size=" + size + "]";
	}

}
