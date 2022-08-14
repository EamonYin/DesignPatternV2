package com.eamon.designpatternv2.SOLID.OpenClosed.entity;

import com.eamon.designpatternv2.SOLID.OpenClosed.StartUp;

public class Computer {
    public void StartSome(StartUp startUp){
        startUp.start();
    }
}
