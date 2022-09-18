package com.eamon.designpatternv2.Behavior.Command;

import java.util.ArrayList;
import java.util.List;

/**
 * 服务员类（调用者）
 */
public class InvokerWaitor {

    private List<Command> commandList;

    public InvokerWaitor() {
        commandList = new ArrayList<>();
    }

    public void setCommands(Command command) {
        commandList.add(command);
    }

    public void notifyChef(){
        System.out.println("Waiter 通知 Chef～");
        for (Command command: commandList) {
            command.execute();
        }
    }
}
