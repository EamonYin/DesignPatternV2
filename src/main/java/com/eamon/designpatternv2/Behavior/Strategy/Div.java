package com.eamon.designpatternv2.Behavior.Strategy;

public class Div implements Calculate{
    @Override
    public int operation(int num1, int num2) {
        return num1 / num2;
    }
}
