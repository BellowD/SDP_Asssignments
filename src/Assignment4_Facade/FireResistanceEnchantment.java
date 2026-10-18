package Assignment4_Facade;

public class FireResistanceEnchantment extends ArmorDecorator {

    public FireResistanceEnchantment(Armor armor) {
        super(armor);
    }

    @Override
    public String getDescription() {
        return armor.getDescription() + ", Fire Resistance";
    }
}
