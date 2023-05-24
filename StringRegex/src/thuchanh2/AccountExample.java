package thuchanh2;

import java.util.regex.Pattern;

public class AccountExample {
    public static void AccountExample(){
        String Account = "[a-z0-9]{6,}";
        String str = "abc1234";
        boolean ketqua = Pattern.matches(Account,str);
        System.out.println(ketqua);
    }
}
