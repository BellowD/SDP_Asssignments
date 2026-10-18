package Assignment4_Facade;

public class EnchantmentValidator {

    public boolean isValid(Armor armor) {
        if (armor == null) {
            System.out.println("Error: armor was not selected.");
            return false;
        }

        return true;
    }
}

