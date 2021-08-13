
import java.util.Objects;

public class LicensePlate {
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }

    /*
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final LicensePlate other = (LicensePlate) obj;
        if (!Objects.equals(this.liNumber, other.liNumber)) {
            return false;
        }
        if (!Objects.equals(this.country, other.country)) {
            return false;
        }
        return true;
    }
    */
    
     @Override
    public boolean equals(Object compared) {
        if(this == compared) {
            return true;
        }
        
        if(compared == null) {
            return false;
        }
        
        if(!(compared instanceof LicensePlate)) {
            return false;
        }
        
        final LicensePlate licensePlateObject = (LicensePlate) compared;
        
        if(!this.liNumber.equals(licensePlateObject.liNumber)) {
            return false;
        }
        
        if(!this.country.equals(licensePlateObject.country)) {
            return false;
        }
        
        return true;
    }
    
    @Override
    public int hashCode() {
        if((this.liNumber == null && this.country == null) || (this.liNumber == null) ||
                (this.country == null)) {
            return -1;
        }

        return this.liNumber.hashCode() + this.country.hashCode();
    }
}
