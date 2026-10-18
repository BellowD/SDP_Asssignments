package Assignment4_Facade;

public class ProtectionEnchantment extends ArmorDecorator {

    public ProtectionEnchantment(Armor armor) {
        super(armor);
    }

    @Override
    public int getDefense() {
        return armor.getDefense() + 5;
    }

    @Override
    public String getDescription() {
        return armor.getDescription() + ", Protection";
    }
}
