package baitap5;

import java.io.*;

public class readerWriter {
    public String Reader(String path) {
        File file = new File(path);
        try {
            FileReader fileReader = new FileReader(file);
            int read = fileReader.read();
            while (read != -1) {
                System.out.print((char) read);
                read = fileReader.read();
            }
            fileReader.close();
        } catch (IOException e) {
            System.out.println("xu li loi");
        }
        return path;
    }

    public Boolean Writer(String path, String data) {
        try {
            FileWriter fw = new FileWriter(path);
            try {
                if (data == "") {
                    throw new NullPointerException("Khong co gia tri tra ve");
                }
            } catch (NullPointerException e) {
                System.out.println(e.getMessage());
                return false;
            }
            fw.write(data);
            fw.close();
            return true;
        } catch (IOException e) {
            return false;
        }

    }

}
