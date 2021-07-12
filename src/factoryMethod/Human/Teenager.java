package factoryMethod.Human;

import factoryMethod.Human.Human;

public class Teenager implements Human {
    @Override
    public void whatToDo() {
        System.out.println("I have to study..");
    }
}
