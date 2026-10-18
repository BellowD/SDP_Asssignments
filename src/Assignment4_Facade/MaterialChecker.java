package Assignment4_Facade;

public class MaterialChecker {

    private int materials = 10;

    public boolean hasMaterials() {
        System.out.println("Checking enchantment materials...");
        return materials > 0;
    }

    public void useMaterials() {
        if (materials > 0) {
            materials--;
            System.out.println("Materials used. Left: " + materials);
        }
    }
}
