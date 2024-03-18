package smartHome.domain.valueObject;

import com.google.gson.Gson;
import smartHome.ddd.ValueObject;

public class ZipCode implements ValueObject {
        private int _firstPart;
        private int _secondPart;

        public ZipCode(int firstPart, int secondPart) {
            validateFirstPart(firstPart);
            validateSecondPart(secondPart);
        }
        private void validateFirstPart(int firstPart) {
            if (firstPart < 1000 || firstPart > 9999) {
                throw new IllegalArgumentException("Please enter a valid first part.");
            } else {
                this._firstPart = firstPart;
            }
        }
        private void validateSecondPart(int secondPart) {
            if (secondPart < 100 || secondPart > 999) {
                throw new IllegalArgumentException("Please enter a valid second part.");
            } else {
                this._secondPart = secondPart;
            }
        }
        @Override
        public String toString() {
            Gson gson = new Gson();
            return gson.toJson(this);
        }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ZipCode zipCode = (ZipCode) o;
            return _firstPart == zipCode._firstPart && _secondPart == zipCode._secondPart;
        }
}
