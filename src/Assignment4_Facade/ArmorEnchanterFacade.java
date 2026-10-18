package Assignment4_Facade;

public class ArmorEnchanterFacade {

    private final MaterialChecker materialChecker;
    private final EnchantmentValidator validator;
    private final RuneInscriber runeInscriber;
    private final MagicForge magicForge;
    private final ArmorStorage armorStorage;

    public ArmorEnchanterFacade() {
        materialChecker = new MaterialChecker();
        validator = new EnchantmentValidator();
        runeInscriber = new RuneInscriber();
        magicForge = new MagicForge();
        armorStorage = new ArmorStorage();
    }

    public String enchantArmor(
            String armorType,
            boolean protection,
            boolean fireResistance,
            boolean speed
    ) {
        Armor armor = createArmor(armorType);

        if (!validator.isValid(armor)) {
            return "Enchantment failed.";
        }

        if (!protection && !fireResistance && !speed) {
            return "Choose at least one enchantment.";
        }

        if (!materialChecker.hasMaterials()) {
            return "Not enough materials.";
        }

        materialChecker.useMaterials();

        if (protection) {
            armor = new ProtectionEnchantment(armor);
        }

        if (fireResistance) {
            armor = new FireResistanceEnchantment(armor);
        }

        if (speed) {
            armor = new SpeedEnchantment(armor);
        }

        magicForge.startForge();
        runeInscriber.inscribeRunes(armor);
        magicForge.finishForge();
        armorStorage.saveArmor(armor);

        return "\n=== ENCHANTMENT COMPLETE ==="
                + "\nArmor: " + armor.getName()
                + "\nDescription: " + armor.getDescription()
                + "\nDefense: " + armor.getDefense();
    }

    private Armor createArmor(String armorType) {
        if (armorType == null) {
            return null;
        }

        switch (armorType.toLowerCase()) {
            case "iron":
                return new IronArmor();
            case "knight":
                return new KnightArmor();
            case "dragon":
                return new DragonArmor();
            default:
                return null;
        }
    }
}
