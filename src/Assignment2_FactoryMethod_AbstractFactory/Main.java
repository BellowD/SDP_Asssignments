package Assignment2_FactoryMethod_AbstractFactory;

import Assignment2_FactoryMethod_AbstractFactory.abstractfactory.*;
import Assignment2_FactoryMethod_AbstractFactory.factorymethod.FireSpellCaster;
import Assignment2_FactoryMethod_AbstractFactory.factorymethod.IceSpellCaster;
import Assignment2_FactoryMethod_AbstractFactory.factorymethod.SpellCaster;

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