package week02.stringManipulation;

import java.util.Scanner;

public class P05 {

    // Soru 16). Kullanıcıdan 2 isim/kelime alın: isim1 ve isim2
    //       --> isim1 çift sayıda karaktere sahipse, ikinci kelimeyi ilk kelimenin ortasına ekleyin
    //       --> ilk sözcükte tek sayılar varsa,  'isim2, isim1'e eklenemez" ifadesini yazdırın.
    //   Örn:
    //	 isim1= masa
    //   isim2= ali
    //	 Konsol => maalisa

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen iki adet kelime girin.");
        System.out.print("Birinci kelime: ");
        String kelime1 = scanner.next();
        System.out.print("İkinci kelime: ");
        String kelime2 = scanner.next();

        if (kelime1.length() % 2 == 0) {
            int kelimeninYarisi = kelime1.length() / 2;
            kelime1 = kelime1.substring(0, kelimeninYarisi) + kelime2 + kelime1.substring(kelimeninYarisi);
            System.out.println(kelime1);
        } else {
            System.out.println("Birinci kelimeye, ikinci kelime eklenemez!");
        }
    }
}
