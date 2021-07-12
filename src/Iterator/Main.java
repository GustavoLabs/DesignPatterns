package Iterator;

import Iterator.food.AllDayFood;
import Iterator.food.Breakfast;
import Iterator.food.Dinner;
import Iterator.food.Lunch;

public class Main {

    public static void main(String[] args) {
        Breakfast breakfast = new Breakfast();
        Lunch lunch = new Lunch();
        Dinner dinner = new Dinner();

        AllDayFood allFood = new AllDayFood(breakfast, lunch, dinner);
        allFood.printAllFood();
        System.out.println("\n\n ----------------------------------");
        allFood.fullWeight();
    }
}
