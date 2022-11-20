package com.eamon.designpatternv2.Behavior.Observer.weather.pushModel;

public class Test {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        ZhangSan zhangSan = new ZhangSan();
        LiSi liSi = new LiSi();
        // 张三李四联系气象站，气温/湿度有变化通知他们
        weatherStation.registerObserver(zhangSan);
        weatherStation.registerObserver(liSi);
        // 温度到零下
        weatherStation.setTemperature(-1);
        // 湿度高于80%
        weatherStation.setDampness(81);
    }
}
