package com.bush.myretrofit.bean;

import com.google.gson.annotations.SerializedName;

public  class FutureBean {
            @SerializedName("date")
            private String date;
            @SerializedName("dayTime")
            private String dayTime;
            @SerializedName("night")
            private String night;
            @SerializedName("temperature")
            private String temperature;
            @SerializedName("week")
            private String week;
            @SerializedName("wind")
            private String wind;

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getDayTime() {
                return dayTime;
            }

            public void setDayTime(String dayTime) {
                this.dayTime = dayTime;
            }

            public String getNight() {
                return night;
            }

            public void setNight(String night) {
                this.night = night;
            }

            public String getTemperature() {
                return temperature;
            }

            public void setTemperature(String temperature) {
                this.temperature = temperature;
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
        }