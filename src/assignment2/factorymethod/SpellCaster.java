package assignment2.factorymethod;

public abstract class SpellCaster {
    public abstract Spell createSpell();

    public void castSpell() {
        Spell spell = createSpell();
        spell.cast();
    }
}
