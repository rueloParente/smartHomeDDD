package smartHome.domain.valueObject;

import com.google.gson.Gson;
import smartHome.ddd.DomainID;

import java.util.Objects;

public class HouseID implements DomainID {
    private String _id;

    public HouseID(String id) {
        if (id != null && !id.isBlank() && !id.isEmpty()) {
            this._id = id;
        } else {
            throw new IllegalArgumentException("Please enter a valid ID.");
        }
    }
    public String getID() {
        return _id;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }

        if (other == null || getClass() != other.getClass()) {
            return false;
        }

        HouseID otherHouseId = (HouseID) other;

        // Ensure _id is not null before comparing
        return _id != null && _id.equals(otherHouseId._id);
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
    @Override
    public int hashCode() {
        return Objects.hash(_id); // Assuming _id is the field used in equals
    }
}
