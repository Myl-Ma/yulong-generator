package com.myl.cli.pattern;

/**
 * 相当于定义了一个遥控器类
 */
public class RemoteControl {
    private Command command;

    //设置命令的方法，可以自由切换命令
    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}
