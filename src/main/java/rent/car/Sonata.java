package rent.car;

public class Sonata extends Car {

    public Sonata(final double distance) {
        super(distance);
    }

    @Override
    public double getDistancePerLiter() {
        return 10;
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
