package baitap2;

import java.io.IOException;

public class ProductApp {
    public static void main(String[] args) {
        Product product1 = new Product("000", "iphone", 10000, "Apple");
        Product product2 = new Product("001", "Messenger", 1000, "Meta");
        Product product3 = new Product("002", "Instagram", 2000, "Meta");
        Product product4 = new Product("003", "Zalo", 3000, "Meta");
        Product product5 = new Product("004", "Facebook", 4000, "Meta");

        String fileName = "demo.dat";
        ProductProcess PP = new ProductProcess();
        try {
            PP.writeProduct(product1, fileName);
            PP.writeProduct(product2, fileName);
            PP.writeProduct(product3, fileName);
            PP.writeProduct(product4, fileName);
            PP.writeProduct(product5, fileName);

            Product[] products = PP.readProduct(fileName);
            for (Product product : products
            ) {
                System.out.println(product);
            }
        } catch (IOException e) {
            System.out.println("loi IO");
        } catch (ClassNotFoundException e) {
            System.out.println("loi ClassNotFile");
        }
    }
}
