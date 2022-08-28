package com.eamon.designpatternv2.Structural.Adapter;

import lombok.Data;

@Data
public class MobilePhone {
    private Integer voltage = 5;

    public void show() {
        System.out.println("手机电压：" + this.voltage + "V");
    }
}
