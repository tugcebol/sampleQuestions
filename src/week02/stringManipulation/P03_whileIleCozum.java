package week02.stringManipulation;

import java.util.Scanner;

public class P03_whileIleCozum {

    // Soru 14). Kullanıcıdan bir isim ve bir karakter girmesini isteyin, ardından isimde karakterin kaç kez tekrarlandığını kontrol edelim.
    //           Örnek:
    //           char ch1 = 'a'
    //           String name = "Ali bakkala geç gitti."
    //           Beklenen Çıktı = a sayısı = 3

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen bir metin ve bir karakter girin.");

        System.out.print("Metin: ");
        String metin = scanner.nextLine();

        System.out.print("Karakter: ");
        char krktr = scanner.next().charAt(0);

        int sayac = 0;
        int indexSayisi = 0;

        while (indexSayisi < metin.length()) {
            if (metin.charAt(indexSayisi) == krktr) {
                sayac++;
            }
            indexSayisi++;
        }
        if (sayac == 0) {
            System.out.println("Girdiğiniz " + krktr + " karakteri metinde hiç geçmiyor.");
        } else {
            System.out.println("Girdiğiniz " + krktr + " karakteri metinde " + sayac + " kere kullanılmış.");
        }
    }
}
