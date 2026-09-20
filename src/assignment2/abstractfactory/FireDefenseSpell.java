package assignment2.abstractfactory;

public class FireDefenseSpell implements DefenseSpell{
    @Override
    public void cast() {
        System.out.println("Firewall! Now you are under big wall made of flame");
    }
}
