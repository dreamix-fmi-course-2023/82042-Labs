package bg.uni.fmi.lab02.streams.service;

import bg.uni.fmi.lab02.streams.classes.OrderList;
import bg.uni.fmi.lab02.streams.classes.Order;
import bg.uni.fmi.lab02.streams.classes.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class SearchExercise {
    /**
     * extract all active orders
     * @param user
     * @return List<Order>
     */
    public List<Order> getActiveOrders(User user) {
        return null;
    }

    public List<Order> getActiveOrdersByIteration(User user) {
        List<Order> result = new ArrayList<Order>();
        for ( Order order : user.getOrders() ){
            if(order.isActive()) {
                result.add(order);
            }
        }
        return result;
    }

    /**
     * Return order by a specific id
     * @param orders
     * @param orderId
     * @return Order
     */
    public Order getOrderById(List<Order> orders, long orderId) {
        Order order = new Order(orderId);
        return orders.get(orders.indexOf(order));
    }

    public Order getOrderByIdIteration(List<Order> orders, long orderId) {
        Order resultOrder = new Order();
        for (Order order: orders){
            if(order.getId() == orderId) {
                resultOrder = order;
            }
        }
        return resultOrder;
    }

    /**
     * Return orders that have specific description for item
     * @param user
     * @param description
     * @return List<Order>
     */
    public List<Order> getOrdersThatHaveItemDescription(User user, String description) {
        List<Order> result = new ArrayList<Order>();
        for (Order order : user.getOrders() ){
            for(OrderList orderList : order.getProducts()) {
                if (orderList.getProduct().getDescription() == description) {
                    result.add(order);
                }
            }
        }
        return result;
    }

    /**
     * @return true if customer has at least one order with status ACTIVE
     */
    public boolean hasActiveOrders(User user) {
        boolean result = false;
        for(Order order : user.getOrders()) {
            if (order.isActive()) {
                result = true;
            }
        }
        return result;
    }

    /**
     * Return true if inside the Order we don't have OrderLine with special offer
     */
    public boolean canBeReturned(Order order) {
        boolean result = true;
        for(OrderList orderList : order.getProducts()){
            if(orderList.isSpecialOffer()){
                result = false;
            }
        }
        return result;
    }

    /**
     * Return the order with maximum total price
     * @param user
     * @return
     */
    public Optional<Order> getMaxPriceOrder(User user) {
        Optional<Order> max = Optional.empty();
        for (Order order : user.getOrders()) {
            if(order.getTotalPrice() > max.get().getTotalPrice()){
                max = Optional.of(order);
            }
        }
        return max;
    }
}
