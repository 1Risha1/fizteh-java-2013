package ru.fizteh.fivt.students.ermolenko.filemap;

import java.io.*;

import ru.fizteh.fivt.students.ermolenko.shell.Shell;

public class FileMap extends Shell {

    private FileMapState state;

    public FileMapState getFileMapState() {
        return state;
    }

    public FileMap(File currentFile) throws IOException {
        state = new FileMapState(currentFile);
        Utils.readDataBase(state);
    }
}