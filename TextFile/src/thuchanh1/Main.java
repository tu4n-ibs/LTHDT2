package thuchanh1;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File file = new File("thuchanh2.txt");
        try {
            file.createNewFile();
            System.out.println(file.getName());
            System.out.println(file.getPath());
        } catch (IOException e) {
            System.out.println("xử lí lỗi");
        }
    }
}
