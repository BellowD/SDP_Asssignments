package Assignment4_Facade;

public class KnightArmor implements Armor {

    @Override
    public String getName() {
        return "Knight Armor";
    }

    @Override
    public int getDefense() {
        return 20;
    }

    @Override
    public String getDescription() {
        return "Heavy armor for knights";
    }
}

