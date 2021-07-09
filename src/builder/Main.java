package builder;

import builder.burguerBuilders.BurgerDirector;
import builder.burguerBuilders.HamburgerBuilder;
import builder.burguerBuilders.TraditionalBurger;
import builder.burguerBuilders.VeggieBurger;
import builder.pizzaBuilders.ChickenPizzaBuilder;
import builder.pizzaBuilders.HamPizzaBuilder;
import builder.pizzaBuilders.PizzaDirector;

public class Main {

    public static void main(String[] args) {

        BurgerDirector waiter = new BurgerDirector();
        HamburgerBuilder traditionalBurger = new TraditionalBurger();
        HamburgerBuilder veggieBurger = new VeggieBurger();

        waiter.setBurgerBuilder(traditionalBurger);
        waiter.constructBurger();
        System.out.println(waiter.getBurger());

        waiter.setBurgerBuilder(veggieBurger);
        waiter.constructBurger();
        System.out.println(waiter.getBurger());

        System.out.println("-#-#-#- New Order -#-#-#- \n ");

        PizzaDirector pizzaWaiter = new PizzaDirector();

        pizzaWaiter.setPizzaBuilder( new HamPizzaBuilder());
        pizzaWaiter.constructPizza();
        System.out.println(pizzaWaiter.getPizza());

        pizzaWaiter.setPizzaBuilder( new ChickenPizzaBuilder());
        pizzaWaiter.constructPizza();
        System.out.println(pizzaWaiter.getPizza());
    }
}
