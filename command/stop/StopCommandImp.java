package command.stop;

import command.Command;

public class StopCommandImp implements Command, StopCommand {

    @Override
    public void start() {
        stopProgram();

    }

    private void stopProgram() {
        System.exit(0);
    }
}
