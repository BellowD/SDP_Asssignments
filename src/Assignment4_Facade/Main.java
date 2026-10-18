package Assignment4_Facade;

public class Main {

    public static void main(String[] args) {

        ArmorEnchanterFacade enchanter =
                new ArmorEnchanterFacade();

        System.out.println("--ARMOR ENCHANTER--");

        String result = enchanter.enchantArmor(
                "dragon",
                true,
                true,
                false
        );

        System.out.println(result);
    }
}
