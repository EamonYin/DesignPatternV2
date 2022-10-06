package com.eamon.designpatternv2.Behavior.Strategy;

public class Test {
    public static void main(String[] args) {
        Context context = new Context(new Add());
        int execute = context.execute(1, 2);
        System.out.println("1+2=" + execute);
    }
}
