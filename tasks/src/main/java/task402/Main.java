package task402;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Order order1 = new Order("TV", 1);
        Order order2 = new Order("PC", 2);
        Order order3 = new Order("Tablet", 3);

        Set<Order> orderSet = new HashSet<>();
        orderSet.add(order1);
        orderSet.add(order2);
        orderSet.add(order3);
        orderSet.add(order1);

        System.out.println("Liczba zamówień: " + orderSet.size());
    }
}
