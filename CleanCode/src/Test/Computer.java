package Test;

import java.io.FileWriter;

public class Computer {
    //    Các thuộc tính: mã, tên, hãng sản xuất, cấu hình, giá, trạng thái (còn hàng hoặc hết hàng).
    String id;
    String name;
    String brand;
    String setting;
    double price;
    boolean status;

    public Computer(String id, String name, String brand, String setting, double price, boolean status) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.setting = setting;
        this.price = price;
        this.status = status;
    }

    Computer[] computer;
    int count;

    public Computer() {
        computer = new Computer[0];
        count = 0;
    }

//    public void addComputerToArray(Computer computers, Computer[] computer) {
//        computer[count++] = computers;
//    }

    public void addComputerToFile(Computer computer){

    }

}
