package com.test.rest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;
import com.test.Music;
import com.test.Track;
import com.test.dto.ProxyRequestInfo;

@Path("/json/music")
public class JSONService {
	@Context
	UriInfo uri;

	@Context
	HttpServletRequest request;

	private static final String CSV_SEPARATOR = ",";
	
	
	@POST
	@Path("/clouds/{customerId}/products/{productId}/topologies/{topologyId}/actions/{action}")
	public String topologyAction() throws Exception {
		String a = "";
		 genericHandler();
		 
		 return a;
	}
	
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
	@Path("/upload")
	@Consumes(MediaType.MULTIPART_FORM_DATA)
	public Response uploadFile(@FormDataParam("file") InputStream uploadedInputStream, @FormDataParam("file") FormDataContentDisposition fileDetail) {

		String uploadedFileLocation = "d://uploaded/" + fileDetail.getFileName();
		
		System.out.println();
		System.out.println(fileDetail.getName());
		// save it
		//writeToFile(uploadedInputStream, uploadedFileLocation);

		//String output = "File uploaded to : " + uploadedFileLocation;

		return Response.status(200).entity("").build();

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
    
    
    private Response genericHandler() throws Exception {

		String customerId = uri.getPathParameters().getFirst("customerId");
		String actionId = uri.getPathParameters().getFirst("action");
		String topologyId = uri.getPathParameters().getFirst("topologyId");
		String serviceId = uri.getPathParameters().getFirst("serviceId");
		String productId = uri.getPathParameters().getFirst("productId");
		
		StringBuilder fullPath = new StringBuilder();
		fullPath.append(uri.getPath());
		fullPath.append("?");
		for (String key : uri.getQueryParameters().keySet()) {
			fullPath.append(key + "=" + uri.getQueryParameters().getFirst(key));
			fullPath.append("&");
		}
	
		ProxyRequestInfo requestInfo = new ProxyRequestInfo().setMethod(request.getMethod()).setCustomerId(customerId)
				.setActionId(actionId).setUri(fullPath.toString()).setTopologyId(topologyId).setServiceId(serviceId)
				.setProductId(productId);
	
		if (request.getMethod().equalsIgnoreCase("get") == false) {
			InputStream stream = request.getInputStream();
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			byte[] buf = new byte[1000];
			for (int nChunk = stream.read(buf); nChunk != -1; nChunk = stream.read(buf)) {
				out.write(buf, 0, nChunk);
			}
			out.flush();
			System.out.println(out.toString());
			requestInfo.setBody(out.toByteArray()).setContentType(request.getContentType());
			out.close();
			stream.close();
		}
		String resp = doGenericRequest(requestInfo);
		return Response.ok("{\"content\" : " + resp + "}").build();
	}
    
    public String doGenericRequest(ProxyRequestInfo request) throws Exception {

		String requestUrl = getRequestURL(request);
		
		if (request.body != null && request.body.length < 2000) {
			System.out.println("BODY: " + new String(request.body));
		}

	
		return request(request.method, requestUrl, request.contentType, request.body);
	}
    
    public String request(String type, String url, String contentType, byte[] body) throws Exception {

		URL request = new URL(url);

		HttpURLConnection conn = (HttpURLConnection) request.openConnection();

		conn.setRequestMethod(type);

		if (body != null && body.length > 0) {
			conn.setRequestProperty("Content-Type", contentType);
			conn.setRequestProperty("Content-Length", String.valueOf(body.length));
			conn.setDoOutput(true);
			conn.getOutputStream().write(body);
		}

		int responseCode = conn.getResponseCode();

		BufferedReader in;
		try {
			in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		}
		catch (IOException e) {
			in = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
		}
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();
		conn.disconnect();

		String resp = response.toString();


		return resp;
	}
    
    private String getRequestURL(ProxyRequestInfo request) throws Exception {
		StringBuilder fullPath = new StringBuilder("");
		fullPath.append(request.uri);
		return fullPath.toString();
	}
	
}