package thuchanh5;

public class throwExcep {
    static void Fun() {
        try {
//            tạo một ngoại lệ mới và ném nó tới nơi chỗ gọi phuong thuc
            throw new NullPointerException("demo");
        } catch (NullPointerException e) {
            System.out.println("Caught inside fun().");
//            sau khi bắt ngoại lệ và xử lí thì tiếp tục ném cho các phương thức khác xửa lí
            throw e;
        }

    }

    public static void main(String[] args) {
//        bắt ngoại lệ ném ở trên(e)
        try {
            Fun();
        } catch (NullPointerException e) {
            System.out.println("caught in main");

        }
    }

//    sau khi chạy chương trình in ra "Caught inside fun()." và "caught in main" vì nó bắt và xử lí ở trên nhưng nó lại ném tiếp
}
