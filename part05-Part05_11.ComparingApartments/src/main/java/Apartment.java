
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    // Part 1 - Comparing Size of object being called vs object being compared as
    // parameter
    public boolean largerThan(Apartment compared) {
        return this.squares > compared.squares;
    }

    // Part 2 - Price Difference
    public int priceDifference(Apartment compared) {
        // Math.abs returns the absolute value
        // return Math.abs(this.price() - compared.price());
        int thisPrice = this.princePerSquare * this.squares;
        int comparedPrice = compared.princePerSquare * compared.squares;

        if (thisPrice > comparedPrice) {
            return thisPrice - comparedPrice;
        } else {
            return comparedPrice - thisPrice;
        }

    }

    // Part 3 - More Expensive
    public boolean moreExpensiveThan(Apartment compared) {
        int thisPrice = this.squares * this.princePerSquare;
        int comparedPrice = compared.squares * compared.princePerSquare;
        return thisPrice > comparedPrice;
    }
}
