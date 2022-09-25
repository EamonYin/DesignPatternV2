package com.eamon.designpatternv2.Behavior.Interpreter;

public class Test {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        String expression = "三减二加四减一";
        int calculate = calculator.calculate(expression);
        System.out.println(calculate);
    }
}
