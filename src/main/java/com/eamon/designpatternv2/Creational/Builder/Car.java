package com.eamon.designpatternv2.Creational.Builder;

public class Car {
    private String color;
    private String power;
    private Integer box;

    private Car(Builder builder) {
        this.color = builder.color;
        this.power = builder.power;
        this.box = builder.box;
    }

    public String getColor() {
        return color;
    }

    public String getPower() {
        return power;
    }

    public Integer getBox() {
        return box;
    }

    public static class Builder {
        private final String power;
        private String color = Color.WHITE.getMessage();
        private Integer box = 2;

        public Builder(String power) {
            this.power = power;
        }

        public Builder color(String color) {
            this.color = color;
            return this;
        }

        public Builder box(Integer box) {
            this.box = box;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
