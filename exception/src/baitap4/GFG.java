package baitap4;

public class GFG {
    public static void main (String[] args)
    {
        // Initializing String variable with null value
//        trường hợp này dữ liệu bằng null nên không thể lấy được dữu liệu
        String str = null;
        String message = (str == null) ? "" :
                str.substring(0,5);
        System.out.println(message);

        // Initializing String variable with null value
//        trường hợp này có dữ liệu nên đối tượng được giữ từ vị trí 0 đến 5
        str = "Geeksforgeeks";
        message = (str == null) ? "" : str.substring(0,5);
        System.out.println(message);
    }
// cú pháp tổng quát của toán tử 3 ngoi
// biến = Biểu thức logic  ?  Câu lệnh khi biểu thức trả về true : Câu lệnh khi biếu thức trả về false;
}
