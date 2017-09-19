package com.lyne.microweather.vo;

import java.io.Serializable;
import java.util.List;

/**
 * @author nn_liu
 * @Created 2017-09-19-15:36
 */

public class Weather implements Serializable {

    private static final long serialVersionID = 1L;

    // 城市名称
    private String city;

    // 空气指数
    private String aqi;

    // 温度
    private String wendu;

    // 感冒指数
    private String ganmao;

    // 昨日天气
    private Yesterday yesterday;

    // 未来天气
    private List<Forecast> forecast;


    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAqi() {
        return aqi;
    }

    public void setAqi(String aqi) {
        this.aqi = aqi;
    }

    public String getWendu() {
        return wendu;
    }

    public void setWendu(String wendu) {
        this.wendu = wendu;
    }

    public String getGanmao() {
        return ganmao;
    }

    public void setGanmao(String ganmao) {
        this.ganmao = ganmao;
    }

    public Yesterday getYesterday() {
        return yesterday;
    }

    public void setYesterday(Yesterday yesterday) {
        this.yesterday = yesterday;
    }

    public List<Forecast> getForecast() {
        return forecast;
    }

    public void setForecast(List<Forecast> forecast) {
        this.forecast = forecast;
    }
}
