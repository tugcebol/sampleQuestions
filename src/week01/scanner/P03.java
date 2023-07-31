package week01.scanner;

import java.util.Scanner;

public class P03 {

    // Soru 5). Kullanıcıdan karenin kenar uzunluğunu alın.
    //          Aldiginiz uzunluklarla karenin alanını ve çevresini hesaplayan kodu yazın.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen karenin kenar uzunluğu girin: ");
        int kenar = scanner.nextInt();

        int kareAlan = kenar*kenar;
        int kareCevre = 4*kenar;

        System.out.println("Karenin alanı: " + kareAlan +
                           "\nKarenin çevresi: " + kareCevre);
    }
}
