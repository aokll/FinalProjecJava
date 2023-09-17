package View.Command;

import View.Console;

public abstract class AbstractMainClass {
    private String discript;
    private Console console;

    public AbstractMainClass(String discript, Console console) {
        this.discript = discript;
        this.console = console;
    }

    public String getDiscript() {
        return discript;
    }

    Console getConsole() {
        return console;
    }
    public abstract void execute() throws Exception;

}
