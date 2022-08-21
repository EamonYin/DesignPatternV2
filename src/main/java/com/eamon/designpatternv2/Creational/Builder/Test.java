package com.eamon.designpatternv2.Creational.Builder;

public class Test {
    public static void main(String[] args) {
        Car EV = new Car.Builder("电动").build();
        System.out.println("我要一辆" + EV.getColor() + "的" + EV.getBox() + "厢" + EV.getPower() + "能源汽车");
        Car petrol = new Car.Builder("汽油").box(3).build();
        System.out.println("我要一辆" + petrol.getColor() + "的" + petrol.getBox() + "厢" + petrol.getPower() + "能源汽车");
    }
}
