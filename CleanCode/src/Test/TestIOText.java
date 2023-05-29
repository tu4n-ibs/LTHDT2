package Test;

import java.io.*;
import java.util.Arrays;

public class TestIOText {
    public static void main(String[] args) {
        File file = new File("list_song.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("xu li loi IO");
        }
        String[] arrSong = {"Hello califonia", "We don’t talk any more", "Nắng ấm xa dần", "Em của ngày hôm qua", "Thất tình"};
        writeDataToFileWithFileWriter(arrSong);
        readDataToFileWithFileReader();
    }

    public static void writeDataToFileWithFileWriter(String[] arrSong) {
        try {
            FileWriter fw = new FileWriter("list_song.txt");
            for (String arr : arrSong ) {
                fw.write(arr + "\n");
            }
            fw.close();
        } catch (IOException e) {
            System.out.println("xu li loi IO");
        }
    }

    public static void writeDataToFileWithBufferWriter(String[] arrSong){
        try{
            FileWriter fr = new FileWriter("list_Song.txt");
            BufferedWriter bw = new BufferedWriter(fr);
            bw.write(Arrays.toString(arrSong));
            bw.close();
            fr.close();
        }catch (IOException e){
            System.out.println("xu li loi IO");
        }
    }

    public static void readDataToFileWithFileReader() {
        try {
            FileReader fr = new FileReader("list_song.txt");
            int name = fr.read();
            while (name != -1) {
                System.out.print((char) name);
                name = fr.read();
            }
            fr.close();
        } catch (IOException e) {
            System.out.println("xu li loi IO");
        }
    }

    public static void  readDataToFileWithBufferReader(){
        try {
            FileReader fr = new FileReader("list_song.txt");
            BufferedReader br = new BufferedReader(fr);
            br.readLine();;
            br.close();

            fr.close();
        } catch (IOException e) {
            System.out.println("xu li loi IO");
        }
    }
}
