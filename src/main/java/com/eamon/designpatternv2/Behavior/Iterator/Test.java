package com.eamon.designpatternv2.Behavior.Iterator;

public class Test {
    public static void main(String[] args) {
        MyList myList = new MyList();
        Iterator iterator = myList.getIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
