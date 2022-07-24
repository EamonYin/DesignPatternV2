package com.eamon.designpatternv2.SOLID.DependenceInversion;

public class Xiaoming {
    public void heard(Sound sound) {
        System.out.println("我听到了" + sound.heardSound());
    }
}
