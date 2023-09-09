package Model;

import java.util.ArrayList;
import java.util.List;

public class Box {
    private List<ToyBuilder> toys;

    public Box() {
        toys = new ArrayList<>();
    }

    public List<ToyBuilder> getToys() {
        return toys;
    }

    public void setToys(List<ToyBuilder> toys) {
        this.toys = toys;
    }
}
