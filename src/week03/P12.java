package week03;

import java.beans.Introspector;
import java.util.Arrays;

public class P12 {

    // Soru 34). Bir String'i parametre olarak kabul eden ve
    //           verilen dizede Stringde bulunan rakamların toplamını yazdıran bir Method yazın.
    // Örnek: String str : ade1r4d3
    //        Int toplam : 8

    public static void main(String[] args) {

        String str = "ade1r4d3";
        String digits = "";
        int toplam = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                digits += str.charAt(i);
            }
        }

        String[] strArr = digits.split("");

        for (int i = 0; i < strArr.length; i++) {
            toplam += Integer.valueOf(strArr[i]);
        }

        System.out.println("Int toplam: " + toplam);
    }
}
