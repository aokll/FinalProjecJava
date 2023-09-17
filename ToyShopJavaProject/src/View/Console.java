package View;

import Model.ImplService;
import Presenter.Present;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Console implements ImplConsole{
    private Present present;
    private Scanner scanner;
    boolean flag = true;
    private MenuClass menuClass;

    public Console() {
        this.present = new Present();
        this.scanner = new Scanner(System.in);
        menuClass = new MenuClass(this);
    }

    public void start() throws Exception {
        while (flag){
            System.out.println(menuClass.menu());
            operation();
        }
    }

    /*public void start() throws Exception {
        label:
        while (flag){
        System.out.println("1 - положить игрушку в карзину;" + "\n"
        + "2 - вытащить игрушку, и поместить в файл ее данные" + "\n"
        + "3 - Выход");
        int i = scanner.nextInt();
            if (i == 1){
                put();
                continue label;
            } else if (i == 2) {
                get();
                continue label;
            }else if(i == 3){
                finish();
            }else {
                System.out.println("ввели не то число, попробуйте заново");
                continue label;
            }
        }

    }*/
    @Override
    public void put(){
        label:
        while (true) {
            System.out.println("Введите номер игрушки" + "\n");
            System.out.println("1 - Robot; 2 - Builder; 3 - Dolly" + "\n");
            int i = scanner.nextInt();
            present.put(i);
            System.out.println("добавить - y; выход - n" + "\n");
            String s = scanner.next();
            if (s.equals("y")){
                continue label;
            }else if (s.equals("n")){
                break;
            }else {
                System.out.println("ввели не тот символ, попробуйте заново");
                continue label;
            }
        }
    }
    @Override
    public void get() throws Exception {
        label:
        while (true) {
            present.get();
            System.out.println("Вынуть еще игрушку? да - y; нет - n;");
            String s = scanner.next();
            if (s.equals("y")) {
                System.out.println("Сделано");
                continue label;
            }else if (s.equals("n")){
                break;
            }
        }
    }
    @Override
    public void finish(){
        scanner.close();
        flag = false;
    }
    public void operation() throws Exception {

        menuClass.execute(tryingOutACommand());

    }

    public Integer tryingOutACommand(){
        int commandTestValue = 0;
        label:
        while (true) {
            String checkValueForOtherCharacters = null;
            checkValueForOtherCharacters = scanner.next();
            Pattern c = Pattern.compile(".*[A-Za-zА-Яа-я<>,./|}{()!&?~Ёё`].*");
            boolean b = checkValueForOtherCharacters.matches(c.pattern());
            if (b) {
                System.out.println("Должны быть только числа, попробуйте еще раз");
                continue label;
            }
            commandTestValue = Integer.parseInt(checkValueForOtherCharacters);
            if (commandTestValue <= 0 || commandTestValue > menuClass.getListOfCommands().size()){
                System.out.println("Таких вариантов нет, попробуйте еще раз");
                continue label;
            }
            break;
        }
        return commandTestValue;
    }

}
