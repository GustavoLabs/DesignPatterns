package chain.chains.options.trackOrder;

import chain.chains.Chain;
import chain.chains.FirstService;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TrackInfo implements Chain {

    private static final String REGEX = "[A-Z]{2}[0-9]{5}";

    private Chain nextInChain;

    @Override
    public void setNextChain(Chain nextChain) {
        this.nextInChain = nextChain;
    }

    @Override
    public void serviceOptions(){
        switch (selectOption()) {
            case 0:{
                System.exit(0);
                break;
            }
            case 1: {
                getTrackingCode();
                break;
            }
            case 2: {
                selectOption();
                break;
            }
            case 3: {
                setNextChain(new FirstService());
                nextInChain.serviceOptions();
                break;
            }
        }
    }

    public boolean checkMaskTrack(String track) {
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(track);
        return matcher.find();
    }

    public int selectOption() {
        Scanner scan = new Scanner(System.in);
        int option;

        System.out.println("-> To insert your tracking code, please press 1 and the tracking code.");
        System.out.println("-> To repeat, press 2.");
        System.out.println("-> To comeback to the previous menu press 3");
        System.out.println("-> To finish this attendance press 0.");

        System.out.print("Your option -> ");
        option = scan.nextInt();
        return option;
    }

    public void getTrackingCode() {
        Scanner scan = new Scanner(System.in);
        String trackingCode;

        System.out.println("-> Please inset bellow your tracking code:");
        System.out.print("-> Your tracking code here: ");
        trackingCode = scan.nextLine();

        System.out.println("Wait a moment, we are checking your tracking code..");
        System.out.print("Tracking");
        for (int i = 0; i < 5; i++) {
            System.out.print(".");
        }
        if (checkMaskTrack(trackingCode)){
            System.out.println("\nOk, here is location of your order ......");
            System.out.println("Thanks to buy with us, finishing the attendance..");
            System.exit(0);
        }else
            System.out.println("\nInvalid code, finishing the attendance");
        System.exit(0);
    }


}
