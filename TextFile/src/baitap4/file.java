package baitap4;

import java.io.File;
import java.io.IOException;

public class file {
    public static void main(String[] args) {
        File file = new File("baitap4.txt");
        try{
            file.createNewFile();
            System.out.println(file.exists());
            if (file.isDirectory()){
                System.out.println("is a directory");
            }else {
                System.out.println("is a not directory");
            }
            System.out.println(file.getPath());
        }catch(IOException e){
            System.out.println("xử lí lỗi");
        }
    }
}
