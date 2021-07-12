package factoryMethod;

import factoryMethod.Human.FactoryHuman;
import factoryMethod.Human.Human;

public class Main {

    public static void main(String[] args) {


        FactoryHuman factory = new FactoryHuman();

        Human person = factory.createNewPersonByAge(7);

        person.whatToDo();


    }
}
