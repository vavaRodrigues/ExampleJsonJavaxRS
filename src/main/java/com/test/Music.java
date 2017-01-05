package com.test;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

public class Music {
	
	
	@JsonProperty("music")
	private List<Track> track;

	public List<Track> getTrack() {
		return track;
	}

	public void setTrack(List<Track> track) {
		this.track = track;
	}
	
}
