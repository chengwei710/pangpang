package com.conway.pangpang.integration.ws;

import com.conway.pangpang.integration.ws.weather.GetAutomaticTodayWeather;
import com.conway.pangpang.integration.ws.weather.ObjectFactory;
import com.conway.pangpang.integration.ws.weather.WeatherService;
import com.conway.pangpang.integration.ws.weather.WeatherServiceSoap;

public class IntegrationMainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ObjectFactory of = new ObjectFactory();
//		GetAutomaticTodayWeather todayService = of.createGetAutomaticTodayWeather();
//		todayService.
		WeatherService ws = new WeatherService();
		WeatherServiceSoap weatherServiceSoap = ws.getWeatherServiceSoap();
		weatherServiceSoap.getRealTimeWeatherByCityName("Shanghai", "MAC");
		
	}

}
