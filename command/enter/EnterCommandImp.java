package command.enter;

import command.Command;

public class EnterCommandImp implements Command, EnterCommand {

    @Override
    public String changeDirectory(String currentPath, String newPath) {
        String[] paths = currentPath.split(">");

        currentPath = paths[0].trim() + "/";
        return currentPath + newPath + " >";
    }

}
