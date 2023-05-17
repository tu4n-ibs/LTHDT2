package thuchanh2;

import java.io.*;

public class methodInputOutput {
    //    1 writeData
//    2 String data, string fileName
//    3 boolean
//    4 ghi dữ liệu vào file
    public boolean writeData(String data, String fileName) throws IOException {
        FileOutputStream fos = new FileOutputStream(fileName);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        bos.write(data.getBytes());
        bos.close();
        fos.close();
        return true;
    }

    public String readData(String fileName) throws IOException {
        String result = "";
        FileInputStream fis = new FileInputStream(fileName);
        BufferedInputStream bis = new BufferedInputStream(fis);
        int c = bis.read();
        while (c != -1) {
            result += (char) c;
            c = bis.read();
        }
        bis.close();
        fis.close();

        return result;
    }
}
