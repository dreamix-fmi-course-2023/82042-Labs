package bg.uni.fmi.lab02.streams;


import bg.uni.fmi.lab02.streams.classes.*;

import bg.uni.fmi.lab02.streams.service.SearchExercise;
import bg.uni.fmi.lab02.streams.vo.OrderLineStatus;
import bg.uni.fmi.lab02.streams.vo.OrderStatus;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Item item1 = new Item("dress", new BigDecimal("500"));
        Item item2 = new Item("rock", new BigDecimal("200"));
        OrderList ol1 = new OrderList(item1, OrderLineStatus.IN_STOCK, false, 2);
        OrderList ol2 = new OrderList(item2, OrderLineStatus.IN_STOCK, false, 4);
        List<OrderList> products = new ArrayList<OrderList>();
        products.add(ol1);
        products.add(ol2);
        Order order1 = new Order(products);
        order1.setStatus(OrderStatus.ACTIVE);

        User me = new User();
        me.addOrder(order1);
        SearchExercise exercise = new SearchExercise();

        List<Order> activeOrders = exercise.getActiveOrdersByIteration(me);
        System.out.println(activeOrders);
    }
}
