package rent.car;

public abstract class Car {

    private final double distance;

    protected Car(final double distance) {
        this.distance = distance;
    }

    public abstract double getDistancePerLiter();

    public abstract String getName();

    public abstract double calculateFuelInjectionAmount();

    public double getTripDistance() {
        return distance;
    }

}
