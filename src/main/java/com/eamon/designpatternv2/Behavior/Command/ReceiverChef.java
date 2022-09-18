package com.eamon.designpatternv2.Behavior.Command;

/**
 * 厨师类（接收者）
 */
public class ReceiverChef {
    public void cook(String name, Integer num) {
        System.out.println(num + "份" + name);
    }
}
