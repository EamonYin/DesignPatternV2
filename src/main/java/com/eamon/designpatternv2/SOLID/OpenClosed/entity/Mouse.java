package com.eamon.designpatternv2.SOLID.OpenClosed.entity;

import com.eamon.designpatternv2.SOLID.OpenClosed.StartUp;

public class Mouse extends StartUp {
    @Override
    public void start() {
        System.out.println("鼠标启动");
    }
}
