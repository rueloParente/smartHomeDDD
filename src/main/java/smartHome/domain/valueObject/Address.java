package smartHome.domain.valueObject;
import com.google.gson.Gson;
import smartHome.ddd.ValueObject;

public class Address implements ValueObject {
    private String _street;
    private String _city;
    private String _country;
    private int _doorNumber;

    public Address(String street, String city, String country, int doorNumber) {
        validateStreet(street);
        validateCity(city);
        validateCountry(country);
        validateDoorNumber(doorNumber);
    }
    private void validateStreet(String street) {
        if (street == null || street.isEmpty()) {
            throw new IllegalArgumentException("Please enter a valid street.");
        } else {
            this._street = street;
        }
    }
    private void validateCity(String city) {
        if (city == null || city.isEmpty()) {
            throw new IllegalArgumentException("Please enter a valid city.");
        } else {
            this._city = city;
        }
    }
    private void validateCountry(String country) {
        if (country == null || country.isEmpty()) {
            throw new IllegalArgumentException("Please enter a valid country.");
        } else {
            this._country = country;
        }
    }
    private void validateDoorNumber(int doorNumber) {
        if (doorNumber < 0) {
            throw new IllegalArgumentException("Please enter a valid door number.");
        } else {
            this._doorNumber = doorNumber;
        }
    }
    public String getStreet() {
        return _street;
    }
    public String getCity() {
        return _city;
    }
    public String getCountry() {
        return _country;
    }
    public int getDoorNumber() {
        return _doorNumber;
    }
    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Address address = (Address) o;
        if (_doorNumber != address._doorNumber) return false;
        if (!_street.equals(address._street)) return false;
        if (!_city.equals(address._city)) return false;
        return _country.equals(address._country);
    }
}