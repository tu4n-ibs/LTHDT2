package baitap1;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("blue",true, 8.0);
        System.out.println(circle);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());


        Rectangle rectangle = new Rectangle("blue",true,2.0,4.0);
        System.out.println(rectangle);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
    }
}
