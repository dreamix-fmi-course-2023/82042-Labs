import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dealership {
    private String name;
    private CarService carService;
    private InvoiceService invoiceService;

    public String getName() {
        return this.name;
    }

    public CarService getCarService() {
        return this.carService;
    }

    public InvoiceService getInvoiceService() {
        return this.invoiceService;
    }

    public void setName(String name) {
        if (name.equals("")) {
            throw new NullPointerException("Name should be not empty");
        } else {
            this.name = name;
        }
    }

    public void setCarService(CarService carService) {
        this.carService = carService;
    }

    public void setInvoiceService(InvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }

    public Dealership(String name, CarService carService, InvoiceService invoiceService) {
        setName(name);
        setCarService(carService);
        setInvoiceService(invoiceService);
    }

    public void addCar(Car car) {
        carService.addCar(car);
    }

    public void removeCar(Car car) {
        carService.removeCar(car);
    }

    public List<Car> searchCars(String make, String model, int year, double price) {
        return carService.searchCars(model, make, year, price);
    }

    public Invoice sellCar(Car car, String customerName) {
        return carService.sellCar(car, customerName);
    }

    public void printInvoice(Invoice invoice) {
        carService.printInvoice(invoice);
    }

    public Map<String, Integer> getSalesByMake() {
        Map<String, Integer> salesByMake = new HashMap<>();
        for(Invoice invoice : invoiceService.getInvoiceHistory()){
            String make = invoice.getCar().getMake();
            salesByMake.put(make,salesByMake.getOrDefault(make, 0) + 1);
        }
        return salesByMake;
    }

    public double getTotalRevenue(){
        double totalRevenue = 0;
        for(Invoice invoice : invoiceService.getInvoiceHistory()){
            totalRevenue += invoice.getTotalPrice();
        }
        return totalRevenue;
    }

}
