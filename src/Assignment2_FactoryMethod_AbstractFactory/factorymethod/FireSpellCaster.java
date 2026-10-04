package Assignment2_FactoryMethod_AbstractFactory.factorymethod;

public class FireSpellCaster extends SpellCaster{
    @Override
    public Spell createSpell() {
        return new FireSpell();
    }
}
