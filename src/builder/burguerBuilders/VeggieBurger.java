package builder.burguerBuilders;

public class VeggieBurger extends HamburgerBuilder{
    @Override
    public void buildSauce() {
        hamburger.setSauce("soy");
    }

    @Override
    public void buildBread() {
        hamburger.setBread("multigrain");
    }

    @Override
    public void buildMeat() {
        hamburger.setMeat("soy burger");
    }
}
