package com.hsipig;

import com.hsipig.cli.CommandExecutor;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        // 模拟执行 generate 子命令，并传递 -l、-a、-o 参数
//        args = new String[]{"generate", "-l", "-a", "-o"};
//        args = new String[]{"config"};
//        args = new String[]{"list"};

        CommandExecutor commandExecutor = new CommandExecutor();
        commandExecutor.doExecute(args);
    }

}