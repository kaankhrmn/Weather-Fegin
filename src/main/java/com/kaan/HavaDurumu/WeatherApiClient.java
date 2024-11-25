package com.kaan.HavaDurumu;

import feign.Param;
import feign.RequestLine;

public interface WeatherApiClient {

    // İzmir'in hava durumu bilgisini almak için GET isteği
    @RequestLine("GET /data/2.5/weather?q={city}&appid={apiKey}&units=metric")
    WeatherResponse getWeatherByCity(@Param("city") String city, @Param("apiKey") String apiKey);
}

