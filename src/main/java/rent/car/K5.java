package rent.car;

public class K5 extends Car {

    public K5(final double distance) {
        super(distance);
    }

    @Override
    public double getDistancePerLiter() {
        return 13;
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
