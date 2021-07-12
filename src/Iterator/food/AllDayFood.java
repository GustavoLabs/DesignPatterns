package Iterator.food;

import java.util.Iterator;

public class AllDayFood {

    Breakfast breakfast;
    Lunch lunch;
    Dinner dinner;

    public AllDayFood(Breakfast breakfast, Lunch lunch, Dinner dinner) {
        this.breakfast = breakfast;
        this.lunch = lunch;
        this.dinner = dinner;
    }

    public void printAllFood() {

        Iterator<Food> breakfastIterator = breakfast.createIterator();
        Iterator<Food> lunchIterator = lunch.createIterator();
        Iterator<Food> dinnerIterator = dinner.createIterator();

        System.out.println("Breakfast ");
        printFood(breakfastIterator);

        System.out.println("\nLunch ");
        printFood(lunchIterator);

        System.out.println("\nDinner");
        printFood(dinnerIterator);
    }

    private void printFood(Iterator<Food> iterator) {
        while (iterator.hasNext()) {

            Food food = iterator.next();
            System.out.print(" -> Name: " + food.getName());
            System.out.print(" | Weight: " + food.getWeight() + "\n");
        }
    }

    public void fullWeight(){
        double fullWeight = 0;
        Iterator<Food> breakfastIterator = breakfast.createIterator();
        Iterator<Food> lunchIterator = lunch.createIterator();
        Iterator<Food> dinnerIterator = dinner.createIterator();

        double breakfastWeight = weightOfEachMeal(breakfastIterator);
        double lunchWeight = weightOfEachMeal(lunchIterator);
        double dinnerWeight = weightOfEachMeal(dinnerIterator);

        System.out.printf(" -> Breakfast Weight: %.2f%n", breakfastWeight);
        System.out.printf(" -> Lunch Weight: %.2f%n", lunchWeight);
        System.out.printf(" -> Dinner Weight: %.2f%n", dinnerWeight);

        fullWeight += breakfastWeight + lunchWeight + dinnerWeight;

        System.out.printf(" -> Total on day: %.2f%n", fullWeight);

    }

    private double weightOfEachMeal(Iterator<Food> iterator) {
        double weight = 0;
        while (iterator.hasNext()) {
            Food food = iterator.next();
            weight += food.getWeight();
        }

        return weight;
    }

}
