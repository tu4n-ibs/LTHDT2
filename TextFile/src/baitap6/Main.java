package baitap6;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Ms001","iVan",9,8,7);
        StudentProcess sp = new StudentProcess();
        String fileName = "baitap5.txt";
        try {
            sp.write(student1,fileName);
          Student[] students =  sp.read(fileName);
            for (Student student : students
                 ) {
                System.out.println(student);
            }
        } catch (IOException e) {
            System.out.println("loi IO");
        } catch (ClassNotFoundException e){
            System.out.println("loi ClassNotFile");
        }
    }
}
