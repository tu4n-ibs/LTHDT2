package baitap3;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class fileWriter {
    public static void main(String[] args) {
        File file = new File("baitap3.txt");
        try {
            file.createNewFile();
            FileWriter fw = new FileWriter(file);
            fw.write("baitap 3");
            fw.close();
        } catch (IOException e) {
            System.out.println("xử lí lỗi");
        }
    }
}
