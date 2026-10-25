package Assignment5_Strategy;

public class LootGenerator {

    private LootStrategy strategy;

    public LootGenerator(LootStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(LootStrategy strategy) {
        this.strategy = strategy;
    }

    public void generateLoot() {
        System.out.println(strategy.generateLoot());
    }
}
