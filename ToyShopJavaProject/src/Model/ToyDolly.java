package Model;

public class ToyDolly implements ImplToy{
    private final int id = 3;
    private final String namingTheToy = "Dolly";
    private final int massOfToy = 6;


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
