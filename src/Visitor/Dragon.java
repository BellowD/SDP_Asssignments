package Visitor;

public class Dragon implements Monster {
    private final String name;
    private final int health;
    private final int attackDamage;
    private final int defense;
    private final int fireDamage;
    private final boolean canFly;

    public Dragon(String name, int health, int attackDamage,
                  int defense, int fireDamage, boolean canFly) {
        this.name = name;
        this.health = health;
        this.attackDamage = attackDamage;
        this.defense = defense;
        this.fireDamage = fireDamage;
        this.canFly = canFly;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitDragon(this);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public int getAttackDamage() {
        return attackDamage;
    }

    @Override
    public int getDefense() {
        return defense;
    }

    public int getFireDamage() {
        return fireDamage;
    }

    public boolean canFly() {
        return canFly;
    }
}
