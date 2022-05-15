package com.eamon.designpatternv2.SOLID.Single;

/**
 * @Author: Eamon
 * @Date: 2022/5/10 14:51
 *
 * 【！！！违背单一原则！！！】
 */
public class Power {
    public void power(String transportation) {
        if (transportation.equals("电动车")) {
            System.out.println(transportation + "是电力驱动的");
        } else {
            System.out.println(transportation + "是石油驱动的");
        }
    }
}
