package com.eamon.designpatternv2.Creational.Prototype;


public class Car {
    private String name;
    private Integer box;
    private String power;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBox() {
        return box;
    }

    public void setBox(Integer box) {
        this.box = box;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public Car() {
    }

    public Car(Car car) {
        this.name = car.getName();
        this.box = car.getBox();
        this.power = car.getPower();
    }

    public Car clone() {
        return new Car(this);
    }

    public void show() {
        System.out.println(
                "一辆" + this.getPower() + this.getBox() + "厢" + this.getName()
        );
    }
}
