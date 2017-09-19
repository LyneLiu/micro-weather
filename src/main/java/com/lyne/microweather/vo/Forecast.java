package com.lyne.microweather.vo;

import java.io.Serializable;

/**
 * @desc forecast和yesterday的数据属性一致
 *
 * @author nn_liu
 * @Created 2017-09-19-15:49
 */

public class Forecast implements Serializable {

    private static final long serialVersionID = 1L;

    private String date;

    private String high;

    private String fengxiang;

    private String low;

    private String fengli;

    private String type;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHigh() {
        return high;
    }

    public void setHigh(String high) {
        this.high = high;
    }

    public String getFengxiang() {
        return fengxiang;
    }

    public void setFengxiang(String fengxiang) {
        this.fengxiang = fengxiang;
    }

    public String getLow() {
        return low;
    }

    public void setLow(String low) {
        this.low = low;
    }

    public String getFengli() {
        return fengli;
    }

    public void setFengli(String fengli) {
        this.fengli = fengli;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
