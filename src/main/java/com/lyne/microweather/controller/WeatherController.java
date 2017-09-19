package com.lyne.microweather.controller;

import com.lyne.microweather.service.WeatherDataService;
import com.lyne.microweather.vo.WeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author nn_liu
 * @Created 2017-09-19-16:47
 */
@RestController
@RequestMapping("/weather")
public class WeatherController {

    @Autowired
    private WeatherDataService weatherDataService;

    @GetMapping("/cityId/{cityId}")
    public WeatherResponse getReportByCityId(@PathVariable("cityId") String cityId) {
        return weatherDataService.getDataByCityId(cityId);
    }

    @GetMapping("/cityName/{cityName}")
    public WeatherResponse getReportByCityName(@PathVariable("cityName") String cityName) {
        return weatherDataService.getDataByCityName(cityName);
    }

}
