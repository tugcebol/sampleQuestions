package week03;

import java.util.Scanner;

public class P02 {

    // Soru 23). Girdi olarak bir tamsayı kabul eden ve
    //           bu tam sayının faktöriyelini hesaplayan bir method yazın.
    //           Method bize çıktıyı döndürsün.
    // Örnek:
    // Girdi: 6
    // Çıktı: 6!=65432*1=720

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir tamsayı girin: ");
        int sayi = scanner.nextInt();

        faktoriyelHesapla(sayi);

    }

    public static int faktoriyelHesapla(int sayi){

        int sonuc = 1;

        System.out.print(sayi + "! = ");

        for (int i = sayi; i > 1 ; i--) {
            System.out.print(i + " * ");
            sonuc *= i;
        }
        System.out.print("1 = " + sonuc);
        return sonuc;
    }
}
