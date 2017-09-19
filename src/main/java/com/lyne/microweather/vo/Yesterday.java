package com.lyne.microweather.vo;

import java.io.Serializable;

/**
 * @author nn_liu
 * @Created 2017-09-19-15:49
 */

public class Yesterday implements Serializable {

    private static final long serialVersionID = 1L;

    // 日期
    private String date;

    // 最高温度
    private String high;

    // 风向
    private String fx;

    // 最低温度
    private String low;

    // 风向
    private String fl;

    // 天气类型
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

    public String getFx() {
        return fx;
    }

    public void setFx(String fx) {
        this.fx = fx;
    }

    public String getLow() {
        return low;
    }

    public void setLow(String low) {
        this.low = low;
    }

    public String getFl() {
        return fl;
    }

    public void setFl(String fl) {
        this.fl = fl;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
