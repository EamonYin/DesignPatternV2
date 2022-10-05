package com.eamon.designpatternv2.Behavior.Observer;

public class BuTou implements Police{
    @Override
    public void catchThief() {
        System.out.println("捕头-逮捕-张三");
    }
}
