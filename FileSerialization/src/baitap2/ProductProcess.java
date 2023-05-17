package baitap2;

import java.io.*;

public class ProductProcess {
    Product[] products;
    int count;
    public ProductProcess(){
        products = new Product[5];
        count = 0;
    }
    public boolean writeProduct( Product objProduct, String fileName) throws IOException {
        products[count++] = objProduct;
        FileOutputStream fos = new FileOutputStream(fileName);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        ObjectOutputStream oos = new ObjectOutputStream(bos);

        oos.writeObject(products);
        oos.close();
        bos.close();
        fos.close();
        return true;
    }

    public Product[] readProduct(String fileName) throws IOException, ClassNotFoundException{
        FileInputStream fis = new FileInputStream(fileName);
        BufferedInputStream bis = new BufferedInputStream(fis);
        ObjectInputStream ois = new ObjectInputStream(bis);

        Product[] products = (Product[]) ois.readObject();
        ois.close();
        bis.close();
        fis.close();
        return products;
    }
}
