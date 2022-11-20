package com.eamon.designpatternv2.Behavior.Observer.weather.pushModel;

public class Weather {
    int temperature;
    int dampness;

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getDampness() {
        return dampness;
    }

    public void setDampness(int dampness) {
        this.dampness = dampness;
    }
}
