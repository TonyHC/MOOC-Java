
package FlightControl.domain;


public class Place {
    private String location;
    
    public Place(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return location;
    }
}
