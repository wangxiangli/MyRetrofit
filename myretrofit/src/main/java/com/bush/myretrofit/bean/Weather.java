package com.bush.myretrofit.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by 嘉华盛世 on 2016-07-16.
 */
public class Weather {

    /**
     * msg : success
     * result : [{"airCondition":"优","city":"南京","coldIndex":"低发期","date":"2016-07-16","distrct":"南京","dressingIndex":"薄短袖类","exerciseIndex":"不太适宜","future":[{"date":"2016-07-16","dayTime":"多云","night":"多云","temperature":"30°C / 23°C","week":"今天","wind":"西风 3～4级"},{"date":"2016-07-17","dayTime":"多云","night":"多云","temperature":"32°C / 25°C","week":"星期日","wind":"西南风 3～4级"},{"date":"2016-07-18","dayTime":"雷阵雨","night":"雷阵雨","temperature":"30°C / 26°C","week":"星期一","wind":"东南风 3～4级"},{"date":"2016-07-19","dayTime":"雷阵雨","night":"雷阵雨","temperature":"30°C / 27°C","week":"星期二","wind":"东南风 3～4级"},{"date":"2016-07-20","dayTime":"雷阵雨","night":"雷阵雨","temperature":"29°C / 25°C","week":"星期三","wind":"西南风 3～4级"},{"date":"2016-07-21","dayTime":"雷阵雨","night":"雷阵雨","temperature":"29°C / 24°C","week":"星期四","wind":"西南风 3～4级"},{"date":"2016-07-22","dayTime":"零散雷雨","night":"雷雨","temperature":"29°C / 24°C","week":"星期五","wind":"西南偏西风 3级"},{"date":"2016-07-23","dayTime":"零散雷雨","night":"零散雷雨","temperature":"29°C / 24°C","week":"星期六","wind":"西南风 3级"},{"date":"2016-07-24","dayTime":"零散雷雨","night":"零散雷雨","temperature":"28°C / 23°C","week":"星期日","wind":"西南偏西风 2级"},{"date":"2016-07-25","dayTime":"局部雷雨","night":"雷雨","temperature":"29°C / 24°C","week":"星期一","wind":"西南偏西风 2级"}],"humidity":"湿度：82%","pollutionIndex":"27","province":"江苏","sunrise":"05:10","sunset":"19:12","temperature":"22℃","time":"06:11","updateTime":"20160716062600","washIndex":"不适宜","weather":"阴","week":"周六","wind":"西风2级"}]
     * retCode : 200
     */

    @SerializedName("msg")
    private String msg;
    @SerializedName("retCode")
    private String retCode;
    /**
     * airCondition : 优
     * city : 南京
     * coldIndex : 低发期
     * date : 2016-07-16
     * distrct : 南京
     * dressingIndex : 薄短袖类
     * exerciseIndex : 不太适宜
     * future : [{"date":"2016-07-16","dayTime":"多云","night":"多云","temperature":"30°C / 23°C","week":"今天","wind":"西风 3～4级"},{"date":"2016-07-17","dayTime":"多云","night":"多云","temperature":"32°C / 25°C","week":"星期日","wind":"西南风 3～4级"},{"date":"2016-07-18","dayTime":"雷阵雨","night":"雷阵雨","temperature":"30°C / 26°C","week":"星期一","wind":"东南风 3～4级"},{"date":"2016-07-19","dayTime":"雷阵雨","night":"雷阵雨","temperature":"30°C / 27°C","week":"星期二","wind":"东南风 3～4级"},{"date":"2016-07-20","dayTime":"雷阵雨","night":"雷阵雨","temperature":"29°C / 25°C","week":"星期三","wind":"西南风 3～4级"},{"date":"2016-07-21","dayTime":"雷阵雨","night":"雷阵雨","temperature":"29°C / 24°C","week":"星期四","wind":"西南风 3～4级"},{"date":"2016-07-22","dayTime":"零散雷雨","night":"雷雨","temperature":"29°C / 24°C","week":"星期五","wind":"西南偏西风 3级"},{"date":"2016-07-23","dayTime":"零散雷雨","night":"零散雷雨","temperature":"29°C / 24°C","week":"星期六","wind":"西南风 3级"},{"date":"2016-07-24","dayTime":"零散雷雨","night":"零散雷雨","temperature":"28°C / 23°C","week":"星期日","wind":"西南偏西风 2级"},{"date":"2016-07-25","dayTime":"局部雷雨","night":"雷雨","temperature":"29°C / 24°C","week":"星期一","wind":"西南偏西风 2级"}]
     * humidity : 湿度：82%
     * pollutionIndex : 27
     * province : 江苏
     * sunrise : 05:10
     * sunset : 19:12
     * temperature : 22℃
     * time : 06:11
     * updateTime : 20160716062600
     * washIndex : 不适宜
     * weather : 阴
     * week : 周六
     * wind : 西风2级
     */

    @SerializedName("result")
    private List<ResultBean> result;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getRetCode() {
        return retCode;
    }

    public void setRetCode(String retCode) {
        this.retCode = retCode;
    }

    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

}
