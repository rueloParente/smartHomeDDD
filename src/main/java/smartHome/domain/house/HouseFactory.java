package smartHome.domain.house;
import smartHome.domain.valueObject.Address;
import smartHome.domain.valueObject.Gps;
import smartHome.domain.valueObject.ZipCode;

public interface HouseFactory {
    public House createHouse(Address address, Gps gps, ZipCode zipCode);
}
