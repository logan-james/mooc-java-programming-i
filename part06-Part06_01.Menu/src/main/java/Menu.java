
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    // implement the required methods here
    public void addMeal(String meal) {

        // add meal to menu
        // if meal already on list, don't add
        if (!this.meals.contains(meal)) {
            this.meals.add(meal);
        }
    }

    // prints meals
    public void printMeals() {

        for (String meal : this.meals) {
            System.out.println(meal);
        }
    }

    // clears menu
    public void clearMenu() {

    }
}
