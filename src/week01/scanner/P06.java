package week01.scanner;

import java.util.Scanner;

public class P06 {

    // Kullanicidan üc basamaklı bir sayı alin.
    // Kullanicidan alinan bu sayinin basamaklari toplamini ekranda yazdirin.
    // ipuclari:
    // Matematiksel Islemler konusuna bakalim.
    // Bölme islemi kullanarak sayinin basamaklarini alalim ve toplam adli bir konteynira (Variable) atalim.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen 3 basamaklı bir sayı girin: ");
        int sayi = scanner.nextInt();

        int toplam = 0;

        int birlerBasamagi = sayi % 10;
        sayi = sayi / 10;
        int onlarBasamagi = sayi % 10;
        sayi = sayi / 10;
        int yuzlerBasamagi = sayi;

        toplam = yuzlerBasamagi + onlarBasamagi + birlerBasamagi;

        System.out.println("Girdiğiniz sayının basamaklar toplamı: " + toplam);
    }
}
