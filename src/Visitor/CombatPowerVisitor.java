package Visitor;

public class CombatPowerVisitor implements Visitor {

    @Override
    public void visitGoblin(Goblin goblin) {
        int power = goblin.getHealth() / 5
                + goblin.getAttackDamage() * 2
                + goblin.getDefense();

        if (goblin.usesPoison()) {
            power += 15;
        }

        printPower(goblin.getName(), power);
    }

    @Override
    public void visitSkeleton(Skeleton skeleton) {
        int power = skeleton.getHealth() / 5
                + skeleton.getAttackDamage() * 2
                + skeleton.getDefense();

        if (skeleton.hasShield()) {
            power += 20;
        }

        printPower(skeleton.getName(), power);
    }

    @Override
    public void visitDragon(Dragon dragon) {
        int power = dragon.getHealth() / 5
                + dragon.getAttackDamage() * 2
                + dragon.getDefense()
                + dragon.getFireDamage() * 2;

        if (dragon.canFly()) {
            power += 30;
        }

        printPower(dragon.getName(), power);
    }

    private void printPower(String name, int power) {
        System.out.printf("%-20s combat power: %d%n", name, power);
    }
}
