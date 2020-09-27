package command.list;

import java.io.File;

import command.Command;

public class ListCommandImp implements ListCommand, Command {
    private final String PATH = "~/Desktop/";
    private File file;

    public ListCommandImp() {
        this.file = new File(PATH);
    }

    @Override
    public void list() {
        File[] pathNames = file.listFiles();

        if (pathNames.length != 0) {
            for (File pathName : pathNames) {
                System.out.println(pathName.toString());
            }
        } else {
            System.out.println("No files found");
        }
    }

}
