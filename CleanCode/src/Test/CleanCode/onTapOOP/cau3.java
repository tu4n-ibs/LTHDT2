package onTapOOP;
import java.io.*;
public class cau3 {
    public static void main(String[] args) {
//        khởi tạo mảng chuỗi
        String arrayProgramLanguage[] = {"PHP", "Java", "Ruby on Rails", "HTML", "CSS", "React JS",
                "JavaScript", "React Native", "Angular"};
//        fileName
        String fileName = "languege.txt";
        try {
//            ghi mảng data vào file
            writeDataToFile(arrayProgramLanguage, fileName);
//            đọc mảng data
            String[] read = readDataFromToFile(fileName);
//            duyệt mảng
            for (String readData : read
            ) {
                System.out.println(readData);
            }
        } catch (IOException e) {
            System.out.println("c");
        } catch (ClassNotFoundException e) {
            System.out.println("v");
        }
    }
    // phương thức ghi mảng vào file
    public static void writeDataToFile(String arrayProgramLanguage[], String fileName) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(fileName);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(arrayProgramLanguage);
        objectOutputStream.close();
        fileOutputStream.close();
    }
    // phương thức đọc mảng trong file
    public static String[] readDataFromToFile(String fileName) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(fileName);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        String[] read = (String[]) objectInputStream.readObject();
        objectInputStream.close();
        fileInputStream.close();
        return read;
    }
}
