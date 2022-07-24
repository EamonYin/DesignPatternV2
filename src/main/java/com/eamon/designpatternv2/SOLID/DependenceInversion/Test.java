package com.eamon.designpatternv2.SOLID.DependenceInversion;

/**
 * 依赖倒置原则的核心思想是面向接口编程
 * 抽象指的是接口或者抽象类，细节就是具体的实现类
 *
 * 例子：小名回家听到了屋里宠物叫声，小名还可以养其他动物从而听到不同动物的叫声，
 * 这里将叫声抽象成接口，方便日后小名再养其他小动物
 */
public class Test {
    public static void main(String[] args) {
        Xiaoming xiaoming = new Xiaoming();
        xiaoming.heard(new DogSound());
        xiaoming.heard(new CatSound());
    }
}
