package week02.stringManipulation;

import java.util.Scanner;

public class P02 {

    // Soru 12). Verilen iki sayının toplamını -sıfırdan büyük veya eşit olabilir- hesaplamak ve yazdırmak için
    //           bir program oluşturalım.
    //           Eğer verilen tamsayıların veya toplamın 10'dan fazla basamağı varsa, "Fazla Yüklenme" yazdıralım

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen iki adet tamsayı girin: ");
        System.out.print("sayı 1: ");
        long girilenSayi1 = scanner.nextLong();
        System.out.print("sayı 2: ");
        long girilenSayi2 = scanner.nextLong();

        long toplam = girilenSayi1 + girilenSayi2;

        String sayi1 = "" + girilenSayi1;
        String sayi2 = "" + girilenSayi2;
        String stringToplam = "" + toplam;

        if (sayi1.length()>=10 || sayi2.length()>=10 || stringToplam.length()>=10){
            System.out.println("Fazla yüklenme!");
        }else {
            System.out.println("Toplam: " + toplam);
        }
    }
}
