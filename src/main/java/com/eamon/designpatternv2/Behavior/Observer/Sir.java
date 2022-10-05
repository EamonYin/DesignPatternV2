package com.eamon.designpatternv2.Behavior.Observer;

public class Sir implements Police{
    @Override
    public void catchThief() {
        System.out.println("阿SIR-逮捕-张三");
    }
}
