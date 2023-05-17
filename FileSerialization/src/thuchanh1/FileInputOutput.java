package thuchanh1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class FileInputOutput {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao mot file: ");
        String path = sc.nextLine();
        System.out.println("nhap vao mot chuoi: ");
        String name = sc.nextLine();
//ghi du lieu
        FileOutputStream fo = null;
        fo = new FileOutputStream(path);
        String s = name;
        byte arr[] = s.getBytes();
        fo.write(arr);
        fo.close();

//doc du lieu
        FileInputStream fi = null;
        fi = new FileInputStream(path);
        int i = 0;
        while ((i = fi.read())!= -1){
            System.out.print((char) i);
        }
        fi.close();
    }
}
