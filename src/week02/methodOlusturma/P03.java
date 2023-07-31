package week02.methodOlusturma;

import java.util.Scanner;

public class P03 {

    // Soru 21). Bir aydaki gün sayısını bulmak için bir Java programı yazın
    // ipucu: Switch Case kullanarak çözebiliriz.
    // Şubat ayı senelere göre farklılık gösterir. Bunu çözmek için Şubat ayı için method kullanmamız gerekiyor!

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir aydaki gün sayısını bulmak için bir tarih girin");
        System.out.print("Bir ay girin: ");
        String ay = scanner.next();
        System.out.print("Bir yıl girin: ");
        int yil = scanner.nextInt();

        switch (ay) {
            case "ocak":
                System.out.println(yil + " yılının ocak ayında 31 gün vardır.");
                break;
            case "şubat":
                if (artikYilMi(yil)) {
                    System.out.println(yil + " yılının şubatında 29 gün vardır.");
                } else {
                    System.out.println(yil + " yılının şubatında 28 gün vardır.");
                }
                break;
            case "mart":
                System.out.println(yil + " yılının mart ayında 31 gün vardır.");
                break;
            case "nisan":
                System.out.println(yil + " yılının nisan ayında 30 gün vardır.");
                break;
            case "mayıs":
                System.out.println(yil + " yılının mayıs ayında 31 gün vardır.");
                break;
            case "haziran":
                System.out.println(yil + " yılının haziran ayında 30 gün vardır.");
                break;
            case "temmuz":
                System.out.println(yil + " yılının temmuz ayında 31 gün vardır.");
                break;
            case "ağustos":
                System.out.println(yil + " yılının ağustos ayında 31 gün vardır.");
                break;
            case "eylül":
                System.out.println(yil + " yılının ocağında 30 gün vardır.");
                break;
            case "ekim":
                System.out.println(yil + " yılının ocağında 31 gün vardır.");
                break;
            case "kasım":
                System.out.println(yil + " yılının ocağında 30 gün vardır.");
                break;
            case "aralık":
                System.out.println(yil + " yılının ocağında 31 gün vardır.");
                break;
            default:
                System.out.println("Geçersiz tarih girdiniz!");
        }

    }

    public static boolean artikYilMi(int yil) {

        boolean artikYil = false;

        String sonIkiRakam = "" + (yil / 10) % 10 + yil % 10;

        if (!(sonIkiRakam.equals(00)) && yil % 4 == 0) {
            artikYil = true;
        }
        if (sonIkiRakam.equals("00") && yil % 400 == 0) {
            artikYil = true;
        }
        return artikYil;

    }
}
