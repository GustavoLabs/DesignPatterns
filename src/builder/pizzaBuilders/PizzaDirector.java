package builder.pizzaBuilders;

public class PizzaDirector {
    private PizzaBuilder pizzaBuilder;

    public void setPizzaBuilder(PizzaBuilder pb){
        pizzaBuilder = pb;
    }

    public Pizza getPizza(){
        return pizzaBuilder.getPizza();
    }

    public void constructPizza(){
        pizzaBuilder.makePizza();
        pizzaBuilder.buildDough();
        pizzaBuilder.buildSauce();
        pizzaBuilder.buildTopping();
    }
}
