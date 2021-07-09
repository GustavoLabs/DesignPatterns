package builder.burguerBuilders;

public class TraditionalBurger extends HamburgerBuilder {

    @Override
    public void buildSauce() {
        hamburger.setSauce("traditional");
    }

    @Override
    public void buildBread() {
        hamburger.setBread("brioche");
    }

    @Override
    public void buildMeat() {
        hamburger.setMeat("beef burger with bacon");
    }
}
