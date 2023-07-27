package week02.ifStatements;

import java.util.Scanner;

public class P02_ForLoopIleCozum {

    // Verilen iki sayının toplamını -sıfırdan büyük veya eşit olabilir- hesaplamak ve yazdırmak için
    // bir program oluşturalım.
    // Eğer verilen tamsayıların veya toplamın 10'dan fazla basamağı varsa, "Fazla Yüklenme" yazdıralım

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen iki adet tamsayı girin: ");
        System.out.print("sayı 1: ");
        long girilenSayi1 = scanner.nextLong();
        System.out.print("sayı 2: ");
        long girilenSayi2 = scanner.nextLong();

        long sayi1 = girilenSayi1;
        long sayi2 = girilenSayi2;

        long toplam = sayi1 + sayi2;

        for (int i = 0; i <9 ; i++) {
            sayi1 /= 10;
            sayi2 /=10;
            toplam /= 10;
        }
        if (sayi1>=1 || sayi2>=1 || toplam>=1){
            System.out.println("Fazla yüklenme!");
        }
        else{
            toplam = girilenSayi1 + girilenSayi2;
            System.out.println("Sayıların toplamı: " + toplam);
        }

    }
}
