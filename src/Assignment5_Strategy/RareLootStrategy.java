package Assignment5_Strategy;
import java.util.Random;

public class RareLootStrategy implements LootStrategy {

    private final Random random = new Random();

    private final String[] items = {
            "Magic Ring", "Enchanted Bow", "Rare Amulet"
    };

    @Override
    public String generateLoot() {
        int gold = random.nextInt(36) + 25;
        String item = items[random.nextInt(items.length)];

        return "Rare Loot: " + gold + " gold and " + item;
    }
}
