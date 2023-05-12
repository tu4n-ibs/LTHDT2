package thuchanh2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("nhap duong link: ");
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();

        ReadFileExample readfileEx = new ReadFileExample();
        readfileEx.readerFileText(path);

    }
}
