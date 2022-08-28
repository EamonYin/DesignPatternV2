package com.eamon.designpatternv2.Structural.Bridge;

public abstract class Combo {
    public Rice rice;
    public Combo(Rice rice){
        this.rice = rice;
    }
    public abstract void getCombo();
}
