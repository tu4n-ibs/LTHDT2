package thuchanh1;

import java.util.regex.Pattern;

public class Email {
    public static void Email() {
        String EMAIL_REGEX = "\\w*@\\w*\\.\\w{1,3}";
        String str = "abc@gmail.com";
        boolean ketqua = Pattern.matches(EMAIL_REGEX, str);
        System.out.println(" email: " + str +" "+ketqua);
    }
}
