
public class PaymentTerminal {

    private double money; // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals; // number of sold hearty meals

    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000;
        this.affordableMeals = 0;
        this.heartyMeals = 0;
    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable mean and return the
        // change
        // if the payment parameter is not large enough, no meal is sold and the method
        // should return the whole payment
        double affordableMealPrice = 2.50; // Meal Price
        if (payment >= affordableMealPrice) { // Payment is sufficient for meal price
            this.money += affordableMealPrice; // Cash increase via price of meal
            this.affordableMeals++; // Number of sold meals increase by 1
            return payment - affordableMealPrice; // Change = payment price - meal price
        }
        return payment; // Return original payment price if not enough money for meal
    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the
        // change
        // if the payment parameter is not large enough, no meal is sold and the method
        // should return the whole payment
        double heartyMealPrice = 4.30; // meal price
        if (payment >= heartyMealPrice) { // is payment large enough?
            this.money += heartyMealPrice; // increasing cash
            this.heartyMeals++; // tracking
            return payment - heartyMealPrice; // returning change
        }
        return payment; // payment not large enough
    }

    // Part 3 - Card Payments
    // Method Overload - same method but different parameter

    public boolean eatAffordably(PaymentCard card) {
        double affordableMealPrice = 2.50;
        // takeMoney was the method we wrote in part 1 which if balance is more or equal
        // to amount
        // passed in parameter we take the amount away from balance and return true
        if (card.takeMoney(affordableMealPrice)) {
            this.affordableMeals++;
            return true;
        }
        return false;
    }

    public boolean eatHeartily(PaymentCard card) {
        double heartyMealPrice = 4.30;
        if (card.takeMoney(heartyMealPrice)) {
            this.heartyMeals++;
            return true;
        }
        return false;
    }

    // Part 4 - Adding Money
    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum > 0) {
            card.addMoney(sum);
            this.money += sum;
        }
    }

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals
                + ", number of sold hearty meals: " + heartyMeals;
    }
}
