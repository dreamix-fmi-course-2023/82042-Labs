import java.util.*;
import java.util.stream.Collectors;

public class CarRepository {
    private List<Car> cars;

    CarRepository() {
        this.cars = new ArrayList<>();
    }

    public List<Car> getAllCars() {
        return this.cars;
    }

    public List<Car> searchCars(String make, String model, Integer year, Double price) {
        return this.cars.stream()
                .filter(car ->
                        car.getModel().equals(model) &&
                                car.getMake().equals(make) &&
                                car.getYear() == year &&
                                car.getPrice() == price
                ).collect(Collectors.toList());
    }

    public void addCar(Car car) {
        this.cars.add(car);
    }

    void removeCar(Car car) {
        this.cars.remove(car);
    }
}