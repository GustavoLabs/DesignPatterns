package adapter;

import adapter.coin.Dollar;
import adapter.coin.RealAdapter;
import adapter.human.Ciborgue;
import adapter.human.HumanAdapter;
import adapter.human.NormalGuy;
import adapter.human.Robot;

public class Main {

    public static void main(String[] args) {

        NormalGuy guy = new NormalGuy();
        Ciborgue robot = new Ciborgue();

        Robot humanAdapter = new HumanAdapter(guy);

        System.out.println("Normal Guy: ");
        guy.eat();
        guy.fun();
        guy.work();
        guy.sleep();

        System.out.println("\nRobot: ");
        robot.charge();

        System.out.println("\nHuman Adapter: ");
        humanAdapter.charge();

        Dollar dollar = new Dollar(1);
        RealAdapter real = new RealAdapter(dollar);

        System.out.println("\n\n");

        System.out.println(" $: " + dollar.getValue());
        System.out.println("R$: " + real.getValue());

    }
}
