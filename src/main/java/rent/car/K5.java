package rent.car;

public class K5 extends Car {

    private final double distance;

    public K5(final double distance) {
        this.distance = distance;
    }

    @Override
    public double getDistancePerLiter() {
        return 13;
    }

    @Override
    public double getTripDistance() {
        return distance;
    }

    @Override
    public String getName() {
        return "K5";
    }

    @Override
    public double calculateFuelInjectionAmount() {
        return getTripDistance() / getDistancePerLiter();
    }

}
