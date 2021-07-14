package chain.chains.options.plans;

import chain.chains.Chain;
import chain.chains.FirstService;

import java.util.Scanner;

public class OurPlans implements Chain {

    private Chain nextInChain;


    @Override
    public void setNextChain(Chain nextChain) {
        this.nextInChain = nextChain;
    }

    @Override
    public void serviceOptions(){
        switch (plansOptions()) {
            case 0:{
                System.exit(0);
                break;
            }
            case 1: {
                setNextChain(new IndividualPlan());
                nextInChain.serviceOptions();
                break;
            }
            case 2: {
                setNextChain(new FamilyPlan());
                nextInChain.serviceOptions();
                break;
            }
            case 3: {
                serviceOptions();
                break;
            }
            case 4:{
                setNextChain(new FirstService());
                nextInChain.serviceOptions();
                break;
            }
            default:{
                System.out.println("Invalid option, finishing the attendance");
                System.exit(0);
            }
        }
    }

    public int plansOptions() {
        Scanner scan = new Scanner((System.in));
        int option;
        System.out.println("-> Please, select one of your plans to know more about:");
        System.out.println("-> Press 1 for individual plan");
        System.out.println("-> Press 2 for family plan");
        System.out.println("-> To repeat, press 3.");
        System.out.println("-> To comeback to the previous menu press 4");
        System.out.println("-> To finish this attendance press 0.");

        System.out.print("Your option -> ");

        option = scan.nextInt();
        return option;
    }
}



