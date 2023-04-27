package thuchanh2;

import java.util.Scanner;

public class Amin {
    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.createRandom();


        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao day chi so cua mot phan tu: ");
        int x = sc.nextInt();
        try {
            System.out.println("gia tri cua phan tu co chi so " + x + " la " + arr[x]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("vuot gioi han");
        }

    }
}
