package caseStudy;

import caseStudy.Product;

import java.io.*;

public class ProductManager {
    public Product[] products;
    public String fileName ="product.txt";
    public int count;

    //Phương thức khởi tạo một tham số caseStudy.ProductManager(String fileName)
// khởi tạo mảng sản phẩm đọc được từ file theo tham số truyền vào tạo file nếu không tồn tại
    public ProductManager(String fileName) throws IOException, ClassNotFoundException {
        products = new Product[10];
        count = 0;
        File file = new File(fileName);
        if (file.exists()) {
            readData(fileName);
        }
    }

//    Phương thức updateData() cập nhật lại dữ liệu mảng đối tượng vào file

    public void updateData(Product product, String fileName) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(fileName);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(product);
        objectOutputStream.close();
        fileOutputStream.close();
    }


    public void readData(String fileName) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(fileName);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        objectInputStream.readObject();
        objectInputStream.close();
        fileInputStream.close();
    }
    //    Phương thức getAll() trả về mảng sản phẩm đọc được
    public Product[] getAll() {
        disPlay();
        return products;
    }

    public void disPlay(){
        for (int i =0; i< products.length; i++){
            System.out.println(products[i]);
        }
    }

//    Phương thức getById() có 1 tham số id(id sản phẩm cần tìm)
//    trả về một đối tượng sản phẩm đọc được theo tham số id truyền vào
    public Product getById(String id){
        for (Product p:products
             ) {
            if (p.getId().equals(id)){
                return p;
            }
        }
        return null;
    }

//    Phương thức thêm add() có 1 tham số product (đối tượng caseStudy.Product thêm vào mảng)
//    thêm 1 sản phẩm vào mảng và cập nhật vào file trả về đúng nếu thành công, sai nếu thất bại
    public boolean add(Product product) throws IOException {
            products[count++] = product;
            updateData(product,fileName);
            return true;
    }

//    Phương thức remove() có 1 tham số id(id sản phẩm cần xoá)
//    xóa 1 sản phẩm khỏi mảng theo tham số id truyền vào và cập nhật lại dữ liệu vào file
    public int getIndexById(String id){
        for (int i = 0; i < products.length; i++) {
            if (products[i].getId().equals(id))return i;
        }
        return -1;
    }
    public boolean remove(String id) throws IOException {
        if(getById(id) == null) return false;
        int index = getIndexById(id);
        for (int i = 0; i < count -1; i++) {
            if (i >= index){
                products[i] = products[i + 1];
            }
        }
        products[--count] = null;
        return true;
    }

    public boolean update(String id, Product product) throws IOException {
        Product product1 = getById(id);
        if (product1 != null){
            product1.setId(product.getId());
            product1.setName(product.getName());
            updateData(product,fileName);
            return true;
        }
        return false;
    }
}
