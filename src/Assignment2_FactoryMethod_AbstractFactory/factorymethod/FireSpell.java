package Assignment2_FactoryMethod_AbstractFactory.factorymethod;

public class FireSpell implements Spell{
    @Override
    public void cast() {
        System.out.println("Casting Firaball. Enemy burned.");
    }
}
