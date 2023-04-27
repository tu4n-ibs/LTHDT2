package baitap3;

public class GFG {
    public static void main(String[] args) {
        String ptr = null;
        try {
            if ("gfg".equals(ptr)) {
                System.out.println("same");
            } else {
                System.out.println("not same");
            }
        }catch (NullPointerException e){
            System.out.println("NullPointerException caught");
        }
    }
//    trường hợp 1: xảy ra lỗi vì ptr = null nên không thể so sánh được
//    trường hợp 2: sau khi thêm try-catch vào thì nó chạy vào trường hợp ngoại lệ
//    trường hợp 3 : sau khi thay đổi điều kiện thì nó chạy vào "not same"
//    vì lần này đối tượng dùng để so sánh có dữ liệu nhưng đối tượng được so sánh bằng null
}
