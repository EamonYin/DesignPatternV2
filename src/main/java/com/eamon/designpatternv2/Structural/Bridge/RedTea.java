package com.eamon.designpatternv2.Structural.Bridge;

public class RedTea extends Combo {
    private String redTea;

    public RedTea(Rice rice, String redTea) {
        super(rice);
        this.redTea = redTea;
    }

    @Override
    public void getCombo() {
        rice.rice(redTea);
    }
}
