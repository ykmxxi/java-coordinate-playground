package rent.car;

public class Avante extends Car {

    private final double distance;

    public Avante(final double distance) {
        this.distance = distance;
    }

    @Override
    public double getDistancePerLiter() {
        return 15;
    }

    @Override
    public double getTripDistance() {
        return distance;
    }

    @Override
    public String getName() {
        return "Avante";
    }

    @Override
    public double calculateFuelInjectionAmount() {
        return getTripDistance() / getDistancePerLiter();
    }

}
