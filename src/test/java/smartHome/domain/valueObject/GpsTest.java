package smartHome.domain.valueObject;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GpsTest {
    @Test
    void shouldInstantiateValidGpsWhenLatitudeAndLongitudeAreValid() {
        // Arrange
        double latitude = 0;
        double longitude = 0;

        // Act
        new Gps(latitude, longitude);
    }
    @Test
    void shouldThrowIllegalArgumentExceptionWhenLatitudeIsLessThanMinus90() {
        // Arrange
        double latitude = -91;
        double longitude = 0;

        // Act
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> new Gps(latitude, longitude));

        // Assert
        assertEquals("Please enter a valid latitude.", exception.getMessage());
    }
    @Test
    void shouldThrowIllegalArgumentExceptionWhenLatitudeIsGreaterThan90() {
        // Arrange
        double latitude = 91;
        double longitude = 0;

        // Act
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> new Gps(latitude, longitude));

        // Assert
        assertEquals("Please enter a valid latitude.", exception.getMessage());
    }
    @Test
    void shouldThrowIllegalArgumentExceptionWhenLongitudeIsLessThanMinus180() {
        // Arrange
        double latitude = 0;
        double longitude = -181;

        // Act
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> new Gps(latitude, longitude));

        // Assert
        assertEquals("Please enter a valid longitude.", exception.getMessage());
    }
    @Test
    void shouldThrowIllegalArgumentExceptionWhenLongitudeIsGreaterThan180() {
        // Arrange
        double latitude = 0;
        double longitude = 181;

        // Act
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> new Gps(latitude, longitude));

        // Assert
        assertEquals("Please enter a valid longitude.", exception.getMessage());
    }
    @Test
    void shouldReturnLatitudeWhenGetLatitudeIsCalled() {
        // Arrange
        double latitude = 90;
        double longitude = 180;
        Gps gps = new Gps(latitude, longitude);

        // Act
        double result = gps.getLatitude();

        // Assert
        assertEquals(latitude, result);
    }
    @Test
    void shouldReturnLongitudeWhenGetLongitudeIsCalled() {
        // Arrange
        double latitude = -90;
        double longitude = -180;
        Gps gps = new Gps(latitude, longitude);

        // Act
        double result = gps.getLongitude();

        // Assert
        assertEquals(longitude, result);
    }
}