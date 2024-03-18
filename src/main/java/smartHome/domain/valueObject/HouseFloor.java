package smartHome.domain.valueObject;

public class HouseFloor {
    private int lowerBound;
    private int upperBound;
    public HouseFloor(int lowerBound, int upperBound) {
        validateBounds(lowerBound, upperBound);
    }
    private void validateBounds(int lowerBound, int upperBound) {
        if (lowerBound < -5 || upperBound < 0) {
            throw new IllegalArgumentException("Invalid floor bounds");
        }
        else if (lowerBound > upperBound) {
            throw new IllegalArgumentException("Lower bound cannot be greater than upper bound");
        }
        else {
            this.lowerBound = lowerBound;
            this.upperBound = upperBound;
        }
    }
    public int getLowerBound() {
        return lowerBound;
    }
    public int getUpperBound() {
        return upperBound;
    }
}
