package smartHome.domain.valueObject;

import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class HouseIDTest {
    @Test
    void shouldInstantiateWhenGivenValidID() {
        //Arrange
        String id = "1";
        //Act
        new HouseID(id);
    }
    @Test
    void shouldThrowExceptionWhenGivenInvalidID() {
        //Arrange
        String id = "";
        String expectedMessage = "Please enter a valid ID.";
        //Act
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> new HouseID(id));
        //Assert
        assertEquals(expectedMessage, exception.getMessage());
    }
    @Test
    void shouldReturnTrueWhenComparingTwoEqualIDs() {
        //Arrange
        String id = UUID.randomUUID().toString();
        HouseID houseID = new HouseID(id);
        HouseID houseID2 = new HouseID(id);
        //Act
        boolean result = houseID.equals(houseID2);
        //Assert
        assertTrue(result);
    }
    @Test
    void shouldReturnFalseWhenComparingTwoDifferentIDs() {
        //Arrange
        String id = UUID.randomUUID().toString();
        String id2 = UUID.randomUUID().toString();
        HouseID houseID = new HouseID(id);
        HouseID houseID2 = new HouseID(id2);
        //Act
        boolean result = houseID.equals(houseID2);
        //Assert
        assertFalse(result);
    }
    @Test
    void shouldReturnIDWhenCallingGetID() {
        //Arrange
        String id = UUID.randomUUID().toString();
        HouseID houseID = new HouseID(id);
        //Act
        String result = houseID.getID();
        //Assert
        assertEquals(id, result);
    }

}