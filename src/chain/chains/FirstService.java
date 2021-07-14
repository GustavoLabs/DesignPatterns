package chain.chains;

import chain.chains.options.ourStores.OurStores;

import java.util.Random;
import java.util.Scanner;

public class FirstService implements Chain {

    private Chain nextInChain;

    private final String[] attendants = {"Gui", "Bia", "Lia", "Enzo"};

    public String getAttendant() {
        Random rand = new Random();
        int position = rand.nextInt(4);
        return attendants[position];
    }

    @Override
    public void setNextChain(Chain nextChain) {
        this.nextInChain = nextChain;
    }

    @Override
    public void serviceOptions() {
        switch (FirstServiceOptions()) {
            case 1: {
                setNextChain(new OurStores());
                nextInChain.serviceOptions();
            }
            case 2: {

            }
        }
    }

    public int FirstServiceOptions() {
        int option;
        Scanner scan = new Scanner((System.in));
        System.out.println("Welcome, \n I'm  " + getAttendant() + ".");
        System.out.println("Please, select one of the following options.");
        System.out.println("-> 1 - Our Stores ");
        System.out.println("-> 2 - Track your order");
        System.out.println("-> 3 - Details of ours plans");
        System.out.println("-> 4 - Repeat the options");
        System.out.print("Your option -> ");
        option = scan.nextInt();
        return option;
    }
}
