package baitap6;

import java.io.*;

public class StudentProcess {
    Student[] students;
    int count;

    public StudentProcess(){
        students = new Student[2];
        count = 0;
    }
    public boolean write(Student student, String fileName) throws IOException {
        students[count++] = student;
        FileOutputStream fos = new FileOutputStream(fileName);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(students);
        oos.close();
        bos.close();
        fos.close();
        return true;
    }

    public Student[] read(String fileName) throws IOException, ClassNotFoundException{
        FileInputStream fis = new FileInputStream( fileName);
        BufferedInputStream bis = new BufferedInputStream(fis);
        ObjectInputStream ois = new ObjectInputStream(bis);

        Student[] students = (Student[]) ois.readObject();
        ois.close();
        bis.close();
        fis.close();
        return students;
    }
}
