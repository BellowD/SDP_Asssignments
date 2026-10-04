package Assignment2_FactoryMethod_AbstractFactory.abstractfactory;

public class IceMagicFactory implements MagicSpellFactory{
    @Override
    public AttackSpell createAttackSpell() {
        return new IceAttackSpell();
    }

    @Override
    public DefenseSpell createDefenceSpell() {
        return new IceDefenseSpell();
    }

}
