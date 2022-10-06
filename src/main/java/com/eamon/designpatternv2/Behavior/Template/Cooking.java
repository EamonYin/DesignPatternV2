package com.eamon.designpatternv2.Behavior.Template;

public abstract class Cooking {
    abstract void step1();
    abstract void step2();
    public void cook(){
        System.out.println("开始做饭");
        step1();
        step2();
        System.out.println("结束做饭");
    }
}
