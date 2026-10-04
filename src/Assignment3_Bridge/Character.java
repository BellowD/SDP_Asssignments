package Assignment3_Bridge;

public abstract class Character {

    protected Weapon weapon;

    public Character(Weapon weapon) {
        this.weapon = weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public abstract void attack();
}