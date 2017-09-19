package com.lyne.microweather.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lyne.microweather.vo.WeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

/**
 * @author nn_liu
 * @Created 2017-09-19-16:21
 */

@Service
public class WeatherDataServiceImpl implements WeatherDataService {

    @Autowired
    private RestTemplate restTemplate;

    private final static String WEATHER_API = "http://wthrcdn.etouch.cn/weather_mini";

    private final static String CITY_ID_CONST = "?citykey=";

    private final static String CITY_NAME_CONST = "?city=";

    @Override public WeatherResponse getDataByCityId(String cityId) {
        String uri = WEATHER_API + CITY_ID_CONST + cityId;
        return doGetWeatherData(uri);
    }

    @Override public WeatherResponse getDataByCityName(String cityName) {
        String uri = WEATHER_API + CITY_NAME_CONST + cityName;
        return doGetWeatherData(uri);
    }

    private WeatherResponse doGetWeatherData(String uri){
        ResponseEntity<String> response = restTemplate.getForEntity(uri, String.class);

        String strBody = null;

        if (response.getStatusCodeValue() == 200){
            strBody = response.getBody();
        }

        ObjectMapper mapper = new ObjectMapper();
        WeatherResponse weatherResponse = null;

        try {
            weatherResponse = mapper.readValue(strBody, WeatherResponse.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return weatherResponse;
    }
}
