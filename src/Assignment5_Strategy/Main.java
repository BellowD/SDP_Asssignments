package Assignment5_Strategy;

public class Main {

    public static void main(String[] args) {

        LootGenerator generator = new LootGenerator(new CommonLootStrategy());

        System.out.println("-Normal Enemy-");
        generator.generateLoot();

        System.out.println("\n-Elite Enemy-");
        generator.setStrategy(new RareLootStrategy());
        generator.generateLoot();

        System.out.println("\n-Boss-");
        generator.setStrategy(new BossLootStrategy());
        generator.generateLoot();
    }
}
