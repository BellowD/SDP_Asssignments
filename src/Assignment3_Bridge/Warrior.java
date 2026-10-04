package Assignment3_Bridge;

public class Warrior extends Character {

    public Warrior(Weapon weapon) {
        super(weapon);
    }

    @Override
    public void attack() {
        System.out.print("Warrior: ");
        weapon.attack();
    }
}