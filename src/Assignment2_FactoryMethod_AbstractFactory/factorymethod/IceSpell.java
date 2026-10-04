package Assignment2_FactoryMethod_AbstractFactory.factorymethod;

public class IceSpell implements Spell{
    @Override
    public void cast() {
        System.out.println("Casting Ice Shard. Enemy frozen.");
    }
}
