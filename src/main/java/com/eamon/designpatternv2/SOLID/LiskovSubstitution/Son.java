package com.eamon.designpatternv2.SOLID.LiskovSubstitution;

/**
 * @Author: Eamon
 * @Date: 2022/5/15 18:33
 */
public class Son extends Father{
    //重写了父亲的“腿”方法
    public void leg(){
        System.out.println("儿子腿长");
    }
    public void leg(Integer size){
        System.out.println("儿子腿长"+size+"cm");
    }
    public void sonLeg(){
        System.out.println("儿子是大长腿");
    }
    public void eye(){
        System.out.println("儿子是大眼睛");
    }
}
