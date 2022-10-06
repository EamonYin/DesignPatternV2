package com.eamon.designpatternv2.Behavior.Strategy;

public class Context {
    private Calculate strategy;

    public Context(Calculate strategy) {
        this.strategy = strategy;
    }

    public int execute(int num1, int num2) {
        return strategy.operation(num1, num2);
    }
}
