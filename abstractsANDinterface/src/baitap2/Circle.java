package baitap2;

public class Circle implements GeometricObject {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle[ "
                + radius
                + " ]";
    }

    @Override
    public double getArea() {
        return Math.sqrt(radius) * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return radius + radius * Math.PI;
    }
}
