package com.eamon.designpatternv2.Behavior.Strategy;

public class Mul implements Calculate{
    @Override
    public int operation(int num1, int num2) {
        return num1 * num2;
    }
}
