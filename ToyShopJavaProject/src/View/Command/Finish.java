package View.Command;

import View.Console;

public class Finish extends AbstractMainClass{
    public Finish(Console console) {
        super("Выйти", console);
    }

    @Override
    public void execute() throws Exception {
        super.getConsole().finish();
    }
}
