package com.khanna.weather.business.service;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.khanna.weather.business.weather.result.ExternalWeatherApiResult;

@Service
public class WeatherApiServiceImpl implements WeatherApiService {

	@Value("${weather.api.url}")
	private String API_URL;

	@Value("${weather.api.appid}")
	private String APP_ID;

	@Override
	public ResponseEntity<ExternalWeatherApiResult> getCountryWeather(String countryName)
			throws UnsupportedEncodingException {
		String name = URLEncoder.encode(countryName, "UTF-8");
		UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromHttpUrl(API_URL).queryParam("q", name)
				.queryParam("appid", APP_ID);
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<ExternalWeatherApiResult> response = restTemplate.exchange(uriBuilder.toUriString(),
				HttpMethod.GET, null, ExternalWeatherApiResult.class);
		return response;

	}

}
