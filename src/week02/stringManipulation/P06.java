package week02.stringManipulation;

import java.util.Scanner;

public class P06 {

    // Soru 17). Kullanıcıdan bir isim isteyelim. Bu isim 3 harfli olmalıdır.
    //           Ardından ismin aynı karakterlere sahip olup olmadığını kontrol edelim.
    //           İsim aynı karakterlere sahipse konsolda "Dize yinelenen karakterlere sahip"
    //           değil ise konsolda "Dize benzersiz karakterlere sahip" yazdıralım.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen 3 harfli bir kelime girin: ");
        String kelime = scanner.next();

        if (kelime.length() == 3) {
            if (kelime.charAt(0) == kelime.charAt(1) || kelime.charAt(0) == kelime.charAt(2) || kelime.charAt(1) == kelime.charAt(2)) {
                System.out.println("Dize yenilenen karakterlere sahip.");
            } else {
                System.out.println("Dize benzersiz karakterlere sahip.");
            }
        }else {
            System.out.println("Kelime 3 harfli olmalı!");
        }
    }

}
