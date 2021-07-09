package builder.burguerBuilders;

public class BurgerDirector {

    private HamburgerBuilder burgerBuilder;

    public void setBurgerBuilder(HamburgerBuilder hb){
        burgerBuilder = hb;
    }

    public Hamburger getBurger(){
        return burgerBuilder.getHamburger();
    }

    public void constructBurger(){
        burgerBuilder.makeHamburger();
        burgerBuilder.buildBread();
        burgerBuilder.buildSauce();
        burgerBuilder.buildMeat();
    }
}
