package Visitor;

public class Goblin implements Monster {
    private final String name;
    private final int health;
    private final int attackDamage;
    private final int defense;
    private final boolean usesPoison;

    public Goblin(String name, int health, int attackDamage,
                  int defense, boolean usesPoison) {
        this.name = name;
        this.health = health;
        this.attackDamage = attackDamage;
        this.defense = defense;
        this.usesPoison = usesPoison;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitGoblin(this);
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

    public boolean usesPoison() {
        return usesPoison;
    }
}
