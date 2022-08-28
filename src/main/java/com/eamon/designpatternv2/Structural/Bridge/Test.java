package com.eamon.designpatternv2.Structural.Bridge;

public class Test {

    public static void main(String[] args) {
        new Soup(new ChickenLegRice(),"西红柿鸡蛋汤").getCombo();
        new RedTea(new PorkChop(),"冰红茶").getCombo();
    }

}
