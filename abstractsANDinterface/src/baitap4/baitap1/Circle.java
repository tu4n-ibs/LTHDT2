package baitap1;

public class Circle extends Shape {
    protected double radius = 1.0;

    public Circle(){}
    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return Math.sqrt(radius) * Math.PI;
    }

    @Override
    public double getPerimeter(){
        return radius + radius * Math.PI;
    }
    @Override
    public String toString(){
        return "Circle[ " + color + ", " + super.toString() + " ]";
    }
}
