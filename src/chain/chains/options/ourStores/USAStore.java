package chain.chains.options.ourStores;

import chain.chains.Chain;

import java.util.Scanner;

public class USAStore implements Chain {

    private  Chain nextInChain;

    @Override
    public void setNextChain(Chain nextChain) {
        this.nextInChain = nextChain;
    }

    @Override
    public void serviceOptions(){
        if(selectOption().equals("1")){
            setNextChain(new OurStores());
            nextInChain.serviceOptions();
        } else {
            System.exit(0);
        }

    }

    public String selectOption(){
        Scanner scan = new Scanner(System.in);
        String option;
        System.out.println("We have a store in New York, whose address is: 111 W 71st St, New York, NY 10023, USA");
        System.out.println("To finish this call press 0 ans to comeback to the previous menu press 1 ");

        System.out.print("Your option -> ");
        option = scan.nextLine();
        return option;
    }
}
