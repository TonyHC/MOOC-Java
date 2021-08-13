
package FlightControl.domain;


public class Flight {
    private Airplane airplane;
    private Place depatureAirport;
    private Place destinationAirport;

    public Flight(Airplane airplane, Place depatureAirport, Place destinationAirport) {
        this.airplane = airplane;
        this.depatureAirport = depatureAirport;
        this.destinationAirport = destinationAirport;
    }

    public Airplane getAirplane() {
        return airplane;
    }

    public Place getDepatureAirport() {
        return depatureAirport;
    }

    public Place getDestinationAirport() {
        return destinationAirport;
    }

    @Override
    public String toString() {
        return airplane.toString() + " (" + depatureAirport + "-" + destinationAirport + ")";
    }
}
