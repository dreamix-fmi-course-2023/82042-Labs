package bg.uni.fmi.lab02.streams.classes;

import bg.uni.fmi.lab02.streams.vo.OrderStatus;
import bg.uni.fmi.lab02.streams.vo.PaymentMethod;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Order {
    private long id;
    private List<OrderList> products;
    private OrderStatus status;
    private LocalDate creationDate;
    private LocalDate deliveryDueDate;
    private double totalPrice;
    private PaymentMethod paymentMethod;
    private User user;


    public long getId() {
        return this.id;
    }

    public List<OrderList> getProducts() {
        return this.products;
    }

    public OrderStatus getStatus() {
        return this.status;
    }

    public LocalDate getCreationDate() {
        return this.creationDate;
    }

    public LocalDate getDeliveryDueDate() {
        return this.deliveryDueDate;
    }

    public double getTotalPrice() {
        return this.totalPrice;
    }

    public PaymentMethod getPaymentMethod() {
        return this.paymentMethod;
    }

    public User getUser() {
        return this.user;
    }

    public boolean isActive(){
        return this.getStatus() == OrderStatus.ACTIVE;
    }

    public void setId(long newId) {
        if(newId > 0){
            this.id = newId;
        } else {
            this.id = -1;
        }
    }

    public void setProducts() {
        this.products = new ArrayList<OrderList>();
    }

    public void addProduct(OrderList newProduct){
        products.add(newProduct);
    }

    public void setStatus(OrderStatus newStatus) {
        this.status = newStatus;
    }

    public void setCreationDate(LocalDate newCreationDate) {
        if(newCreationDate.isAfter(LocalDate.now())){
            throw new RuntimeException("Invalid creation date");
        } else {
            this.creationDate = newCreationDate;
        }
    }

    public void setDeliveryDueDate(LocalDate newDeliveryDueDate) {
        if(newDeliveryDueDate.isBefore(this.getCreationDate())){
            throw new RuntimeException("Invalid delivery due date");
        } else {
            this.deliveryDueDate = newDeliveryDueDate;
        }
    }

    public void setTotalPrice(double newTotalPrice) {
        if(newTotalPrice >= 0 ){
            this.totalPrice = newTotalPrice;
        } else {
            throw new RuntimeException("Total price should be non negative");
        }
    }

    public void setPaymentMethod(PaymentMethod newPaymentMethod) {
        this.paymentMethod = newPaymentMethod;
    }

    public void setUser(User newUser) {
        this.user = newUser;
    }

    public Order(){
        setId(-1);
        setProducts();
        setStatus(OrderStatus.INACTIVE);
        setUser(null);
        setTotalPrice(0);
        setPaymentMethod(PaymentMethod.CASH_ON_DELIVERY);
        setCreationDate(LocalDate.now());
        setDeliveryDueDate(LocalDate.now().plusDays(3));
    }

    public Order(long newId, List<OrderList> products, OrderStatus newStatus, LocalDate newCreationDate,
                 LocalDate newDeliveryDueDate, double newTotalPrice, PaymentMethod newPaymentMethod, User newUser) {
        setId(newId);
        setProducts();
        setStatus(newStatus);
        setCreationDate(newCreationDate);
        setDeliveryDueDate(newDeliveryDueDate);
        setTotalPrice(newTotalPrice);
        setPaymentMethod(newPaymentMethod);
        setUser(newUser);
    }

    public Order(OrderStatus newStatus) {
        setStatus(newStatus);
    }

    public Order(long newId) {
        setId(newId);
    }

    public Order(List<OrderList> products){
        Random rand = new Random();
        this.setProducts();
        for (OrderList ol : products){
            this.addProduct(ol);
        }
        this.setId(rand.nextLong());
        this.setStatus(OrderStatus.DRAFT);
        this.setCreationDate(LocalDate.now());
    }
    @Override
    public String toString() {
        return "Order: " +
                "\nID: " + this.getId() +
                "\nProducts" + this.getProducts() +
                "\nStatus: " + this.getStatus() +
                "\nCreationDate: " + this.getCreationDate() +
                "\nDeliveryDueDate: " + this.getDeliveryDueDate() +
                "\nTotalPrice: " + this.getTotalPrice() +
                "\nPaymentMethod: " + this.getPaymentMethod() +
                "\nUser: " + this.getUser();
    }
}
