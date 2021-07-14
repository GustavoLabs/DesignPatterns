package chain.chains.options.plans;

import chain.chains.Chain;

import java.util.Scanner;

public class FamilyPlan implements Chain {

    private Chain nextInChain;


    @Override
    public void setNextChain(Chain nextChain) {
        this.nextInChain = nextChain;
    }

    @Override
    public void serviceOptions(){
        switch (familyPlan()) {
            case 1: {
                setNextChain(new IndividualPlan());
                nextInChain.serviceOptions();
                break;
            }
            case 2: {
                setNextChain(new OurPlans());
                nextInChain.serviceOptions();
                break;
            }
            default:{
                System.out.println("Invalid option, finishing the attendance");
                System.exit(0);
            }
        }
    }

    public int familyPlan() {
        Scanner scan = new Scanner((System.in));
        int option;
        System.out.println("-> With our family plan you and your family will receive every month:");
        System.out.println("- 3 Shirts");
        System.out.println("- 2 Shorts");
        System.out.println("- 4 Posters");
        System.out.println("-> To know more about our individual plan, press 1");
        System.out.println("-> to return to the previous menu, press 2");

        System.out.print("Your option -> ");

        option = scan.nextInt();
        return option;
    }
}



