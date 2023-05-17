package thuchanh3;

import java.io.*;

public class Product implements Serializable {
    String proID;
    String proName;
    int price;

    public Product() {
    }

    public Product(String proID, String proName, int price) {
        this.proID = proID;
        this.proName = proName;
        this.price = price;
    }

    public String getProID() {
        return proID;
    }

    public void setProID(String proID) {
        this.proID = proID;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String toString() {
        return "Id: " + proID
                + " Name: " + proName
                + " Price: " + price;
    }

}
