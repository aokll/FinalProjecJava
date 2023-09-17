package View.Command;

import View.Console;

public class Get extends AbstractMainClass{
    public Get(Console console) {
        super("Вытащить игрушку из корзины и записать данные в файл", console);
    }

    @Override
    public void execute() throws Exception {
        super.getConsole().get();
    }
}
