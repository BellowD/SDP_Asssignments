package Assignment4_Facade;

public class SpeedEnchantment extends ArmorDecorator {

    public SpeedEnchantment(Armor armor) {
        super(armor);
    }

    @Override
    public String getDescription() {
        return armor.getDescription() + ", Speed";
    }
}
