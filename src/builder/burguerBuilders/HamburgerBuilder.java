package builder.burguerBuilders;

public abstract class HamburgerBuilder {

    public Hamburger hamburger;

    public Hamburger getHamburger(){
        return hamburger;
    }

    public void makeHamburger(){
        hamburger = new Hamburger();
    }

    public abstract void buildSauce();
    public abstract void buildBread();
    public abstract void buildMeat();
}
