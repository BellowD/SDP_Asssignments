package Assignment3_Bridge;

public class Main {

    public static void main(String[] args) {

        Weapon sword = new Sword();
        Weapon magicStaff = new MagicStaff();

        Warrior warrior = new Warrior(sword);
        Mage mage = new Mage(magicStaff);

        warrior.attack();
        mage.attack();

        System.out.println("\nChanging warrior's weapon");

        warrior.setWeapon(magicStaff);
        warrior.attack();
    }
}
