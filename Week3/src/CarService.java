import java.util.List;

public class CarService {
    private final CarRepository carRepository;

    public CarService() {
        carRepository = new CarRepository();
    }

    public void addCar(Car car) {
        carRepository.addCar(car);
    }

    public void removeCar(Car car) {
        carRepository.removeCar(car);
    }

    public List<Car> searchCars(String model, String make, int year, double price) {
        return carRepository.searchCars(make, model, year, price);
    }

    public List<Car> getAllCars() {
        return carRepository.getAllCars();
    }

    public Invoice sellCar(Car car, String customerName) {
        Invoice invoice = new Invoice(customerName, car);
        return invoice;
    }


    public void printInvoice(Invoice invoice) {
        System.out.println(invoice);
    }

}
