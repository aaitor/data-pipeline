package net.foreach.data.pipeline.orders.model;

import java.util.Objects;

/**
 * Created by aitor on 5/6/17.
 */
public class Item {

    private String id;

    private String name;

    private double price;

    public Item() {}

    public Item(String id, String name, double price) {
        this.id= id;
        this.name= name;
        this.price= price;
    }

    public String getId() {
        return this.id;
    }

    public Item setId(String id)  {
        this.id= id;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Item setName(String name)  {
        this.name= name;
        return this;
    }

    public double getPrice() {
        return this.price;
    }

    public Item setPrice(double price)  {
        this.price= price;
        return this;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
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
        final Item that = (Item) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(name, that.name) &&
                Objects.equals(price, that.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price);
    }


}
