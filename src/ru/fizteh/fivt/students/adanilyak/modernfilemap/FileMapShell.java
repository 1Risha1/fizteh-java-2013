package ru.fizteh.fivt.students.adanilyak.modernfilemap;

import ru.fizteh.fivt.storage.strings.Table;
import ru.fizteh.fivt.students.adanilyak.commands.*;
import ru.fizteh.fivt.students.adanilyak.tools.ShellLogic;
import ru.fizteh.fivt.students.adanilyak.userinterface.uiCmdList;
import ru.fizteh.fivt.students.adanilyak.userinterface.uiShell;

import java.io.File;

/**
 * User: Alexander
 * Date: 21.10.13
 * Time: 11:21
 */
public class FileMapShell extends uiShell {
    public FileMapShell(String[] args, String datFileName) {
        File datFile = new File(System.getProperty("fizteh.db.dir"), datFileName);
        try {
            Table currentTable = new SingleTable(datFile);
            FileMapState state = new FileMapState(currentTable);
            runFileMapShell(args, makeUpCmdList(state));
        } catch (Exception exc) {
            System.err.println(exc.getMessage());
            System.exit(1);
        }
    }

    private void runFileMapShell(String[] args, uiCmdList cmdList) {
        if (args.length == 0) {
            ShellLogic.interactiveMode(System.in, cmdList.getCmdList(), System.out, System.err);
        } else {
            ShellLogic.packageMode(args, cmdList.getCmdList(), System.out, System.err);
        }
    }

    private uiCmdList makeUpCmdList(FileMapState state) {
        uiCmdList stockFileMapShellCmdList = new uiCmdList();
        stockFileMapShellCmdList.addCommand(new CmdPut(state));
        stockFileMapShellCmdList.addCommand(new CmdGet(state));
        stockFileMapShellCmdList.addCommand(new CmdRemove(state));
        stockFileMapShellCmdList.addCommand(new CmdFmExit(state));
        return stockFileMapShellCmdList;
    }
}
