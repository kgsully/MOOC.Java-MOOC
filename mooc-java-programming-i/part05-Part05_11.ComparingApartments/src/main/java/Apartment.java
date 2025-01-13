
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.squares) {
            return true;
        }
        return false;
    }

    public int priceDifference(Apartment compared) {
        int priceThis = squares * pricePerSquare;
        int priceCompared = compared.squares * compared.pricePerSquare;
        return Math.abs(priceThis - priceCompared);
    }

    public boolean moreExpensiveThan(Apartment compared) {
        if ((squares * pricePerSquare) > (compared.squares * compared.pricePerSquare)) {
            return true;
        }
        return false;
    }
}
