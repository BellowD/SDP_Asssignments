package assignment2.abstractfactory;

public class FireMagicFactory implements MagicSpellFactory{
    @Override
    public AttackSpell createAttackSpell() {
        return new FireAttackSpell();
    }

    @Override
    public DefenseSpell createDefenceSpell() {
        return new FireDefenseSpell();
    }
}
