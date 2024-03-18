package smartHome.domain.valueObject;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZipCodeTest {
    @Test
    void shouldInstantiateZipCodeWhenFirstPartAndSecondPartAreValid() {
        // Arrange
        int firstPart = 1234;
        int secondPart = 567;
        // Act
        new ZipCode(firstPart, secondPart);
    }
    @Test
    void shouldThrowIllegalArgumentExceptionWhenFirstPartIsInvalid() {
        // Arrange
        int firstPart = 123;
        int secondPart = 567;
        String expectedErrorMessage = "Please enter a valid first part.";
        // Act
        Exception exception = assertThrows(IllegalArgumentException.class, () -> new ZipCode(firstPart, secondPart));
        // Assert
        assertEquals(expectedErrorMessage, exception.getMessage());
    }
    @Test
    void shouldThrowIllegalArgumentExceptionWhenSecondPartIsInvalid() {
        // Arrange
        int firstPart = 1234;
        int secondPart = 56;
        String expectedErrorMessage = "Please enter a valid second part.";
        // Act
        Exception exception = assertThrows(IllegalArgumentException.class, () -> new ZipCode(firstPart, secondPart));
        // Assert
        assertEquals(expectedErrorMessage, exception.getMessage());
    }
    @Test
    void shouldReturnTrueWhenComparingTwoEqualZipCodes() {
        // Arrange
        int firstPart = 1234;
        int secondPart = 567;
        ZipCode zipCode1 = new ZipCode(firstPart, secondPart);
        ZipCode zipCode2 = new ZipCode(firstPart, secondPart);
        // Act
        boolean result = zipCode1.equals(zipCode2);
        // Assert
        assertTrue(result);
    }
    @Test
    void shouldReturnFalseWhenComparingTwoDifferentZipCodes() {
        // Arrange
        int firstPart1 = 1234;
        int secondPart1 = 567;
        int firstPart2 = 4321;
        int secondPart2 = 765;
        ZipCode zipCode1 = new ZipCode(firstPart1, secondPart1);
        ZipCode zipCode2 = new ZipCode(firstPart2, secondPart2);
        // Act
        boolean result = zipCode1.equals(zipCode2);
        // Assert
        assertFalse(result);
    }
}