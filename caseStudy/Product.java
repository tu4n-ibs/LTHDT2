package caseStudy;

import java.io.Serializable;

public class Product implements Serializable {
//Các thuộc tính: mã, tên sản phẩm, giá, số lượng, đơn vị tính
//Phương thức khởi tạo không tham số caseStudy.Product() và full tham số
//Sử dụng regex để validate tham số đầu vào cho getter/setter
//Tên sản phẩm bắt đầu bằng CG
//Đơn vị tính là: cái, chiếc, hộp
//Giá thấp nhất = 1000

    private String id;
    private String name;
    private double price;
    private int quality;
    private String unit;

    @Override
    public String toString() {
        return "caseStudy.Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quality=" + quality +
                ", unit='" + unit + '\'' +
                '}';
    }

    public Product() {
    }

    public Product(String id, String name, double price, int quality, String unit) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quality = quality;
        this.unit = unit;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
