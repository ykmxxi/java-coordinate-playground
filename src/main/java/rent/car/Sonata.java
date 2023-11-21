package rent.car;

public class Sonata extends Car {

    private final double distance;

    public Sonata(final double distance) {
        this.distance = distance;
    }

    @Override
    public double getDistancePerLiter() {
        return 10;
    }

    @Override
    public double getTripDistance() {
        return distance;
    }

    @Override
    public String getName() {
        return "Sonata";
    }

    @Override
    public double calculateFuelInjectionAmount() {
        return getTripDistance() / getDistancePerLiter();
    }

}
