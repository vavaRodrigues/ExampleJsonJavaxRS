package com.test.environment.dto;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE,
setterVisibility=JsonAutoDetect.Visibility.NONE, creatorVisibility=JsonAutoDetect.Visibility.NONE)
public class ProviderParams {
	@JsonProperty("totvs_cloud_project_id")
	private String totvsCloudProjectId;

	public String getTotvsCloudProjectId() {
		return totvsCloudProjectId;
	}

	public void setTotvsCloudProjectId(String totvsCloudProjectId) {
		this.totvsCloudProjectId = totvsCloudProjectId;
	}
	
	public ProviderParams() {
	}

	public ProviderParams(String totvsCloudProjectId) {
		super();
		this.totvsCloudProjectId = totvsCloudProjectId;
	}

	@Override
	public String toString() {
		return "ProviderParams [totvsCloudProjectId=" + totvsCloudProjectId + "]";
	}

}
