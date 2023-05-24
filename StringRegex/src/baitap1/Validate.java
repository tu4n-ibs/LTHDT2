package baitap1;

import java.util.regex.Pattern;

public class Validate {
    public static void Validate(String nameClass){
        String Validate = "[APC]\\d{4}[GHIK]";
        String str = nameClass;
        boolean result = Pattern.matches(Validate,str);
        System.out.println(result);
    }
}
