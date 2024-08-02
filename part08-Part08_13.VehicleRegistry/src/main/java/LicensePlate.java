
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

    @Override
    public boolean equals(Object obj) {
        if(obj == null || this.getClass() != obj.getClass()){
           return false;
        }   
        
        if(obj == this){
           return true;
        }   
        
        LicensePlate compared = (LicensePlate) obj;
        
        return this.liNumber.equals(compared.liNumber) && this.country.equals(compared.country);
    }

    @Override
    public int hashCode() {
        return this.country.hashCode() + this.liNumber.hashCode();
    }

}
