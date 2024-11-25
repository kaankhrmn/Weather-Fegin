package com.kaan.HavaDurumu;

import feign.Feign;
import feign.gson.GsonDecoder;

public class WeatherService {

    WeatherApiClient weatherClient = Feign.builder()
            .decoder(new GsonDecoder())
            .target(WeatherApiClient.class,"https://api.openweathermap.org");


    public WeatherResponse getWeather(String city) {
        return weatherClient.getWeatherByCity(city, "your_api_key");
    }
}
