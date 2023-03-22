import java.util.*;
import java.util.stream.Collectors;

public class CarRepository {
    private List<Car> cars;

    CarRepository() {
        this.cars = new ArrayList<>();
    }

    public List<Car> getAllCars(){
        return this.cars;
    }

    public List<Car> searchCars(String make, String model, Integer year, Double price){
        return this.cars.stream()
                .filter(car ->
                        car.getModel().equals(model) &&
                        car.getMake().equals(make) &&
                        car.getYear() == year &&
                        car.getPrice() == price
                ).collect(Collectors.toList());
    }

    public void addCar(Car car){
        this.cars.add(car);
    }

    void removeCar(Car car){
        this.cars.remove(car);
    }

    void print(){
        for (Car car : cars){
            System.out.println("Car: \n" + car);
        }

    }

    public static void main(String[] args) {
        Car car1 = new Car("VW", "Golf3", 2000, 5000);
        Car car2 = new Car("VW", "Golf4", 2005, 7000);
        CarRepository cars = new CarRepository();
        cars.addCar(car1);
        cars.addCar(car2);

        cars.print();

        System.out.println(cars.searchCars("VW", "Golf4", 2005, 7000.0));

    }
}
