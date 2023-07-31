package week03;

import java.util.Scanner;

public class P01 {

    // Soru 22). Kullanıcıdan 2 tamsayı girmesini isteyin,
    // ardından GCD (En Büyük Ortak Bölen) ve LCM'yi bulun (En Küçük Ortak Kat)
    //Giriş :30 ve 40
    //Beklenen Çıktı:
    //30 ve 40 için EBOB= 10
    //30 ve 40 için EKOK= 120

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen iki sayı giriniz");
        System.out.print("sayı 1: ");
        int girilenSayi1 = scanner.nextInt();
        System.out.print("sayı 2: ");
        int girilenSayi2 = scanner.nextInt();

        int sayi1 = girilenSayi1;
        int sayi2 = girilenSayi2;
        int kucukSayi = sayi1;
        int EKOK = 1;
        int EBOB = 1;

        if (sayi2 < sayi1) {
            kucukSayi = sayi2;
        }

        for (int i = 2; i <= kucukSayi; i++) {
            if (sayi1 % i == 0 && sayi2 % i == 0) {
                EBOB *= i;
                sayi1 /= i;
                sayi2 /= i;
                i = 1;
            }
        }

        EKOK = sayi1 * sayi2 * EBOB;

        System.out.println(girilenSayi1 + " ve " + girilenSayi2 + " için EBOB değeri: " + EBOB + " \n" +
                girilenSayi1 + " ve " + girilenSayi2 + " için EKOK değeri: " + EKOK);
    }
}
