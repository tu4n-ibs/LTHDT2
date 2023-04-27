package baitap2;

public class GFG {
    public static void main(String[] args) {
        String s = "";
        try {
            System.out.println(getLength(s));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException Caught");
        }
        s = "GeeksforGeeks";
        try {
            System.out.println(getLength(s));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException Caught");
        }
        s = null;
        try {
            System.out.println(getLength(s));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException Caught");
        }
    }

    public static int getLength(String s) {
        if (s == null)
            throw new IllegalArgumentException("The argument cannot be null");
        return s.length();
    }


//    chương trình đến sô kí tự được nhập vào
//    kiểm tra số kí tượng truyền vào, ném ra ngoại lệ
//    ngoại le xảy ra khi s truyền vào là null
}
