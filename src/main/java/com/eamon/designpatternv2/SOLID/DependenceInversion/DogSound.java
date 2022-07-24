package com.eamon.designpatternv2.SOLID.DependenceInversion;

public class DogSound implements Sound{
    @Override
    public String heardSound() {
        return "汪汪～";
    }
}
