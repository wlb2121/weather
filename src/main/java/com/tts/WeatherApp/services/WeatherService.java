package com.tts.WeatherApp.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import com.tts.WeatherApp.model.Response;

@Service
public class WeatherService {
    @Value("${api_key}")
    private String apiKey;
    public Response getForecast(String zipCode) {
        String url = "http://api.openweathermap.org/data/2.5/weather?zip=" + 
            zipCode + "&units=imperial&appid=" + apiKey;
        RestTemplate restTemplate = new RestTemplate();
        try{
			return restTemplate.getForObject(url, Response.class);
		}catch(HttpClientErrorException e){
			Response response = new Response();
			response.setName("ERROR");
			return response;
		}

    }
}
