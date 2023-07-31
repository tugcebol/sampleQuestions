package week02.stringManipulation;

import java.util.Scanner;

public class P04 {

    // Soru 15). Kullanıcıdan en az 5 harfli bir kelime alın.
    //           Alınan kelimenin son 3 harfinin 2 kopyasından oluşan yeni bir String oluşturun
    //           ve konsolda yazdırın
    //           Kullanicidan alinan isim uzunluğu en az 5 değilse yeni bir kelime  girmesini isteyin.

    public static void main(String[] args) {

        Scanner scanner;

        String kelime = "";
        int kelimeUzunlugu = kelime.length();

        String yeniKelime = "";

        while (kelimeUzunlugu < 5) {

            scanner = new Scanner(System.in);

            System.out.print("Lütfen en az 5 harfli bir kelime girin: ");
            kelime = scanner.next();
            kelimeUzunlugu = kelime.length();


            if (kelimeUzunlugu >= 5) {
                kelime = kelime.substring(kelimeUzunlugu - 3, kelimeUzunlugu);
                yeniKelime = kelime + kelime;
                System.out.println("Kelimenin yeni hali: " + yeniKelime);
                break;
            }
        }
    }
}
