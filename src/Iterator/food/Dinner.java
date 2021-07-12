package Iterator.food;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Dinner implements FoodIterator {

    private final List<Food> lunchFood = new LinkedList<>();

    public Dinner() {
       addFood("pasta", 0.5);
       addFood("Sauce", 0.1);
    }

    @Override
    public Iterator<Food> createIterator() {
        return lunchFood.iterator();
    }

    public void addFood(String name, double weight){
        lunchFood.add(new Food(name, weight));
    }
}
