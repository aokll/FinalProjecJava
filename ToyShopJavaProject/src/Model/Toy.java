package Model;

public class Toy {

    private int id;
    private String namingTheToy;

    private int massOfToy;

    public Toy(int id, String namingTheToy, int massOfToy) {
        this.id = id;
        this.namingTheToy = namingTheToy;
        this.massOfToy = massOfToy;
    }

    public int getId() {
        return id;
    }

    public String getNamingTheToy() {
        return namingTheToy;
    }


    public int getMassOfToy() {
        return massOfToy;
    }
}
