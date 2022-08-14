package com.eamon.designpatternv2.SOLID.OpenClosed;

import com.eamon.designpatternv2.SOLID.OpenClosed.entity.Computer;
import com.eamon.designpatternv2.SOLID.OpenClosed.entity.Keyboard;
import com.eamon.designpatternv2.SOLID.OpenClosed.entity.Monitor;
import com.eamon.designpatternv2.SOLID.OpenClosed.entity.Mouse;

public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.StartSome(new Monitor());
        computer.StartSome(new Keyboard());
        computer.StartSome(new Mouse());
    }
}
