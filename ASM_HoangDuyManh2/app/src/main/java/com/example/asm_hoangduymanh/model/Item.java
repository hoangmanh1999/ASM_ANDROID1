package com.example.asm_hoangduymanh.model;

public class Item {
    private String DateTime;
    private int WeatherIcon;
    private Temperature Temperature;
    private String IconPhrase;

    public com.example.asm_hoangduymanh.model.Temperature getTemperature() {
        return Temperature;
    }

    public void setTemperature(com.example.asm_hoangduymanh.model.Temperature temperature) {
        Temperature = temperature;
    }


    public String getIconPhrase() {
        return IconPhrase;
    }

    public void setIconPhrase(String iconPhrase) {
        IconPhrase = iconPhrase;
    }

    public String getDateTime() {
        return DateTime;
    }

    public void setDateTime(String dateTime) {
        DateTime = dateTime;
    }

    public int getWeatherIcon() {
        return WeatherIcon;
    }

    public void setWeatherIcon(int weatherIcon) {
        WeatherIcon = weatherIcon;
    }


}
