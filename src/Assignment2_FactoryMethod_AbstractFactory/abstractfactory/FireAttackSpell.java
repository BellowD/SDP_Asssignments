package Assignment2_FactoryMethod_AbstractFactory.abstractfactory;

public class FireAttackSpell implements AttackSpell{
    @Override
    public void cast() {
        System.out.println("Fire attack! Fireball hits the enemy");
    }
}
