package thuchanh3;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ProductApp {
    public static void main(String[] args) {
        Product objProduct1  = new Product();
        objProduct1.setProID("Ms0001");
        objProduct1.setProName("iphone 11");
        objProduct1.setPrice(4000);
        Product objProduct2  = new Product("Ms0002","iphone 12",3000);
        ProductProcess pp = new ProductProcess();
        String fileName = "demo.dat";
            try {
                pp.writeObjectData(objProduct1,fileName);
                pp.writeObjectData(objProduct2,fileName);
                Product[] products = pp.readObjectData(fileName);

                for (Product product: products
                     ) {
                    System.out.println(product);
                }
            } catch (IOException e) {
                System.out.println("loi IO");
            }catch (ClassNotFoundException e){
                System.out.println("loi ClassNotFile");
            }
    }
}
