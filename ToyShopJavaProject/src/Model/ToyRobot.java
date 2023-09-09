package Model;

public class ToyRobot implements ImplToy{
    private final int id = 2;
    private final String namingTheToy = "Robot";
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
