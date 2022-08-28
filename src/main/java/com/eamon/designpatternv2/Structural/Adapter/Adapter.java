package com.eamon.designpatternv2.Structural.Adapter;

public class Adapter implements Charger {

    private HouseholdVoltage householdVoltage;

    public Adapter(HouseholdVoltage householdVoltage) {
        this.householdVoltage = householdVoltage;
    }

    @Override
    public void conversion(Integer voltage) {
        Integer householdVoltageVoltage = householdVoltage.getVoltage();
        if (householdVoltageVoltage > voltage) {
            System.out.println("适配器将" + householdVoltageVoltage + "V 转换为" + voltage + "V 输出");
        } else {
            System.out.println("电压无需适配");
        }
    }
}
