package week03;

public class P05 {

    // Soru 26). Sayının Mükemmel sayı olup olmadığını kontrol eden bir method yazalım.
    // NOT:  Kendisi hariç, pozitif bölenlerinin toplamı o sayıya eşitse, bu tür sayılar Mükemmel Sayı olabilir.
    // Örnek:
    // Giriş :6
    // Çıkış: 6 Mükemmel Sayıdır
    // Giriş :7
    // Çıkış:7 Mükemmel Sayı Değildir

    public static void main(String[] args) {

        int sayi1 = 6;
        mukemmelSayiMi(sayi1); // Girilen 6 sayısı mükemmel sayıdır.

        int sayi2 = 7;
        mukemmelSayiMi(sayi2); // Girilen 7 sayısı mükemmel sayı değildir.
    }

    private static void mukemmelSayiMi(int sayi) {

        int toplam = 0;

        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam += i;
            }
        }
        if (sayi == toplam) {
            System.out.println("Girilen " + sayi + " sayısı mükemmel sayıdır.");
        } else {
            System.out.println("Girilen " + sayi + " sayısı mükemmel sayı değildir.");
        }

    }
}
