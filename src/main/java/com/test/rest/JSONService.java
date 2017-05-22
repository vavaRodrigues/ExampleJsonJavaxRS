package com.test.rest;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import com.test.Music;
import com.test.Track;

@Path("/json/music")
public class JSONService {
	@Context
	UriInfo uri;

	private static final String CSV_SEPARATOR = ",";
	
	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Track> getTrackInJSON() {
		
		ArrayList<Track> track = new ArrayList<Track>();
		track.add(new Track("Enter Sandman","Metallica"));
		track.add(new Track("The Unforgiven","Metallica"));
		
		writeToCSV(track);
		
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
	
	@GET
	@Path("/url")
	@Produces(MediaType.APPLICATION_JSON)
	public Response Teste() {
		
		StringBuilder fullPath = new StringBuilder();
		fullPath.append(uri.getPath());
		fullPath.append("?");
		for (String key : uri.getQueryParameters().keySet()) {
			fullPath.append(key + "=" + uri.getQueryParameters().getFirst(key));
			fullPath.append("&");
		}
		
		
		System.out.println("teste");

		return Response.status(201).entity("OK").build();

	}
	
    private void writeToCSV(ArrayList<Track> trackList)
    {
        try
        {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("/home/vava/workspace/ExampleJsonJavaxRS/track.csv"), "UTF-8"));
            for (Track track : trackList)
            {
                StringBuffer oneLine = new StringBuffer();
                oneLine.append(track.getTitle().trim().length() <=0 ? "" : track.getTitle());
                oneLine.append(CSV_SEPARATOR);
                oneLine.append(track.getSinger().trim().length() == 0? "" : track.getSinger());
                oneLine.append(CSV_SEPARATOR);
                bw.write(oneLine.toString());
                bw.newLine();
            }
            bw.flush();
            bw.close();
        }
        catch (UnsupportedEncodingException e) {}
        catch (FileNotFoundException e){}
        catch (IOException e){}
    }

	
}