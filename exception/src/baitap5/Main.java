package baitap5;

public class Main {
    public static void main(String[] args) {
        try{
//            goi phuong thuc va nem ngoai le cua lop cha
            throw new MyException("GeeksOfGeeks");
        }catch(MyException e){
            System.out.println("caught");
//            in ra loi ngoai le
            System.out.println(e.getMessage());
        }
    }
//    bai tap 5 co 2 lop:
//    1: phuong thuc MyException - tao ra mot ngoai le
//    2: Main - bat va xu li ngoai le
}
