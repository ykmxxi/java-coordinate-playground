package rent.car;

public class Avante extends Car {

    public Avante(final double distance) {
        super(distance);
    }

    @Override
    public double getDistancePerLiter() {
        return 15;
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
