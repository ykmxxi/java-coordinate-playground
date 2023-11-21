package rent;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import rent.car.Car;

public class RentCompany {

    private final List<Car> cars;

    private RentCompany() {
        this.cars = new ArrayList<>();
    }

    public static RentCompany create() {
        return new RentCompany();
    }

    public void addCar(final Car car) {
        cars.add(car);
    }

    public String generateReport() {
        StringBuilder sb = new StringBuilder();
        for (Car car : cars) {
            sb.append(String.join(" : ", car.getName(), format(car.calculateFuelInjectionAmount())));
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }

    private String format(final double amount) {
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.#리터");
        return decimalFormat.format(amount);
    }


}
