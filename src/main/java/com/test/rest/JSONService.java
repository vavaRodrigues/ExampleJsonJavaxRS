package com.test.rest;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.security.RolesAllowed;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;

import com.test.Music;
import com.test.Track;


@Path("/json/music")
public class JSONService {

	private static Logger logger = Logger.getLogger(JSONService.class);
	
	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Track> getTrackInJSON() {
		logger.info("Até aqui ok");
		
		ArrayList<Track> track = new ArrayList<Track>();
		track.add(new Track("Enter Sandman","Metallica"));
		track.add(new Track("The Unforgiven","Metallica"));

		return track;

	}

	@POST
	@Path("/post")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createTrackInJSON(Music music) {

		String result = "Track saved : " + music.getTrack().get(0).getSinger();
		
		for (int i = 0; i < music.getTrack().size(); i++) {
			System.out.println("Title: "+music.getTrack().get(i).getTitle());
		}
		
		return Response.status(201).entity(result).build();
		
	}
	
}