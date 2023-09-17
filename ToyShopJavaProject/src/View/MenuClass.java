package View;

import View.Command.AbstractMainClass;
import View.Command.Finish;
import View.Command.Get;
import View.Command.Put;

import java.util.ArrayList;
import java.util.List;

public class MenuClass {
    private final List<AbstractMainClass> listOfCommands;

    public MenuClass(Console console) {
        listOfCommands = new ArrayList<>();
        listOfCommands.add(new Put(console));
        listOfCommands.add(new Get(console));
        listOfCommands.add(new Finish(console));
    }
    public String menu(){
        StringBuilder commandStatusBar = new StringBuilder();
        for (int i = 0; i < listOfCommands.size(); i++) {
            commandStatusBar.append(i+1).append(". ").append(listOfCommands.get(i).getDiscript()).append("\n");
        }
        return commandStatusBar.toString();
    }
    public void execute(int numberOfTheCommand) throws Exception {
        AbstractMainClass abstractMainClass = listOfCommands.get(numberOfTheCommand-1);
        abstractMainClass.execute();
    }

    public List<AbstractMainClass> getListOfCommands() {
        return listOfCommands;
    }
}
