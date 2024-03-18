package smartHome.domain.valueObject;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddressTest {
    @Test
    void shouldInstantiateAddressWhenStreetCityCountryAndDoorNumberAreValid() {
        // Arrange
        String street = "Rua do Ouro";
        String city = "Porto";
        String country = "Portugal";
        int doorNumber = 123;
        // Act
        new Address(street, city, country, doorNumber);

    }
    @Test
    void shouldThrowIllegalArgumentExceptionWhenStreetIsInvalid() {
        // Arrange
        String street = "";
        String city = "Porto";
        String country = "Portugal";
        int doorNumber = 123;
        String expectedErrorMessage = "Please enter a valid street.";
        // Act
        Exception exception = assertThrows(IllegalArgumentException.class, () -> new Address(street, city, country, doorNumber));
        // Assert
        assertEquals(expectedErrorMessage, exception.getMessage());
    }
    @Test
    void shouldThrowIllegalArgumentExceptionWhenCityIsInvalid() {
        // Arrange
        String street = "Rua do Ouro";
        String city = "";
        String country = "Portugal";
        int doorNumber = 123;
        String expectedErrorMessage = "Please enter a valid city.";
        // Act
        Exception exception = assertThrows(IllegalArgumentException.class, () -> new Address(street, city, country, doorNumber));
        // Assert
        assertEquals(expectedErrorMessage, exception.getMessage());
    }
    @Test
    void shouldThrowIllegalArgumentExceptionWhenCountryIsInvalid() {
        // Arrange
        String street = "Rua do Ouro";
        String city = "Porto";
        String country = "";
        int doorNumber = 123;
        String expectedErrorMessage = "Please enter a valid country.";
        // Act
        Exception exception = assertThrows(IllegalArgumentException.class, () -> new Address(street, city, country, doorNumber));
        // Assert
        assertEquals(expectedErrorMessage, exception.getMessage());
    }
    @Test
    void shouldThrowIllegalArgumentExceptionWhenDoorNumberIsInvalid() {
        // Arrange
        String street = "Rua do Ouro";
        String city = "Porto";
        String country = "Portugal";
        int doorNumber = -1;
        String expectedErrorMessage = "Please enter a valid door number.";
        // Act
        Exception exception = assertThrows(IllegalArgumentException.class, () -> new Address(street, city, country, doorNumber));
        // Assert
        assertEquals(expectedErrorMessage, exception.getMessage());
    }
    @Test
    void shouldReturnStreet() {
        // Arrange
        String street = "Rua do Ouro";
        String city = "Porto";
        String country = "Portugal";
        int doorNumber = 123;
        Address address = new Address(street, city, country, doorNumber);
        // Act
        String result = address.getStreet();
        // Assert
        assertEquals(street, result);
    }
    @Test
    void shouldReturnCity() {
        // Arrange
        String street = "Rua do Ouro";
        String city = "Porto";
        String country = "Portugal";
        int doorNumber = 123;
        Address address = new Address(street, city, country, doorNumber);
        // Act
        String result = address.getCity();
        // Assert
        assertEquals(city, result);
    }
    @Test
    void shouldReturnCountry() {
        // Arrange
        String street = "Rua do Ouro";
        String city = "Porto";
        String country = "Portugal";
        int doorNumber = 123;
        Address address = new Address(street, city, country, doorNumber);
        // Act
        String result = address.getCountry();
        // Assert
        assertEquals(country, result);
    }
    @Test
    void shouldReturnDoorNumber() {
        // Arrange
        String street = "Rua do Ouro";
        String city = "Porto";
        String country = "Portugal";
        int doorNumber = 123;
        Address address = new Address(street, city, country, doorNumber);
        // Act
        int result = address.getDoorNumber();
        // Assert
        assertEquals(doorNumber, result);
    }

    @Test
    void shouldReturnEqualsWhenComparingTwoEqualAddresses() {
        // Arrange
        String street = "Rua do Ouro";
        String city = "Porto";
        String country = "Portugal";
        int doorNumber = 123;
        Address address1 = new Address(street, city, country, doorNumber);
        Address address2 = new Address(street, city, country, doorNumber);
        // Act
        boolean result = address1.equals(address2);
        // Assert
        assertTrue(result);
    }

}