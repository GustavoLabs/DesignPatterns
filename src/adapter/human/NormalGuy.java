package adapter.human;

public class NormalGuy implements Human{
    @Override
    public void eat() {
        System.out.println("Eating...");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping...");
    }

    @Override
    public void work() {
        System.out.println("Working...");
    }

    @Override
    public void fun() {
        System.out.println("Having fun...");
    }
}
