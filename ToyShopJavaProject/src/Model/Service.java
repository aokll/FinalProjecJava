package Model;

import java.util.Queue;

public class Service {
    FileEntry fileEntry;
    Box box;
    private int id = 0;

    public Service() {
        fileEntry = new FileEntry();
        box = new Box();
    }
    public void put(int i){
        label:
        while (true) {
            if (i == 1) {
                box.put(new Toy(id,"Robot", 2));
                id++;
            } else if (i == 2) {
                box.put(new Toy(id,"Builder", 2));
                id++;
            } else if (i == 3) {
                box.put(new Toy(id,"Dolly", 6));
                id++;
            } else {
                System.out.println("Введите число еще раз\n");
                continue label;}
            break;
        }
    }
    public void get() throws Exception {
        System.out.println("Вкорзине осталось [" + ((box.getQueue().size())-1) + "] игрушек" + "\n");
        if (box.getQueue().size() == 0){
            throw new NullPointerException("В корзине не осталось игрушек, программа закрыта");
        }
        fileEntry.write(box.get());
    }
}
