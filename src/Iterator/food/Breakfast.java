package Iterator.food;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Breakfast implements FoodIterator {
    private final List<Food> food = new ArrayList<>();

    public Breakfast() {
        addFood("Bread", 0.4);
        addFood("Milk", 0.2);
        addFood("Butter", 0.1);
    }

    @Override
    public Iterator<Food> createIterator() {
        return food.iterator();
    }

    public void addFood(String name, double weight){

        food.add(new Food(name, weight));

    }
}
