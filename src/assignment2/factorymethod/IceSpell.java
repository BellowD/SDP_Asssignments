package assignment2.factorymethod;

public class IceSpell implements Spell{
    @Override
    public void cast() {
        System.out.println("Casting Ice Shard. Enemy frozen.");
    }
}
