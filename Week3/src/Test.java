import java.util.Date;

public class Test {


    public static void main(String[] args) {
        Car car1 = new Car("VW", "Golf3", 2000, 2500);
        Car car2 = new Car("VW", "Golf5", 2008, 5000);

        Date now = new Date();

        Invoice invoice1 = new Invoice("Milena", now,  car1, 2500, 0.20);

        CarService carService = new CarService();
        InvoiceService invoiceService = new InvoiceService();

        carService.addCar(car1);
        carService.addCar(car2);

        invoiceService.addInvoice(invoice1);

        Dealership dealership = new Dealership("Milena", carService, invoiceService);

        System.out.println(dealership.getTotalRevenue());

    }

}
