package Visitor;

public class ExperienceRewardVisitor implements Visitor {

    @Override
    public void visitGoblin(Goblin goblin) {
        int experience = goblin.getHealth()
                + goblin.getAttackDamage() * 3
                + (goblin.usesPoison() ? 20 : 0);

        printReward(goblin.getName(), experience);
    }

    @Override
    public void visitSkeleton(Skeleton skeleton) {
        int experience = skeleton.getHealth()
                + skeleton.getAttackDamage() * 3
                + (skeleton.hasShield() ? 25 : 0);

        printReward(skeleton.getName(), experience);
    }

    @Override
    public void visitDragon(Dragon dragon) {
        int experience = dragon.getHealth()
                + dragon.getAttackDamage() * 3
                + dragon.getFireDamage() * 2
                + (dragon.canFly() ? 100 : 0);

        printReward(dragon.getName(), experience);
    }

    private void printReward(String name, int experience) {
        System.out.printf("%-20s experience reward: %d XP%n",
                name, experience);
    }
}
