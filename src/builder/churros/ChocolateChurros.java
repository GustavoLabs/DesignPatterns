package builder.churros;

public class ChocolateChurros extends ChurrosBuilder{

    @Override
    public void buildSauce() {
        churros.setSauce("Chocolate");
    }

    @Override
    public void buildCoating() {
        churros.setCoating("Sugar");
    }
}
