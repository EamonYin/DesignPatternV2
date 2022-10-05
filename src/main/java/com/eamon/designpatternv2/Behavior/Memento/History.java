package com.eamon.designpatternv2.Behavior.Memento;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class History {
    List<Archive> history = new ArrayList<>();

    public void add(Archive archive) {
        history.add(archive);
    }

    public Archive getArchive(Integer index) {
        return history.get(index - 1);
    }
}
