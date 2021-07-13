package builder.churros;

public class DulceDeLecheChurros extends ChurrosBuilder{

    @Override
    public void buildSauce() {
        churros.setSauce("Dulce de Leche");
    }

    @Override
    public void buildCoating() {
        churros.setCoating("Sugar");
    }
}
