package com.lyne.microweather.service;

import com.lyne.microweather.vo.WeatherResponse;

/**
 * @author nn_liu
 * @Created 2017-09-19-16:15
 */

public interface WeatherDataService {

    /**
     * 根据城市Id获取天气数据
     * @param cityId
     * @return
     */
    WeatherResponse getDataByCityId(String cityId);

    /**
     * 根据城市名称获取天气数据
     * @param cityName
     * @return
     */
    WeatherResponse getDataByCityName(String cityName);

}
