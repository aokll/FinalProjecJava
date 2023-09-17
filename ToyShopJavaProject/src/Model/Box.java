package Model;

import java.util.*;

public class Box implements IBox{

    private Queue<Toy> queue;

    public Queue<Toy> getQueue() {
        return queue;
    }

    public Box() {
        queue = new PriorityQueue<>(new ToyComparator());
    }
    @Override
    public void put(Toy toy) {
        queue.add(toy);
    }
    @Override
    public Toy get(){
        return queue.poll();
    }
    static class ToyComparator implements Comparator<Toy> {
        @Override
        public int compare(Toy o1, Toy o2) {
            return o2.getMassOfToy() - o1.getMassOfToy();
        }
    }


}
