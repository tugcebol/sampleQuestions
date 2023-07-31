package week03;

import java.util.Scanner;

public class P07 {

    // Soru 28). Kullanıcının girdiği sayıyı tersine çeviren bir program yazın.
    // Örnek:
    // Sayı: 1238
    // Sayının Tersi: 8321

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen tersine çevirmek istediğiniz sayıyı girin: ");
        int sayi = scanner.nextInt();

        String tersSayi = "";
        int sayiBasamagi = (""+sayi).length();

        for (int i = 1; i <=sayiBasamagi ; i++) {
            tersSayi += sayi%10;
            sayi /= 10;
        }
        System.out.println("Sayının tersi: " + tersSayi);

    }

}
