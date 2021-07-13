package builder.churrosBuilders;

public abstract class ChurrosBuilder {
    Churros churros;

    public void makeChurros(){
        churros = new Churros();
    }

    public Churros getChurros(){
        return churros;
    }

    public abstract void buildSauce();
    public abstract void buildCoating();

}
