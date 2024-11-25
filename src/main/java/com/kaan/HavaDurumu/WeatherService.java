package com.kaan.HavaDurumu;

import feign.Feign;
import feign.gson.GsonDecoder;

public class WeatherService {

    WeatherApiClient weatherClient = Feign.builder()
            .decoder(new GsonDecoder())
            .target(WeatherApiClient.class,"https://api.openweathermap.org");


    public WeatherResponse getWeather(String city) {
        return weatherClient.getWeatherByCity(city, "29049fa06253ceafe66fc06d6fd3139b");
    }
}
