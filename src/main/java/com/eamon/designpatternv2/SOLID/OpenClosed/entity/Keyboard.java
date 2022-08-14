package com.eamon.designpatternv2.SOLID.OpenClosed.entity;

import com.eamon.designpatternv2.SOLID.OpenClosed.StartUp;

public class Keyboard extends StartUp {
    @Override
    public void start() {
        System.out.println("键盘启动");
    }
}
