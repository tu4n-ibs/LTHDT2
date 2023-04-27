package thuchanh3;

import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//nhập x và y
        System.out.println("nhap x: ");
        int x = sc.nextInt();
        System.out.println("nhap y: ");
        int y = sc.nextInt();
//khởi tạo đối tượng
        CalculationExample calculationExample = new CalculationExample();
//truyền x và y vào phương thức
        calculationExample.calculate(x, y);
    }
//phương thức và sử dụng try-catch
    private void calculate(int x, int y) {
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("Tổng x + y = " + a);
            System.out.println("Tổng x - y = " + b);
            System.out.println("Tổng x * y = " + c);
            System.out.println("Tổng x / y = " + d);
        } catch (Exception e) {
            System.out.println("xảy ra ngoại lệ: " + e.getMessage());
        }
    }

}
