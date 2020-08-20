package com.example.mausamweatherapp.Common;

import org.jetbrains.annotations.NotNull;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Common {
    public static String API_KEY = "d9e2048e8bed8d54a9a569a4e0df6694";
    public static String API_LINK = "https://api.openweathermap.org/data/2.5/weather";

    @NotNull
    public static String apiRequest(String lat, String lng) {
        StringBuilder sb = new StringBuilder(API_LINK);
        sb.append(String.format("?lat=%s&lon=%s&APPID=%s&units=metric", lat, lng, API_KEY));
        return sb.toString();
    }

    public static String unixTimeStampToDateTime(double unixTimeStamp) {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm");
        Date date = new Date();
        date.setTime((long)unixTimeStamp*1000);
        return dateFormat.format(date);
    }

    public static String getImage(String icon) {
        return String.format("https://openweathermap.org/img/w/%s.png",icon);
    }

    public static String getDateNow() {
        DateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy HH:mm");
        Date date = new Date();
        return dateFormat.format(date);
    }
}
