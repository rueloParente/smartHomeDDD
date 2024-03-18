package smartHome.domain.valueObject;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HouseFloorTest {
    @Test
    void shouldInstantiateHouseFloorWhenGivenValidBounds() {
        //Arrange
        int lowerBound = 0;
        int upperBound = 5;
        //Act
        new HouseFloor(lowerBound, upperBound);
    }
    @Test
    void shouldThrowExceptionWhenGivenInvalidLowerBound() {
        //Arrange
        int lowerBound = -6;
        int upperBound = 5;
        String expectedMessage = "Invalid floor bounds";
        //Act
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> new HouseFloor(lowerBound, upperBound));
        //Assert
        assertEquals(expectedMessage, exception.getMessage());
    }
    @Test
    void shouldThrowExceptionWhenGivenInvalidUpperBound() {
        //Arrange
        int lowerBound = 0;
        int upperBound = -1;
        String expectedMessage = "Invalid floor bounds";
        //Act
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> new HouseFloor(lowerBound, upperBound));
        //Assert
        assertEquals(expectedMessage, exception.getMessage());
    }
    @Test
    void shouldThrowExceptionWhenGivenLowerBoundGreaterThanUpperBound() {
        //Arrange
        int lowerBound = 5;
        int upperBound = 0;
        String expectedMessage = "Lower bound cannot be greater than upper bound";
        //Act
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> new HouseFloor(lowerBound, upperBound));
        //Assert
        assertEquals(expectedMessage, exception.getMessage());
    }
    @Test
    void shouldReturnLowerBound() {
        //Arrange
        int lowerBound = 0;
        int upperBound = 5;
        HouseFloor houseFloor = new HouseFloor(lowerBound, upperBound);
        //Act
        int result = houseFloor.getLowerBound();
        //Assert
        assertEquals(lowerBound, result);
    }
    @Test
    void shouldReturnUpperBound() {
        //Arrange
        int lowerBound = 0;
        int upperBound = 5;
        HouseFloor houseFloor = new HouseFloor(lowerBound, upperBound);
        //Act
        int result = houseFloor.getUpperBound();
        //Assert
        assertEquals(upperBound, result);
    }
}