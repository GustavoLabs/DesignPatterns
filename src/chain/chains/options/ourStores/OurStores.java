package chain.chains.options.ourStores;

import chain.chains.Chain;
import chain.chains.FirstService;

import java.util.Scanner;

public class OurStores implements Chain {

    private Chain nextInChain;

    @Override
    public void setNextChain(Chain nextChain) {
        this.nextInChain = nextChain;
    }

    @Override
    public void serviceOptions() {
        switch (selectOption()) {
            case 1: {
                setNextChain(new BrazilStores());
                nextInChain.serviceOptions();
            }
            case 2: {
                setNextChain(new USAStore());
                nextInChain.serviceOptions();
            }
            case 3:{
                serviceOptions();
            }
            case 4:{
                setNextChain(new FirstService());
                nextInChain.serviceOptions();
            }
            default: {
                System.out.println("Invalid option, finishing this call");
                System.exit(0);
            }
        }
    }


    private int selectOption() {
        Scanner scan = new Scanner(System.in);
        int option;

        System.out.println("Please, tell us what is your country: ");
        System.out.println("-> If you live in Brazil, press 1;");
        System.out.println("-> If you live in USA, press 2;");
        System.out.println("-> To repeat, press 3.");
        System.out.println("-> To comeback to the previous menu press 4");

        System.out.print("Your option -> ");
        option = scan.nextInt();
        return option;
    }

}
