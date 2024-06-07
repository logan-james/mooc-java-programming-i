
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    // Exercise
    // Part 1
    // method should return new money object that is worth total amount for
    // object whose method was called and the object that is received as the
    // parameter
    public Money plus(Money addition) {
        // creating new variables that take current money + the addition money
        int newEuros = this.euros + addition.euros();
        int newCents = this.cents + addition.cents();

        // logic for money, if cents equals or over 100, add to euros, remainder goes to
        // cents
        if (newCents >= 100) {
            newEuros += newCents / 100;
            newCents = newCents % 100;
        }

        return new Money(newEuros, newCents);
    }

    // Part 2
    public boolean lessThan(Money compared) {
        if (this.euros < compared.euros()) {
            return true;
        }

        if (this.euros == compared.euros() && this.cents < compared.cents()) {
            return true;
        }

        return false;
    }

    // Part 3
    public Money minus(Money decreaser) {
        int newEuros = this.euros - decreaser.euros();
        int newCents = this.cents - decreaser.cents();

        if (newCents < 0) {
            newEuros -= 1;
            newCents += 100;
        }

        if (newEuros < 0) {
            newEuros = 0;
            newCents = 0;
        }

        return new Money(newEuros, newCents);
    }

}
