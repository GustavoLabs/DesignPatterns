package factoryMethod.Human;

import factoryMethod.Human.Human;

public class LittleKid implements Human {
    @Override
    public void whatToDo() {
        System.out.println("I have to play with my friends...");
    }
}
