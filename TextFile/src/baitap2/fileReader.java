package baitap2;

import java.io.*;
import java.util.Scanner;

public class fileReader {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap mot file:");
        String name1 = sc.nextLine();
        try {
            FileReader fR = new FileReader(name1);
            int name = fR.read();
            while (name != -1) {
                System.out.print((char) name);
                name = fR.read();
            }
            fR.close();
        } catch (IOException e) {
            System.out.println("xử lí lỗi");
        }

    }
}
