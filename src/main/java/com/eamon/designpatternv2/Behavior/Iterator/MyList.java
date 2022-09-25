package com.eamon.designpatternv2.Behavior.Iterator;

import java.util.Arrays;
import java.util.List;

public class MyList implements Container {
    private List<String> data = Arrays.asList("张三", "李四", "王五", "赵六");

    @Override
    public Iterator getIterator() {
        return new Itr();
    }

    private class Itr implements Iterator {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < data.size();
        }

        @Override
        public String next() {
            return data.get(index++);
        }
    }
}
