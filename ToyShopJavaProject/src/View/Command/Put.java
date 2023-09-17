package View.Command;

import View.Console;

public class Put extends AbstractMainClass{
    public Put(Console console) {
        super("Положить игрушку в корзину", console);
    }

    @Override
    public void execute() throws Exception {
        super.getConsole().put();
    }
}
