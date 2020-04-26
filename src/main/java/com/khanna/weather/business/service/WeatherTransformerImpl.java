package com.khanna.weather.business.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khanna.weather.business.utils.DateUtils;
import com.khanna.weather.business.weather.result.ExternalWeather;
import com.khanna.weather.business.weather.result.ExternalList;
import com.khanna.weather.business.weather.result.ExternalWeatherApiResult;
import com.khanna.weather.entity.DayDetail;
import com.khanna.weather.entity.Weather;

@Service
public class WeatherTransformerImpl implements WeatherTransformer {

	@Autowired
	WeatherApiService weatherApiService;

	@Override
	public void toTransform(Weather weather, ExternalWeatherApiResult externalWeatherApiResult) {
		weather.setCityName(externalWeatherApiResult.getExternalCity().getName());
		weather.setCountryName(externalWeatherApiResult.getExternalCity().getCountry());
		weather.setSunset(DateUtils.getDateText(externalWeatherApiResult.getExternalCity().getSunset()));
		weather.setSunrise(DateUtils.getDateText(externalWeatherApiResult.getExternalCity().getSunrise()));
		List<DayDetail> dayDetails = new ArrayList<>();

		List<ExternalList> externalLists = externalWeatherApiResult.getExternalList();

		for (ExternalList externalList : externalLists) {
			DayDetail dayDetail = new DayDetail();
			dayDetail.setDate(DateUtils.getDateText(externalList.getDt()));
			List<ExternalWeather> apiWeatherList = externalList.getExternalWeather();
			for (ExternalWeather externalWeather : apiWeatherList) {
				dayDetail.setCondition(externalWeather.getMain());
				dayDetail.setDescription(externalWeather.getDescription());
			}
			dayDetail.toString();
			dayDetails.add(dayDetail);
		}
		weather.setDayDetails(dayDetails);

	}

}
