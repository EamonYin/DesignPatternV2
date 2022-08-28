package com.eamon.designpatternv2.Structural.Adapter;

public class Test {
    public static void main(String[] args) {
        HouseholdVoltage householdVoltage = new HouseholdVoltage();
        Integer householdVoltageVoltage = householdVoltage.getVoltage();
        householdVoltage.show();

        MobilePhone mobilePhone = new MobilePhone();
        Integer mobilePhoneVoltage = mobilePhone.getVoltage();
        mobilePhone.show();

        Adapter adapter = new Adapter(householdVoltage);
        adapter.conversion(mobilePhoneVoltage);
    }
}
