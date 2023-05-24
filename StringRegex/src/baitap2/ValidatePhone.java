package baitap2;

import java.util.regex.Pattern;

public class ValidatePhone {
    public static void ValidatePhone(){
        String ValidatePhone = "\\(\\d{2}\\)-\\(\\d{10}\\)";
        String numberPhone = "(84)-(0978489641)";
        boolean result = Pattern.matches(ValidatePhone, numberPhone);
        System.out.println(result);
    }
}
