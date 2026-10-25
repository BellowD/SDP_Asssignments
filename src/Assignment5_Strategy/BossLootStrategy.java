package Assignment5_Strategy;
import java.util.Random;

public class BossLootStrategy implements LootStrategy {

    private final Random random = new Random();

    private final String[] items = {
            "Dragon Slayer", "Legendary Armor", "Ancient Artifact"
    };

    @Override
    public String generateLoot() {
        int gold = random.nextInt(101) + 100;
        String item = items[random.nextInt(items.length)];

        return "Boss Loot: " + gold + " gold and " + item;
    }
}
