package assignment2.abstractfactory;

public class IceAttackSpell implements AttackSpell{
    @Override
    public void cast() {
        System.out.println("Ice attack! Ice shard hits the enemy");
    }
}
