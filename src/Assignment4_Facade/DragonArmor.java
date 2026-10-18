package Assignment4_Facade;

public class DragonArmor implements Armor {

    @Override
    public String getName() {
        return "Dragon Armor";
    }

    @Override
    public int getDefense() {
        return 30;
    }

    @Override
    public String getDescription() {
        return "Rare armor made from dragon scales";
    }
}

