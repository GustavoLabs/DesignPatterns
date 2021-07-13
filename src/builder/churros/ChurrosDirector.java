package builder.churros;

public class ChurrosDirector {

    private ChurrosBuilder churrosBuilder;


    public void setChurrosBuilder(ChurrosBuilder churrosBuilder) {
        this.churrosBuilder = churrosBuilder;
    }

    public Churros getChurros(){
        return churrosBuilder.getChurros();
    }

    public void constructChurros(){
        churrosBuilder.makeChurros();
        churrosBuilder.buildSauce();
        churrosBuilder.buildCoating();
    }
}
