package com.eamon.designpatternv2.Structural.Bridge;

public class Soup extends Combo {

    private String soup;

    public Soup(Rice rice, String soup) {
        super(rice);
        this.soup = soup;
    }

    @Override
    public void getCombo() {
        rice.rice(soup);
    }
}
