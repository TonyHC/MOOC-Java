
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
        if((this.rooms * this.squares) > (compared.rooms * compared.squares)) {
            return true;
        }
        
        return false;
    }
    
    public int priceDifference(Apartment compared) {
        int difference = (this.squares * this.pricePerSquare) - (compared.squares * compared.pricePerSquare);
        if(difference < 0) {
            difference *= -1;
        }
        
        return difference;
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        if(this.pricePerSquare > compared.pricePerSquare) {
            return true;
        }
        
        return false;
    }
}
