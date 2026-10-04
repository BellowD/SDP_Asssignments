package Assignment3_Bridge;

public class Mage extends Character {

    public Mage(Weapon weapon) {
        super(weapon);
    }

    @Override
    public void attack() {
        System.out.print("Mage: ");
        weapon.attack();
    }
}