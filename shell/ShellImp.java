package shell;

import java.util.Scanner;

import command.enter.EnterCommand;
import command.enter.EnterCommandImp;
import command.list.ListCommand;
import command.list.ListCommandImp;
import command.stop.StopCommand;
import command.stop.StopCommandImp;

public class ShellImp implements Shell {
    private String currentDirectory;

    @Override
    public void run() {
        currentDirectory = "/Your/Current/Directory>";

        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print(currentDirectory);

            String input = scan.nextLine().toString();

            if (!checkCommand(input)) {
                sendErrorMessage(input);
            }

        }
        // scan.close();
    }

    private boolean checkCommand(String command) {
        String commandStart = command.toLowerCase();
        switch (command.toLowerCase()) {
            case "stop":
                StopCommand stopCommand = new StopCommandImp();
                stopCommand.start();
                return true;
            case "list":
                ListCommand listCommand = new ListCommandImp();
                listCommand.list();
                return true;
            case "enter":
                EnterCommand enterCommand = new EnterCommandImp();
                // enterCommand.changeDirectory(currentDirectory, "NewPath")
            default:
                return false;
        }
    }

    private void sendErrorMessage(String incorrectCommand) {
        System.out.println("No such " + incorrectCommand);
    }

}
