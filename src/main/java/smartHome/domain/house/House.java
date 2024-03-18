package smartHome.domain.house;

import smartHome.ddd.AggregateRoot;
import smartHome.domain.valueObject.Address;
import smartHome.domain.valueObject.Gps;
import smartHome.domain.valueObject.HouseID;
import smartHome.domain.valueObject.ZipCode;

import java.util.UUID;

public class House implements AggregateRoot<HouseID> {
    private HouseID _houseID;
    private Address _address;
    private Gps _gps;
    private ZipCode _zipCode;

    House(Address address, Gps gps, ZipCode zipCode) {
        validateAddress(address);
        validateGps(gps);
        validateZipCode(zipCode);
        _houseID = new HouseID(UUID.randomUUID().toString());
    }
    private void validateAddress(Address address) {
        if (address == null) {
            throw new IllegalArgumentException("Please enter a valid address.");
        } else {
            this._address = address;
        }
    }
    private void validateGps(Gps gps) {
        if (gps == null) {
            throw new IllegalArgumentException("Please enter a valid GPS.");
        } else {
            this._gps = gps;
        }
    }
    private void validateZipCode(ZipCode zipCode) {
        if (zipCode == null) {
            throw new IllegalArgumentException("Please enter a valid zip code.");
        } else {
            this._zipCode = zipCode;
        }
    }
    public Address getAddress() {
        return _address;
    }
    public Gps getGps() {
        return _gps;
    }
    public ZipCode getZipCode() {
        return _zipCode;
    }
    @Override
    public HouseID identity() {
        return _houseID;
    }

    @Override
    public boolean sameAs(Object object) {
        if (object instanceof House house) {
            return this._houseID.equals(house._houseID);
        }
        return false;
    }
}
