package Assignment2_FactoryMethod_AbstractFactory.abstractfactory;

public class IceAttackSpell implements AttackSpell{
    @Override
    public void cast() {
        System.out.println("Ice attack! Ice shard hits the enemy");
    }
}
