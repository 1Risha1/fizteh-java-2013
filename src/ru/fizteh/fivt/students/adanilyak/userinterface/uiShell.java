package ru.fizteh.fivt.students.adanilyak.userinterface;

import ru.fizteh.fivt.students.adanilyak.tools.ShellLogic;

/**
 * User: Alexander
 * Date: 20.10.13
 * Time: 22:26
 */
public class uiShell {
    public uiShell() {

    }

    public uiShell(String[] args, uiCmdList cmdList) {
        if (args.length == 0) {
            ShellLogic.interactiveMode(System.in, cmdList.getCmdList(), System.out, System.err);
        } else {
            ShellLogic.packageMode(args, cmdList.getCmdList(), System.out, System.err);
        }
    }
}
