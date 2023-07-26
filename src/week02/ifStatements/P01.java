package week02.ifStatements;

import java.util.Scanner;

public class P01 {

    // Kullanıcıya Adını, Soyadını ve kredi kartı numaralarını sorup bunları özel forma dönüştürün.
    //                 Ad ve soyadın baş harfleri büyük olmalıdır
    //                 Kredi kartı numarasını kontrol edin, 16 hane yoksa "Geçersiz kredi kartı numarası" yazdırın.
    //                 Kredi Kartı 16 Hane ise aşagıda belirtilen şekilde çıktı alın.

    // Giriş :
    //		 > Gandalf Grey 563245879632
    //Çıktı :
    //		 > İsim : G****** G***
    //		 > CCN : **** **** 9632

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen Adınızı Girin: ");
        String ad = scanner.next();

        System.out.print("Lütfen Soyadınızı Girin: ");
        String soyad = scanner.next();

        System.out.print("Lütfen 16 Haneli Kredi Kartı Numaranızı Aralarında Boşluk Bırakmadan Girin: ");
        String kartNo = scanner.next();



        if (kartNo.length() != 16) {
            System.out.println("Geçersiz Kredi Kartı Numarası!");
        } else {
            ad = ad.substring(0, 1).toUpperCase() + ad.substring(1).replaceAll("\\S","*");
            soyad = soyad.substring(0, 1).toUpperCase() + soyad.substring(1).replaceAll("\\S", "*");
            kartNo = kartNo.substring(0,4).replaceAll("\\S","*") + " " +
                     kartNo.substring(4,8).replaceAll("\\S","*")+ " " +
                     kartNo.substring(8,12).replaceAll("\\S", "*") + " " +
                     kartNo.substring(12);

            System.out.println("İsim: " + ad + " " + soyad +
                    "\nCCN: " + kartNo);

        }
    }

    /* Lütfen Adınızı Girin: gandalf
       Lütfen Soyadınızı Girin: grey
       Lütfen 16 Haneli Kredi Kartı Numaranızı Aralarında Boşluk Bırakmadan Girin: 1234567890123456
       İsim: G****** G***
       CCN: **** **** **** 3456  */

}
