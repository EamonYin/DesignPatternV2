package com.eamon.designpatternv2.SOLID.DependenceInversion;

public class CatSound implements Sound{
    @Override
    public String heardSound() {
        return "喵～";
    }
}
