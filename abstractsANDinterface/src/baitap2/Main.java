package baitap2;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2.0, 3.0);
        System.out.println(rectangle);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());

        Circle circle = new Circle(5.0);
        System.out.println(circle);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
    }
}
