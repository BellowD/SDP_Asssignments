package Assignment2_FactoryMethod_AbstractFactory.abstractfactory;

public class IceDefenseSpell implements DefenseSpell{
    @Override
    public void cast() {
        System.out.println("Ice wall! Now you are under big wall made of ice");
    }
}
