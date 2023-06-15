package caseStudy;

import java.io.IOException;

public class AppProduct {
    public static void main(String[] args) {
        Product p1 = new Product("ms00", "iphone6", 2000, 1, "apple");
        Product p2 = new Product("ms01", "iphone7", 3000, 1, "apple");
        Product p3 = new Product("ms02", "iphone8", 4000, 2, "apple");
        Product p4 = new Product("ms03", "iphone10", 5000, 3, "apple");
        Product p5 = new Product("ms04", "iphone11", 6000, 4, "apple");

        String fileName = "product.txt";
        try {
            ProductManager productManager = new ProductManager(fileName);
            productManager.add(p1);
            productManager.add(p2);
            productManager.add(p3);
            productManager.add(p4);
            productManager.add(p5);

            System.out.println("kho");
            productManager.getAll();


            System.out.println("sau khi xoa");
            productManager.remove("ms00");
            productManager.getAll();
            System.out.println();

            System.out.println(productManager.update("ms01",p3));
            productManager.disPlay();
            System.out.println();

            System.out.println(productManager.getById("ms04"));

        } catch (IOException e) {
            System.out.println("loi Io");
        } catch (ClassNotFoundException e) {
            System.out.println("loi class");
        }
    }
}
