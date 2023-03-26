package bg.fmi.course.cars.repository;

import bg.fmi.course.cars.model.Car;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class CarRepositoryImpl implements CarRepository {
    private List<Car> cars;

    public CarRepositoryImpl() {
        this.cars = new ArrayList<>();
    }
    @Override
    public List<Car> getAllCars() {
        return this.cars;
    }
    @Override
    public List<Car> searchCars(String make, String model, Integer year, Double price) {
        return this.cars.stream()
                .filter(car ->
                        car.getModel().equals(model) &&
                                car.getMake().equals(make) &&
                                car.getYear() == year &&
                                car.getPrice() == price
                ).collect(Collectors.toList());
    }
    @Override
    public void addCar(Car car) {
        this.cars.add(car);
    }
    @Override
    public void removeCar(Car car) {
        this.cars.remove(car);
    }
}
