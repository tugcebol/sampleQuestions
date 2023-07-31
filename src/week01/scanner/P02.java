package week01.scanner;

import java.util.Scanner;

public class P02 {

    // Soru 4). Kullanıcıdan bir sayı alın ve aldiginiz bu sayının küpünün yarısını konsola yazdırin.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen bir sayı girin: ");
        int sayi = scanner.nextInt();

        double sonuc = (double) (sayi * sayi * sayi) / 2;

        System.out.println("Girilen sayının küpünün yarısı = " + sonuc);

    }
}
