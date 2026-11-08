package Visitor;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Monster> bestiary = Arrays.asList(
                new Goblin("Goblin Scout", 60, 12, 4, true),
                new Skeleton("Skeleton Guard", 100, 18, 12, true),
                new Dragon("Ancient Dragon", 800, 75, 60, 100, true)
        );

        System.out.println("MONSTER BESTIARY");

        System.out.println("\n-1. Combat Power Analysis-");

        Visitor combatVisitor = new CombatPowerVisitor();

        for (Monster monster : bestiary) {
            monster.accept(combatVisitor);
        }

        System.out.println("\n-2. Experience Rewards-");

        Visitor experienceVisitor = new ExperienceRewardVisitor();

        for (Monster monster : bestiary) {
            monster.accept(experienceVisitor);
        }

        System.out.println("\n-3. Weakness Analysis-");

        Visitor weaknessVisitor = new WeaknessAnalysisVisitor();

        for (Monster monster : bestiary) {
            monster.accept(weaknessVisitor);
            System.out.println();
        }
    }
}
