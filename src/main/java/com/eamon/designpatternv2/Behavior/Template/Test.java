package com.eamon.designpatternv2.Behavior.Template;

public class Test {
    public static void main(String[] args) {
        System.out.println("=========制作鱼香肉丝=========");
        BraisedPork braisedPork = new BraisedPork();
        braisedPork.cook();
        System.out.println("=========制作嘎巴菜=========");
        DafulaiGuobacai dafulaiGuobacai = new DafulaiGuobacai();
        dafulaiGuobacai.cook();
    }
}
