package baitap1;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class fileReader {
    public static void main(String[] args) {
        File file = new File("baitap1.txt");
        try{
            file.createNewFile();
            FileReader fR = new FileReader(file);
            int read = fR.read();
            while (read != -1){
                System.out.print((char) read);
                read = fR.read();
            }
            fR.close();
        }catch (IOException e){
            System.out.println("xử lí lỗi");
        }
    }
}
