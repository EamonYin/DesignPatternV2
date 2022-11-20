package com.eamon.designpatternv2.Behavior.Observer.weather.jdk;

public class Test {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        ZhangSan zhangSan = new ZhangSan();
        LiSi liSi = new LiSi();
        weatherStation.setTemperature(-1);
        weatherStation.setDampness(81);
        zhangSan.update(weatherStation, null);
        liSi.update(weatherStation, null);
    }
}
