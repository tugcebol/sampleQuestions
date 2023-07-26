package day01;

import java.util.Scanner;

public class P02 {

    // Soru-2)   SOUT/SYSO
    //Dikdortgenin alanini ve cevresini hesaplayan kodu yaziniz.
    //Ipuclari:
    //* Dikdortgenin Cevresi: 2 * (uzun kenar + kisa kenar)
    //* Dikdortgenin Alani : uzun kenar * kisa kenar

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen dairenin iki kenar uzunluğunu girin");
        System.out.print("Kısa kenar: ");
        int kisaKenar = scanner.nextInt();
        System.out.print("Uzun kenar: ");
        int uzunKenar = scanner.nextInt();

        int cevre = 2 * (uzunKenar + kisaKenar);
        int alan = uzunKenar * kisaKenar;

        System.out.println("Dikdörtgenin çevresi: " + cevre +
                           "\nDikdörtgenin alanı: " + alan);
    }
}
