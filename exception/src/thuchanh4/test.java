package thuchanh4;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = Integer.parseInt(sc.nextLine());
            if (99 % n == 0)
                System.out.println(n + " is a factor of 99");
        } catch (ArithmeticException ex) {
            // ngoại lệ số học
            System.out.println("Arithmetic " + ex);
        } catch (NumberFormatException ex) {
//            ngoại lệ định dạng số học
            System.out.println("Number Format Exception " + ex);
        }
//đoạn code có hai khối catch
//nhập geeksforgeeks thì máy nhảy vào ngoại lệ numberformatexception nó báo là đầu vào là chuỗi
//nhập 0 vào nó vào trường howpj ngoại lệ arithmetricException vì số đó bằng không
    }
}
