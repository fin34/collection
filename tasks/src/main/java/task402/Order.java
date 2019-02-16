package task402;

import java.util.Objects;

public class Order {

    private String nameOrder;
    private int numberOrder;

    public Order(String nameOrder, int numberOrder) {
        this.nameOrder = nameOrder;
        this.numberOrder = numberOrder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return numberOrder == order.numberOrder;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOrder);
    }
}
