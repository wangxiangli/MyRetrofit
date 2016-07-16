package com.bush.myretrofit.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public  class ResultBean {
        @SerializedName("airCondition")
        private String airCondition;
        @SerializedName("city")
        private String city;
        @SerializedName("coldIndex")
        private String coldIndex;
        @SerializedName("date")
        private String date;
        @SerializedName("distrct")
        private String distrct;
        @SerializedName("dressingIndex")
        private String dressingIndex;
        @SerializedName("exerciseIndex")
        private String exerciseIndex;
        @SerializedName("humidity")
        private String humidity;
        @SerializedName("pollutionIndex")
        private String pollutionIndex;
        @SerializedName("province")
        private String province;
        @SerializedName("sunrise")
        private String sunrise;
        @SerializedName("sunset")
        private String sunset;
        @SerializedName("temperature")
        private String temperature;
        @SerializedName("time")
        private String time;
        @SerializedName("updateTime")
        private String updateTime;
        @SerializedName("washIndex")
        private String washIndex;
        @SerializedName("weather")
        private String weather;
        @SerializedName("week")
        private String week;
        @SerializedName("wind")
        private String wind;
        /**
         * date : 2016-07-16
         * dayTime : 多云
         * night : 多云
         * temperature : 30°C / 23°C
         * week : 今天
         * wind : 西风 3～4级
         */

        @SerializedName("future")
        private List<FutureBean> future;

        public String getAirCondition() {
            return airCondition;
        }

        public void setAirCondition(String airCondition) {
            this.airCondition = airCondition;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getColdIndex() {
            return coldIndex;
        }

        public void setColdIndex(String coldIndex) {
            this.coldIndex = coldIndex;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getDistrct() {
            return distrct;
        }

        public void setDistrct(String distrct) {
            this.distrct = distrct;
        }

        public String getDressingIndex() {
            return dressingIndex;
        }

        public void setDressingIndex(String dressingIndex) {
            this.dressingIndex = dressingIndex;
        }

        public String getExerciseIndex() {
            return exerciseIndex;
        }

        public void setExerciseIndex(String exerciseIndex) {
            this.exerciseIndex = exerciseIndex;
        }

        public String getHumidity() {
            return humidity;
        }

        public void setHumidity(String humidity) {
            this.humidity = humidity;
        }

        public String getPollutionIndex() {
            return pollutionIndex;
        }

        public void setPollutionIndex(String pollutionIndex) {
            this.pollutionIndex = pollutionIndex;
        }

        public String getProvince() {
            return province;
        }

        public void setProvince(String province) {
            this.province = province;
        }

        public String getSunrise() {
            return sunrise;
        }

        public void setSunrise(String sunrise) {
            this.sunrise = sunrise;
        }

        public String getSunset() {
            return sunset;
        }

        public void setSunset(String sunset) {
            this.sunset = sunset;
        }

        public String getTemperature() {
            return temperature;
        }

        public void setTemperature(String temperature) {
            this.temperature = temperature;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
        }

        public String getWashIndex() {
            return washIndex;
        }

        public void setWashIndex(String washIndex) {
            this.washIndex = washIndex;
        }

        public String getWeather() {
            return weather;
        }

        public void setWeather(String weather) {
            this.weather = weather;
        }

        public String getWeek() {
            return week;
        }

        public void setWeek(String week) {
            this.week = week;
        }

        public String getWind() {
            return wind;
        }

        public void setWind(String wind) {
            this.wind = wind;
        }

        public List<FutureBean> getFuture() {
            return future;
        }

        public void setFuture(List<FutureBean> future) {
            this.future = future;
        }


    }