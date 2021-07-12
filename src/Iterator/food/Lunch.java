package Iterator.food;

import java.util.Arrays;
import java.util.Iterator;

public class Lunch implements FoodIterator {
    private final Food[] food;
    private int arrPosition = 0;

    public Lunch() {
        food = new Food[3];
        addFood("Bread", 0.5);
        addFood("Beans", 0.2);
        addFood("Meat", 0.4);

    }

    @Override
    public Iterator<Food> createIterator() {
        return Arrays.asList(food).iterator();
    }

    public void addFood(String name, double weight){

        Food foodInfo = new Food(name, weight);

        food[arrPosition] = foodInfo;
        arrPosition++;
    }
}
