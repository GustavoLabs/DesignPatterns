package chain.chains.options.ourStores;

import chain.chains.Chain;

import java.util.Scanner;

public class BrazilStores implements Chain {

    private  Chain nextInChain;

    @Override
    public void setNextChain(Chain nextChain) {
        this.nextInChain = nextChain;
    }

    @Override
    public void serviceOptions(){
        if(selectOption() == 1){
            setNextChain(new OurStores());
            nextInChain.serviceOptions();
        } else {
            System.exit(0);
        }

    }

    public int selectOption(){
        Scanner scan = new Scanner(System.in);
        int option;
        System.out.println("We have a store in Nova Odessa, whose address is: Rua Principal, 999 - Center");
        System.out.println("We also have a store in Campinas, whose address is: Rua Principal, 12314 - Center");
        System.out.println("To finish this attendance press 0 and to comeback to the previous menu press 1 ");

        System.out.print("Your option -> ");
        option = scan.nextInt();
        return option;
    }
}
