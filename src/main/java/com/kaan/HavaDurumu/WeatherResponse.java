package com.kaan.HavaDurumu;

import com.sun.tools.javac.Main;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class WeatherResponse {

    private Main main;
    private String name;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Main{
        private double temp;
        private double humidity;
    }
}
