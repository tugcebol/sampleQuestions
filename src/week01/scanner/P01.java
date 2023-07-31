package week01.scanner;

import java.util.Scanner;

public class P01 {

    // Soru 3). Kullanicidan 5 tane sayi alin,
    //          alinan bu sayilarin ortalamasini hesaplayan java kodunu yaziniz.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen 5 adet tamsayi giriniz: ");
        System.out.print("sayı 1: ");
        int sayi1 = scanner.nextInt();
        System.out.print("sayı 2: ");
        int sayi2 = scanner.nextInt();
        System.out.print("sayı 3: ");
        int sayi3 = scanner.nextInt();
        System.out.print("sayı 4: ");
        int sayi4 = scanner.nextInt();
        System.out.print("sayı 5: ");
        int sayi5 = scanner.nextInt();

        double ortalama = (double) (sayi1 + sayi2 + sayi3 + sayi4 + sayi5) / 5;

        System.out.println("Girilen 3sayıların ortalaması: " + ortalama);
    }
}
