package smartHome.domain.house;

import smartHome.domain.valueObject.Address;
import smartHome.domain.valueObject.Gps;
import smartHome.domain.valueObject.ZipCode;

public class HouseFactoryImp {
    public House createHouse(Address address, Gps gps, ZipCode zipCode) {
        return new House(address, gps, zipCode);
    }
}
