package week01.scanner;

import java.util.Scanner;

public class P05 {

    // Kullanicidan Double türünde bir sayi alin. Alinan bu sayiyi tam sayiya cevirerek konsolda yazdirin.
    // (Istege bagli) Float degerinde bir sayi alin bu sayiyi da short degisken türünde bir sayiya döndürün

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen ondalıklı bir sayı giriniz: ");
        double sayi = scanner.nextDouble();

        System.out.println("Girilen ondalıklı sayının tam sayıya çevrilmiş hali: " + (int) sayi);

        System.out.println("-----------------------------------------------------");

        System.out.print("Lütfen ondalıklı (float) bir sayı daha giriniz: ");
        float floatSayi = scanner.nextFloat();

        short shortSayi = (short) floatSayi;

        System.out.println("Girilen ondalıklı (float) sayının tam sayıya (short) çevrilmiş hali: " + shortSayi);
    }
}
