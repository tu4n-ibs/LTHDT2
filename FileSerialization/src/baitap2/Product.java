package baitap2;

import java.io.Serializable;

public class Product implements Serializable {
    String id;
    String name;
    double price;
    String brand;

    public Product(String id, String name, double price, String brand){
        this.id = id;
        this.name = name;
        this.price = price;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                '}';
    }
}
