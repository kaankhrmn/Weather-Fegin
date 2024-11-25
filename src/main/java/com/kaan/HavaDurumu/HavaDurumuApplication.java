package com.kaan.HavaDurumu;


public class HavaDurumuApplication {

	public static void main(String[] args) {
		WeatherService weatherService = new WeatherService();

		WeatherResponse response = weatherService.getWeather("Izmir");
		System.out.println("Şehir :"+ " " + response.getName());
		System.out.println("Sıcaklık :" + " " + response.getMain().getTemp()+"°C");
		System.out.println("Nem :" + " " + "%" + response.getMain().getHumidity());

	}

}
