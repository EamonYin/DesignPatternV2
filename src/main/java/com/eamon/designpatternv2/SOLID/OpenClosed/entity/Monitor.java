package com.eamon.designpatternv2.SOLID.OpenClosed.entity;

import com.eamon.designpatternv2.SOLID.OpenClosed.StartUp;

public class Monitor extends StartUp {
    @Override
    public void start() {
        System.out.println("显示器启动");
    }
}
