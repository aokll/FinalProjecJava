package Model;

public class ToyBuilder implements ImplToy{
    private final int id = 1;
    private final String namingTheToy = "Builder";
    private final int massOfToy = 2;


    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getNamingTheToy() {
        return namingTheToy;
    }

    @Override
    public int getMassOfToy() {
        return massOfToy;
    }
}
