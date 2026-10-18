package Assignment4_Facade;

public abstract class ArmorDecorator implements Armor {

    protected Armor armor;

    public ArmorDecorator(Armor armor) {
        this.armor = armor;
    }

    @Override
    public String getName() {
        return armor.getName();
    }

    @Override
    public int getDefense() {
        return armor.getDefense();
    }

    @Override
    public String getDescription() {
        return armor.getDescription();
    }
}
