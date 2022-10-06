package com.eamon.designpatternv2.Behavior.Template;

public class DafulaiGuobacai extends Cooking{
    @Override
    void step1() {
        System.out.println("备卤，煎饼切片");
    }

    @Override
    void step2() {
        System.out.println("将煎饼片倒入卤中");
    }
}
