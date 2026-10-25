package Assignment5_Strategy;
import java.util.Random;

public class CommonLootStrategy implements LootStrategy {

    private final Random random = new Random();

    private final String[] items = {
            "Iron Sword", "Leather Boots", "Health Potion"
    };

    @Override
    public String generateLoot() {
        int gold = random.nextInt(16) + 5;
        String item = items[random.nextInt(items.length)];

        return "Common Loot: " + gold + " gold and " + item;
    }
}