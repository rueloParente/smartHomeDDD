package smartHome.domain.house;

import org.junit.jupiter.api.Test;
import smartHome.domain.valueObject.Address;
import smartHome.domain.valueObject.Gps;
import smartHome.domain.valueObject.HouseID;
import smartHome.domain.valueObject.ZipCode;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

class HouseTest {
    @Test
    void shouldInstantiateHouseWhenAddressGpsAndZipCodeAreValid() {
        //Arrange
        Address address = mock(Address.class);
        Gps gps = mock(Gps.class);
        ZipCode zipCode = mock(ZipCode.class);
        //Act
        new House(address, gps, zipCode);
    }
    @Test
    void shouldThrowExceptionWhenAddressIsNull() {
        //Arrange
        Address address = null;
        Gps gps = mock(Gps.class);
        ZipCode zipCode = mock(ZipCode.class);
        String expectedMessage = "Please enter a valid address.";
        //Act
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> new House(address, gps, zipCode));
        //Assert
        assertEquals(expectedMessage, exception.getMessage());
    }
    @Test
    void shouldThrowExceptionWhenGpsIsNull() {
        //Arrange
        Address address = mock(Address.class);
        Gps gps = null;
        ZipCode zipCode = mock(ZipCode.class);
        String expectedMessage = "Please enter a valid GPS.";
        //Act
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> new House(address, gps, zipCode));
        //Assert
        assertEquals(expectedMessage, exception.getMessage());
    }
    @Test
    void shouldThrowExceptionWhenZipCodeIsNull() {
        //Arrange
        Address address = mock(Address.class);
        Gps gps = mock(Gps.class);
        ZipCode zipCode = null;
        String expectedMessage = "Please enter a valid zip code.";
        //Act
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> new House(address, gps, zipCode));
        //Assert
        assertEquals(expectedMessage, exception.getMessage());
    }
    @Test
    void shouldReturnAddressWhenGetAddressIsCalled() {
        //Arrange
        Address address = mock(Address.class);
        Gps gps = mock(Gps.class);
        ZipCode zipCode = mock(ZipCode.class);
        House house = new House(address, gps, zipCode);
        //Act
        Address result = house.getAddress();
        //Assert
        assertEquals(address, result);
    }
    @Test
    void shouldReturnGpsWhenGetGpsIsCalled() {
        //Arrange
        Address address = mock(Address.class);
        Gps gps = mock(Gps.class);
        ZipCode zipCode = mock(ZipCode.class);
        House house = new House(address, gps, zipCode);
        //Act
        Gps result = house.getGps();
        //Assert
        assertEquals(gps, result);
    }
    @Test
    void shouldReturnZipCodeWhenGetZipCodeIsCalled() {
        //Arrange
        Address address = mock(Address.class);
        Gps gps = mock(Gps.class);
        ZipCode zipCode = mock(ZipCode.class);
        House house = new House(address, gps, zipCode);
        //Act
        ZipCode result = house.getZipCode();
        //Assert
        assertEquals(zipCode, result);
    }
    @Test
    void shouldReturnHouseIDWhenIdentityIsCalled() {
        //Arrange
        Address address = mock(Address.class);
        Gps gps = mock(Gps.class);
        ZipCode zipCode = mock(ZipCode.class);
        House house = new House(address, gps, zipCode);
        //Act
        HouseID result = house.identity();
        //Assert
        assertNotNull(result);
    }
    @Test
    void shouldReturnTrueWhenSameAsIsCalledWithSameHouse() {
        //Arrange
        Address address = mock(Address.class);
        Gps gps = mock(Gps.class);
        ZipCode zipCode = mock(ZipCode.class);
        House house = new House(address, gps, zipCode);
        //Act
        boolean result = house.sameAs(house);
        //Assert
        assertTrue(result);
    }

}