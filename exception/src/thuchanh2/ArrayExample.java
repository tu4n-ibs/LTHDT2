package thuchanh2;

import java.util.Random;

public class ArrayExample {
    public Integer[] createRandom() {
//        tạo đối tượng ngẫu nhiên trong mảng
        Random rd = new Random();
//tạo một mangrcos 100 phần tử
        Integer[] arr = new Integer[100];

        System.out.println("danh sach cua mang: ");
//duyệt mảng
        for (int i = 0; i < 100; i++) {
//            nhập phần tử ngẫu nhiên bằng vòng lặp
            arr[i] = rd.nextInt(100);
            System.out.println(arr[i] + " ");
        }
        return arr;
    }

}
