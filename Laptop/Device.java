import java.util.Comparator;
import java.util.Objects;
import java.util.Set;

public class Device{
   Brand brand;
   Integer ozu;
   Integer hdd;

public Device(Brand brand, Integer ozu, Integer hdd) {
        this.brand = brand;
        this.ozu = ozu;
        this.hdd = hdd;
    }

public Integer getHdd() {
        return this.hdd;
    }    

public Integer getOzu() {
        return this.ozu;
    }      

    @Override
    public String toString() {
        return String.format("Device { brand = %s, ozu = %s,  hdd = %s}", this.brand, this.ozu, this.hdd);
    }    

    @Override
    public boolean equals(Object obj) {
        Device dvs = (Device) obj;
        if (this == obj) {return true; }
        if (obj == null || this.getClass() != obj.getClass()) { return  false;}

        return this.brand.equals(dvs.brand) && this.ozu.equals(dvs.ozu) && this.hdd.equals(dvs.hdd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.brand, this.ozu, this.hdd);
    }
}
