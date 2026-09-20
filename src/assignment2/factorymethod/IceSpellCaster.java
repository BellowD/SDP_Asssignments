package assignment2.factorymethod;

public class IceSpellCaster extends SpellCaster{
    @Override
    public Spell createSpell() {
        return new IceSpell();
    }
}
