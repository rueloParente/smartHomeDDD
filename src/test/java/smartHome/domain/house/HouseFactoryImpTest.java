package smartHome.domain.house;

import org.junit.jupiter.api.Test;
import smartHome.domain.valueObject.Address;
import smartHome.domain.valueObject.Gps;
import smartHome.domain.valueObject.ZipCode;

import static org.junit.jupiter.api.Assertions.*;

class HouseFactoryImpTest {
    @Test
    void shouldCreateHouseWhenGivenValidAddressGpsAndZipCode() {
        // Given
        Address address = new Address("1234", "Main St", "Springfield", 50);
        Gps gps = new Gps(39.781721, -89.650148);
        ZipCode zipCode = new ZipCode(4200, 540);
        HouseFactoryImp houseFactoryImp = new HouseFactoryImp();

        // When
        House house = houseFactoryImp.createHouse(address, gps, zipCode);

        // Then
        assertNotNull(house);
    }

}