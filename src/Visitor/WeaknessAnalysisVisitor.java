package Visitor;

public class WeaknessAnalysisVisitor implements Visitor {

    @Override
    public void visitGoblin(Goblin goblin) {
        System.out.println(goblin.getName() + " weaknesses:");
        System.out.println(" - Low health and weak physical defense.");

        if (goblin.usesPoison()) {
            System.out.println(" - Keep distance to avoid poison attacks.");
        } else {
            System.out.println(" - No special abilities detected.");
        }
    }

    @Override
    public void visitSkeleton(Skeleton skeleton) {
        System.out.println(skeleton.getName() + " weaknesses:");
        System.out.println(" - Vulnerable to blunt damage.");

        if (skeleton.hasShield()) {
            System.out.println(" - Attack from the side to bypass the shield.");
        } else {
            System.out.println(" - No shield protection.");
        }
    }

    @Override
    public void visitDragon(Dragon dragon) {
        System.out.println(dragon.getName() + " weaknesses:");
        System.out.println(" - Vulnerable areas: eyes and underbelly.");

        if (dragon.canFly()) {
            System.out.println(" - Ground the dragon before close combat.");
        }

        System.out.println(" - Prepare fire-resistant equipment.");
    }
}
