package com.gl.disign.pattern18.command;

public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action()
    {
        command.exec();
    }
}
