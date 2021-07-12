package adapter.human;

public class HumanAdapter implements Robot{
    Human human;

    public HumanAdapter (Human human){
        this.human = human;
    }

    @Override
    public void charge() {
        human.eat();
    }
}
