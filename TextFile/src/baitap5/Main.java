package baitap5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("nhap vao day file name: ");
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        System.out.println("nhap du lieu");
        String data = sc.nextLine();
//        khoi tao doi tuong cho phuong thuc doc
//        readerWriter reader = new readerWriter();
//        reader.Reader(path);
//khoi tao doi tuong cho phuong thuc ghi
        readerWriter writer = new readerWriter();
        System.out.println(writer.Writer(path, data));
    }
}
