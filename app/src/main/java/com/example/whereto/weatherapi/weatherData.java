package com.example.whereto.weatherapi;

import java.util.List;

public class weatherData {

    private List<weather> weather;
    private main main;
    private String name;

    public weatherData(List<com.example.whereto.weatherapi.weather> weather, com.example.whereto.weatherapi.main main, String name) {
        this.weather = weather;
        this.main = main;
        this.name = name;
    }

    public List<com.example.whereto.weatherapi.weather> getWeather() {
        return weather;
    }

    public void setWeather(List<com.example.whereto.weatherapi.weather> weather) {
        this.weather = weather;
    }

    public com.example.whereto.weatherapi.main getMain() {
        return main;
    }

    public void setMain(com.example.whereto.weatherapi.main main) {
        this.main = main;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
