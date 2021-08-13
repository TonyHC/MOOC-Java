
package FlightControl.logic;

import FlightControl.domain.Airplane;
import FlightControl.domain.Flight;
import FlightControl.domain.Place;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class FlightControl {
    private Map<String, Airplane> airplanes;
    private Map<String, Place> locations;
    private Map<String, Flight> flights;
    
    public FlightControl() {
        this.airplanes = new HashMap<>();
        this.locations = new HashMap<>();
        this.flights = new HashMap<>();
    }
    
    public void addAirplane(String identifier, int capacity) {
        Airplane airplane = new Airplane(identifier, capacity);
        this.airplanes.put(identifier, airplane);
    }
    
    public void addFlight(Airplane plane, String departureID, String destinationID) {
        this.locations.putIfAbsent(departureID, new Place(departureID));
        this.locations.putIfAbsent(destinationID, new Place(destinationID));

        Flight flight = new Flight(plane, this.locations.get(departureID), this.locations.get(destinationID));
        this.flights.put(flight.toString(), flight);
    }

    public Collection<Airplane> getAirplanes() {
        return airplanes.values();
    }

    public Collection<Flight> getFlights() {
        return flights.values();
    }
    
    public Airplane getAirplane(String identifier) {
        return airplanes.get(identifier);
    }
}
