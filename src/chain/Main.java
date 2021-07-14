package chain;

import chain.chains.FirstService;

public class Main {

    static boolean returnToStart = false;
    public static void main(String[] args) {

        FirstService firstService = new FirstService();

        firstService.serviceOptions();
    }
}
