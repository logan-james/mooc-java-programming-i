
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
    public Money plus(Money addition) {
        int newEuros = this.euros + addition.euros();
        int newCents = this.cents + addition.cents();

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
