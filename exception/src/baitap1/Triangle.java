package baitap1;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("nhập cạch a: ");
            double a = sc.nextDouble();
            System.out.print("nhập cạch b: ");
            double b = sc.nextDouble();
            System.out.print("nhập cạch c: ");
            double c = sc.nextDouble();

            if (a < 0 || b < 0 || c < 0 || (a + b) < c || (a + c) < b || (b + c) < a) {
                throw new Exception("độ dài không hợp lệ");
            }
            System.out.println("ok!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
