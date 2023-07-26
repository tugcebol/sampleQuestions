package week01.scanner;

import java.util.Scanner;

public class P07 {

    // Girilen zamanı saniyeye çeviriniz.
    // Örnek: 2 saat 3 dakika 10 saniye ==>	 7390 saniye

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen saniyeye çevirmek istediğiniz zamanı girin");
        System.out.print("Saat: ");
        int saat = scanner.nextInt();
        System.out.print("Dakika: ");
        int dk = scanner.nextInt();
        System.out.print("Saniye: ");
        int sn = scanner.nextInt();

        System.out.println("Girilen zaman saniye cinsinden " + ((saat * 3600) + (dk * 60) + sn) + " saniyedir.");
    }

}
