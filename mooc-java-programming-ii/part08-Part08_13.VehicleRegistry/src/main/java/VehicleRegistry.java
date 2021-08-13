
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;


public class VehicleRegistry {
    private HashMap<LicensePlate, String> vehicleRegistry;
    
    public VehicleRegistry() {
        this.vehicleRegistry = new HashMap<>();
    }
    
    public boolean add(LicensePlate licensePlate, String owner) {
        if(!this.vehicleRegistry.containsKey(licensePlate)) {
            this.vehicleRegistry.put(licensePlate, owner);
            return true;
        }
        
        return false;
    }
    
    public String get(LicensePlate licensePlate) {
        return this.vehicleRegistry.get(licensePlate);
    }
    
    public boolean remove(LicensePlate licensePlate) {
        String removedOwner = this.vehicleRegistry.remove(licensePlate);
        if(removedOwner != null) {
            return true;
        }
        
        return false;
    }
    
    public void printLicensePlates() {
        for(LicensePlate licensePlate : this.vehicleRegistry.keySet()) {
            System.out.println(licensePlate);
        }
    }
    
    public void printOwners() {
        ArrayList<String> owners = new ArrayList<>();
        for(String owner : this.vehicleRegistry.values()) {
            if(!owners.contains(owner)) {
                owners.add(owner);
                System.out.println(owner);
            }
        }
    }
}
