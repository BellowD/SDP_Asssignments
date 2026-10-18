package Assignment4_Facade;

public class IronArmor implements Armor {

    @Override
    public String getName() {
        return "Iron Armor";
    }

    @Override
    public int getDefense() {
        return 10;
    }

    @Override
    public String getDescription() {
        return "Basic armor made of iron";
    }
}

