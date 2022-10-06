package com.eamon.designpatternv2.Behavior.Template;

public class BraisedPork extends Cooking{
    @Override
    void step1() {
        System.out.println("备菜、准备佐料");
    }

    @Override
    void step2() {
        System.out.println("倒入佐料，备菜效果，炒出红油");
    }
}
