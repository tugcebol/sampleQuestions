package week03;

import java.util.Arrays;
import java.util.Scanner;

public class P13 {

    // Soru 35). Parametre olarak bir isim kabul eden ve
    //           ismi bir char Array dizisi olarak yazdıran bir method return edin.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen bir isim giriniz: ");
        String isim = scanner.nextLine();

        ismiArrayeCevir(isim);
    }
    public static Character[] ismiArrayeCevir (String isim){

        Character[] arr = new Character[isim.length()];
        for (int i = 0; i <isim.length() ; i++) {
            arr[i] = isim.charAt(i);
        }

        System.out.println(Arrays.toString(arr));

        return arr;
    }
}
