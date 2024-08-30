package cheese.command;

import cheese.CheeseException;
import cheese.Storage;
import cheese.TaskList;
import cheese.Ui;

/**
 * Encapsulates small parts of logic for the bot
 */
public class Command {
    private final boolean exitChat;

    Command() {
        exitChat = false;
    }

    /**
     * Check if the program should exit
     * @return boolean
     */
    public boolean isExit() {
        return exitChat;
    }

    /**
     * Function to call the command
     * @param tasks list of tasks
     * @param ui format response
     * @param storage store data
     * @throws CheeseException in case something breaks
     */
    public String execute(TaskList tasks, Ui ui, Storage storage) throws CheeseException {
        return ui.say("Beeop... Unknown command");
    }
}
