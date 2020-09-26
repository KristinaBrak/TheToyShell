package command.enter;

import command.Command;

public class EnterCommandImp implements Command, EnterCommand {

    @Override
    public String changeDirectory(String currentPath, String newPath) {

        return newPath + " >";
    }

}
