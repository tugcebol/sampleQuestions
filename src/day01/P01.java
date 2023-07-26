package day01;

import java.util.Scanner;

public class P01 {

    // Soru 1-)   SOUT/SYSO
    // Dairenin alanini ve cevresini hesaplayan java kodu yaziniz.
    // Ipuclari:
    //* r=7;
    //* Pi=3.14
    //* Dairenin Cevresi : 2*Pi*r
    //* Dairenin Alani : Pi*r*r

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen alanını ve çevresini hesaplamak istediğiniz dairenin yarıçapını girin: ");
        double yaricap = scanner.nextDouble();

        System.out.println("Dairenin çevresi: " + 2 * 3.14 * yaricap +
                           "\nDairenin alanı: " + 3.14 * yaricap * yaricap );

    }
}
