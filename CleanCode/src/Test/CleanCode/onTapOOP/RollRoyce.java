package onTapOOP;

import java.io.Serializable;

public class RollRoyce extends Car implements Serializable {
    private double width;
    private double height;
    private double weight;
    private double price;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public RollRoyce(String carName, String carColor, String engine,
                     double width, double height, double weight, double price) {
        super(carName, carColor, engine);
        this.width = width;
        this.height = height;
        this.weight = weight;
        this.price = price;
    }

    @Override
    public String toString() {
        return "RollRoyce{" + super.toString() +
                "width=" + width +
                ", height=" + height +
                ", weight=" + weight +
                ", price=" + price +
                '}';
    }
}
