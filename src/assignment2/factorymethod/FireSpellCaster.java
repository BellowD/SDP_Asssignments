package assignment2.factorymethod;

public class FireSpellCaster extends SpellCaster{
    @Override
    public Spell createSpell() {
        return new FireSpell();
    }
}
