package assignment2;

import assignment2.abstractfactory.*;
import assignment2.factorymethod.FireSpellCaster;
import assignment2.factorymethod.IceSpellCaster;
import assignment2.factorymethod.Spell;
import assignment2.factorymethod.SpellCaster;

public class Main {
    public static void main(String[] args) {
        System.out.println("-Factory method-");

        SpellCaster fireCaster = new FireSpellCaster();
            fireCaster.castSpell();
        SpellCaster iceCaster = new IceSpellCaster();
            iceCaster.castSpell();

        System.out.println("\n-Abstract factory-");

        MagicSpellFactory fireFactory = new FireMagicFactory();

        AttackSpell fireAttack = fireFactory.createAttackSpell();
        DefenseSpell fireDefence = fireFactory.createDefenceSpell();

        fireAttack.cast();
        fireDefence.cast();

        MagicSpellFactory iceFactory = new IceMagicFactory();

        AttackSpell iceAttack = iceFactory.createAttackSpell();
        DefenseSpell iceDefence = iceFactory.createDefenceSpell();

        iceAttack.cast();
        iceDefence.cast();

    }


}