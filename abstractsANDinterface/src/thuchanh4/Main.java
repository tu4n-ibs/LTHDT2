package thuchanh4;

public class Main {
    public static void main(String[] args) {
        StudentImpl student = new StudentImpl("tuấn",18,true);
        student.eat();
        student.sleep();
        student.attendClass();
        student.registerCourse("ok");
        student.study();
    }
}
