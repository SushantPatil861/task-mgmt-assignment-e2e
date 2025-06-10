package com.assignment.lambda;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.LocalDate;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class OverdueTaskNotifier implements RequestHandler<Object, String> {

    @Override
    public String handleRequest(Object input, Context context) {
    	String today = LocalDate.now().toString();
    	// TODO: update below URL domain
        String urlString = "http://localhost:8090/api/v1/tasks?dueBefore=" + today + "&completed=false";

		try(HttpClient client = HttpClient.newHttpClient())
		{
	        HttpRequest request = HttpRequest.newBuilder()
	                .uri(URI.create(urlString))
	                .GET()
	                .build();

	        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
	        String responseBody = response.body();
	        System.out.println("Response: " + responseBody);

	        return "Task fetch successful";
		}
		catch (Exception e)
		{
			return "Task fetch failed";
		}
    }
}
