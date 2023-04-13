package baitap4;

import thuchanh1.Shape;

public class Traingle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    public Traingle() {
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
    }

    public Traingle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side2;
    }

    public double getArea( double height) {
        return  side1 * height / 2;
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }
//
    public String toString() {
        return "side1: "
                + side1
                +" side2: "
                + side2
                +" side3: "
                + side3
                +" Area: "
                + getArea(5)
                +" Perimeter: "
                + getPerimeter();

    }

}
