package net.foreach.data.pipeline.orders.model;

import java.util.HashMap;
import java.util.Objects;

/**
 * Created by aitor on 5/6/17.
 */
public class Order {

    private String id;

    private User buyer;

    private HashMap<Integer,Item> items;

    private double totalAmount;

    public Order() {}

    public Order(String id, User buyer, HashMap<Integer, Item> items, double totalAmount) {
        this.id= id;
        this.buyer= buyer;
        this.items= items;
        this.totalAmount= totalAmount;
    }

    public String getId() {
        return this.id;
    }

    public Order setId(String id)  {
        this.id= id;
        return this;
    }


    public User getBuyer() {
        return this.buyer;
    }

    public Order setBuyer(User buyer)  {
        this.buyer= buyer;
        return this;
    }


    public HashMap<Integer, Item> getItems() {
        return this.items;
    }

    public Order setItems(HashMap<Integer, Item> items)  {
        this.items= items;
        return this;
    }


    public double getTotalAmount() {
        return this.totalAmount;
    }

    public Order setTotalAmount(double totalAmount)  {
        this.totalAmount= totalAmount;
        return this;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", buyer='" + buyer.toString() + '\'' +
                ", items='" + items.toString() + '\'' +
                ", totalAmount=" + totalAmount +
                '}';
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final Order that = (Order) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(buyer, that.buyer) &&
                Objects.equals(totalAmount, that.items) &&
                Objects.equals(items, that.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, buyer, items, totalAmount);
    }


}
