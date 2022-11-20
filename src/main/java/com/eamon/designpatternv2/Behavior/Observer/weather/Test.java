package com.eamon.designpatternv2.Behavior.Observer.weather;

public class Test {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        // 张三李四搜索到气象站联系方式
        ZhangSan zhangSan = new ZhangSan(weatherStation);
        LiSi liSi = new LiSi(weatherStation);
        // 张三李四联系气象站，气温/湿度有变化通知他们
        weatherStation.registerObserver(zhangSan);
        weatherStation.registerObserver(liSi);
        // 温度到零下
        weatherStation.setTemperature(-1);
        // 湿度高于80%
        weatherStation.setDampness(81);
    }
}
