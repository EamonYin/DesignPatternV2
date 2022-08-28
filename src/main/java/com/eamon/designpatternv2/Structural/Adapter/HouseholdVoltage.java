package com.eamon.designpatternv2.Structural.Adapter;

import lombok.Data;

@Data
public class HouseholdVoltage {
    private Integer voltage = 220;

    public void show() {
        System.out.println("家用电压：" + this.voltage + "V");
    }
}
