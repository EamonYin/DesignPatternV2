package com.eamon.designpatternv2.Behavior.Template;

public class Sub implements Calculate{
    @Override
    public int operation(int num1, int num2) {
        return num1 - num2;
    }
}
