package smartHome.domain.valueObject;

import com.google.gson.Gson;
import smartHome.ddd.ValueObject;

public class Gps implements ValueObject {
    private double _latitude;
    private double _longitude;

    public Gps(double latitude, double longitude) {
        validateLatitude(latitude);
        validateLongitude(longitude);
    }

    private void validateLatitude(double latitude) throws IllegalArgumentException {
        if (latitude < -90 || latitude > 90) {
            throw new IllegalArgumentException("Please enter a valid latitude.");
        } else {
            this._latitude = latitude;
        }
    }

    private void validateLongitude(double longitude) throws IllegalArgumentException {
        if (longitude < -180 || longitude > 180) {
            throw new IllegalArgumentException("Please enter a valid longitude.");
        } else {
            this._longitude = longitude;
        }
    }

    public double getLatitude() {
        return _latitude;
    }

    public double getLongitude() {
        return _longitude;
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }

}
