package com.eamon.designpatternv2.Behavior.Observer;

import java.util.ArrayList;
import java.util.List;

public class ZhanSan implements Thief {

    List<Police> policeList = new ArrayList<Police>();

    @Override
    public void Steal(Police police) {
        policeList.add(police);
    }

    @Override
    public void notifyPolice() {
        policeList.forEach(police -> police.catchThief());
    }
}
