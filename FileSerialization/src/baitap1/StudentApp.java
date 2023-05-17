package baitap1;

import java.io.IOException;
import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        Student student1 = new Student("Ms001", "iVan", 18, "ibs");
        Student student2 = new Student("Ms002", "ivan nguyen", 19, "ibs");
        Student student3 = new Student("Ms003", "iVan vuong", 20, "ibs");
        Student student4 = new Student("Ms004", "jonny dang", 21, "ibs");
        Student student5 = new Student("Ms005", "khoa pug", 22, "ibs");

        String fileName = "demo.txt";
        StudentProcess Sp = new StudentProcess();
        try {
            Sp.writeStudent(student1, fileName);
            Sp.writeStudent(student2, fileName);
            Sp.writeStudent(student3, fileName);
            Sp.writeStudent(student4, fileName);
            Sp.writeStudent(student5, fileName);

            Student[] students = Sp.readStudent(fileName);
            for (Student student : students
            ) {
                System.out.println(student);
            }
        } catch (IOException e) {
            System.out.println("loi IO");
        } catch (ClassNotFoundException e) {
            System.out.println("loi ClassNotFile");
        }
    }
}
