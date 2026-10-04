# Magical Spells - Factory Method & Abstract Factory

## Assignment 2

This project demonstrates two creational design patterns:

- Factory Method
- Abstract Factory

The project uses magical spells as the main domain.

### 1. Factory Method
   **Purpose**

The Factory Method pattern is used to create different types of spells
without putting the concrete object creation directly into the main logic.
The common product is represented by the Spell interface:  
`public interface Spell {  
void cast();  
}  `

There are two concrete products:   
1. FireSpell  
2. IceSpell  

The creator is the abstract SpellCaster class:  

```
public abstract class SpellCaster {
public abstract Spell createSpell();
    public void castSpell() {
        Spell spell = createSpell();
        spell.cast();
    }
}
```
The method: `public abstract Spell createSpell();` is the Factory Method.

Concrete creators are:
1. FireSpellCaster
2. IceSpellCaster

FireSpellCaster creates a FireSpell:
```
@Override
public Spell createSpell() {
   return new FireSpell();
}
```
IceSpellCaster creates an IceSpell:
```
@Override
public Spell createSpell() {
   return new IceSpell();
```
### 2. Abstract Factory
   **Purpose**

The Abstract Factory pattern is used to create families of related
objects without directly depending on their concrete implementations.

The project has two types of products:

1. AttackSpell 
2. DefenseSpell

The product interfaces are:
```
public interface AttackSpell {
void cast();
}
```
```
public interface AttackSpell {
    void cast();
}
```
The abstract factory is **MagicSpellFactory**:
```
public interface MagicSpellFactory {
    AttackSpell createAttackSpell();
    DefenseSpell createDefenceSpell();
}
```

**Fire Magic Family**

FireMagicFactory creates a family of Fire spells:
```aiignore
@Override
public AttackSpell createAttackSpell() {
    return new FireAttackSpell();
}

@Override
public DefenseSpell createDefenceSpell() {
    return new FireDefenseSpell();
}
```
**Ice Magic Family**

IceMagicFactory creates a family of Ice spells:
```aiignore
@Override
public AttackSpell createAttackSpell() {
    return new IceAttackSpell();
}

@Override
public DefenseSpell createDefenceSpell() {
    return new IceDefenseSpell();
}
```
### 3. Client

The client is represented by the Main class.

The client works with interfaces and abstract types:
```aiignore
MagicSpellFactory fireFactory = new FireMagicFactory();

AttackSpell fireAttack = fireFactory.createAttackSpell();
DefenseSpell fireDefence = fireFactory.createDefenceSpell();
```
### 4. Main Program

The Main class demonstrates both patterns.  
**Factory Method**
```aiignore
SpellCaster fireCaster = new FireSpellCaster();
fireCaster.castSpell();

SpellCaster iceCaster = new IceSpellCaster();
iceCaster.castSpell();
```  
**Abstract Factory**
```aiignore
MagicSpellFactory fireFactory = new FireMagicFactory();

AttackSpell fireAttack = fireFactory.createAttackSpell();
DefenseSpell fireDefence = fireFactory.createDefenceSpell();

fireAttack.cast();
fireDefence.cast();
```
### 5. Clean Code Principles

The project follows several Clean Code principles.  

**5.1 Meaningful Names**

Classes, methods and variables have names that describe their purpose.  

For example:  
`SpellCaster fireCaster = new FireSpellCaster();`

The name fireCaster clearly describes what the object represents.

**5.2 Small Methods**

Methods perform a small and specific task.

For example:  
```
public void castSpell() {
Spell spell = createSpell();
spell.cast();
}
```

The method is responsible only for creating a spell and casting it.  
The concrete spell creation is delegated to the Factory Method.

**5.3 Focused Classes**

Each class has a specific responsibility.

Examples:  
1. `FireSpell` represents a fire spell.
2. `IceSpell` represents an ice spell.
3. `SpellCaster` defines the Factory Method.
4. `FireSpellCaster` creates fire spells.
5. `FireMagicFactory` creates the Fire spell family.
6. `IceMagicFactory` creates the Ice spell family.

This keeps responsibilities separated between classes.

**5.4 Consistent Project Organization**

The project separates the two design patterns into different packages:

`factorymethod/`  
`abstractfactory/`

Classes related to Factory Method are placed in the `factorymethod`
package, while classes related to Abstract Factory are placed in the
`abstractfactory` package.

**5.5 Avoiding Magic Numbers**

The project does not use unexplained numeric values in its logic.

For example, there are no hard-coded values such as:  
`int damage = 50;`  
`int mana = 100;`

Instead, the example focuses on object creation and spell casting.

The output messages are directly related to the behavior of each spell.

### 6. Example Output

When the program is executed, the output is:

```
-Factory method-
Casting Firaball. Enemy burned.
Casting Ice Shard. Enemy frozen.

-Abstract factory-
Fire attack! Fireball hits the enemy
Firewall! Now you are under big wall made of flame
Ice attack! Ice shard hits the enemy
Ice wall! Now you are under big wall made of ice
```
### 7. How to Run
1. Open the project in IntelliJ IDEA.
2. Make sure a Java SDK is configured.
3. Open Main.java.
4. Run the main() method.

### 8. Technologies
1. Java
2. IntelliJ IDEA
3. Git
4. GitHub

### 9. Conclusion

This project demonstrates how Factory Method and Abstract Factory can be
used to organize object creation.

Factory Method allows different spell casters to create different types
of individual spells.

Abstract Factory allows the application to create consistent families of
related Fire and Ice spells.

Both patterns reduce direct dependencies on concrete classes and make
the object creation process more organized and easier to extend.