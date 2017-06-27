package net.foreach.data.pipeline.orders.model;

import java.util.Objects;

/**
 * Created by aitor on 5/6/17.
 */
public class User {

    private String id;

    private String name;

    private int age;

    public User() {}

    public User(String id, String name, int age) {
        this.id= id;
        this.name= name;
        this.age= age;
    }

    public String getId() {
        return this.id;
    }

    public User setId(String id)  {
        this.id= id;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public User setName(String name)  {
        this.name= name;
        return this;
    }

    public int getAge() {
        return this.age;
    }

    public User setPrice(int age)  {
        this.age= age;
        return this;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
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
        final User that = (User) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(name, that.name) &&
                Objects.equals(age, that.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age);
    }

}
