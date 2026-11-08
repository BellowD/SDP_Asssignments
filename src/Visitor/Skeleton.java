package Visitor;

public class Skeleton implements Monster {
    private final String name;
    private final int health;
    private final int attackDamage;
    private final int defense;
    private final boolean hasShield;

    public Skeleton(String name, int health, int attackDamage,
                    int defense, boolean hasShield) {
        this.name = name;
        this.health = health;
        this.attackDamage = attackDamage;
        this.defense = defense;
        this.hasShield = hasShield;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitSkeleton(this);
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

    public boolean hasShield() {
        return hasShield;
    }
}