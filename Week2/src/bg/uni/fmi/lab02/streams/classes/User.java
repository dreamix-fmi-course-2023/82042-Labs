package bg.uni.fmi.lab02.streams.classes;

import java.util.ArrayList;
import java.util.List;

public class User {
    private List<Order> orders;

    public List<Order> getOrders() {
        return this.orders;
    }

    public User(){
        orders = new ArrayList<Order>();
    }

    public void addOrder(Order newOrder){
        orders.add(newOrder);
    }

    @Override
    public String toString() {
        return "User: " +
                "Orders: " + this.getOrders();
    }
}
