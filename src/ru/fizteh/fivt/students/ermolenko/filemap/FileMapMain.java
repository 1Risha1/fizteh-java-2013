package ru.fizteh.fivt.students.ermolenko.filemap;

import java.io.File;
import java.io.IOException;

public class FileMapMain {
    public static void main(String[] args) throws IOException {


        //String currentProperty = System.getProperty("fizteh.db.dir");
        String currentProperty = "/Users/evgenij/Documents/JAVA_Ex/fizteh-java-2013/src/ru/fizteh/fivt/students/ermolenko/filemap/db.dat";
        File base = new File(currentProperty);
        if (!base.exists()) {
            base.createNewFile();
        }

        try {
            base = base.getCanonicalFile().toPath().resolve("db.dat").toFile();
        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.exit(1);
        }

        FileMap filemap = new FileMap(base);
        FileMapExecutor exec = new FileMapExecutor();
        try {
            if (args.length > 0) {
                filemap.batchState(args, exec);
            } else {
                filemap.interactiveState(exec);
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.exit(1);
        }

        System.exit(0);
    }
}