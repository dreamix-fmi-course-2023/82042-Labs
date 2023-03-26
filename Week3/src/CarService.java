import java.util.List;

public class CarService {
    private final CarRepository carRepository;

    CarService() {
        carRepository = new CarRepository();
    }

    void addCar(Car car) {
        carRepository.addCar(car);
    }

    void removeCar(Car car) {
        carRepository.removeCar(car);
    }

    List<Car> searchCars(String model, String make, int year, double price) {
        return carRepository.searchCars(make, model, year, price);
    }

    List<Car> getAllCars() {
        return carRepository.getAllCars();
    }

    Invoice sellCar(Car car, String customerName){
        Invoice invoice = new Invoice(customerName,car);
        return invoice;
    }

    //Защо ни е този метод в този клас???
    void printInvoice(Invoice invoice){
        System.out.println(invoice);
    }

}
