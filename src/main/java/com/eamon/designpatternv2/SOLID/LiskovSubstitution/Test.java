package com.eamon.designpatternv2.SOLID.LiskovSubstitution;

/**
 * @Author: Eamon
 * @Date: 2022/5/15 18:40
 *
 * 子类可以扩展父类的功能，但不能改变父类原有的功能(只添加新的方法，尽量不要重写父类方法，也尽量不要重载父类方法。)
 * 1. 子类可以实现父类的抽象方法，但不能覆盖父类的非抽象方法。
 * 2. 子类中可以增加自己特有的方法。
 * 3. 当子类的方法重载父类的方法时，方法的前置条件（即方法的形参）要比父类方法的输入参数更宽松。
 * 4. 当子类的方法实现父类的抽象方法时，方法的后置条件（即方法的返回值）要比父类更严格。
 */
public class Test {
    public static void main(String[] args) {
        Father father = new Father();
        father.leg();
        Son son = new Son();
        son.leg();
        son.leg(150);
        son.sonLeg();
    }
}
