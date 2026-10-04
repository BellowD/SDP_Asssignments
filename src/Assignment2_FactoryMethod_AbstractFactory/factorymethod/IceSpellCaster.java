package Assignment2_FactoryMethod_AbstractFactory.factorymethod;

public class IceSpellCaster extends SpellCaster{
    @Override
    public Spell createSpell() {
        return new IceSpell();
    }
}
