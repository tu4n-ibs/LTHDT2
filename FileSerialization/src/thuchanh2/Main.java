package thuchanh2;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String data = "hoc OOP";
        String fileName = "demo.dat";

        methodInputOutput mio = new methodInputOutput();
        try {
            System.out.println( mio.writeData(data,fileName));
            System.out.println( mio.readData(fileName));
        } catch (IOException e) {
            System.out.println("loi IO");
        }

    }
}
