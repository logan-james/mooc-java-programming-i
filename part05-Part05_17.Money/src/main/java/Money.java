
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
    public Money plus(Money addition) {
        int newEuros = this.euros + addition.euros();
        int newCents = this.cents + addition.cents();

        if (newCents >= 100) {
            newEuros += newCents / 100;
            newCents = newCents % 100;
        }

        return new Money(newEuros, newCents);
    }

}
