package week02.methodOlusturma;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class P02 {

    // Soru 19-) Kullanıcıdan doğum tarihini alınız. Burcunu hesaplayan bir method yazınız.
    //ipucu:
    //Switch Case kullanabilirsiniz. Veya Method yazarak Method aracılıgı ile de yapabilirsiniz.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen burcunuzu öğrenmek için doğum tarihinizi gün ve ay şeklinde girin: ");
        System.out.print("Gün: ");
        int gun = scanner.nextInt();
        System.out.print("Ay: ");
        String ay = scanner.next().toLowerCase();

        burcHesapla(gun, ay);

    }

    public static void burcHesapla(int gun, String ay) {

        switch (ay) {
            case "mart":
                if (gun >= 1 && gun < 21) {
                    System.out.println("Balık burcusunuz.");
                } else if (gun >= 21 && gun <= 31) {
                    System.out.println("Koç burcusunuz.");
                } else {
                    System.out.println("Geçersiz tarih girdiniz!");
                }
                break;
            case "nisan":
                if (gun >= 1 && gun <= 20) {
                    System.out.println("Koç burcusunuz.");
                } else if (gun >= 21 && gun <= 30) {
                    System.out.println("Boğa Burcusunuz.");
                } else {
                    System.out.println("Geçersiz tarih girdiniz!");
                }
                break;
            case "mayıs":
                if (gun >= 1 && gun <= 20) {
                    System.out.println("Boğa burcusunuz.");
                } else if (gun >= 21 && gun <= 31) {
                    System.out.println("İkizler Burcusunuz.");
                } else {
                    System.out.println("Geçersiz tarih girdiniz!");
                }
                break;
            case "haziran":
                if (gun >= 1 && gun <= 21) {
                    System.out.println("İkizler burcusunuz.");
                } else if (gun >= 22 && gun <= 30) {
                    System.out.println("Yengeç Burcusunuz.");
                } else {
                    System.out.println("Geçersiz tarih girdiniz!");
                }
                break;
            case "temmuz":
                if (gun >= 1 && gun <= 22) {
                    System.out.println("Yengeç burcusunuz.");
                } else if (gun >= 23 && gun <= 31) {
                    System.out.println("Aslan Burcusunuz.");
                } else {
                    System.out.println("Geçersiz tarih girdiniz!");
                }
                break;
            case "ağustos":
                if (gun >= 1 && gun <= 23) {
                    System.out.println("Aslan burcusunuz.");
                } else if (gun >= 24 && gun <= 31) {
                    System.out.println("Başak Burcusunuz.");
                } else {
                    System.out.println("Geçersiz tarih girdiniz!");
                }
                break;
            case "eylül":
                if (gun >= 1 && gun <= 23) {
                    System.out.println("Başak burcusunuz.");
                } else if (gun >= 24 && gun <= 30) {
                    System.out.println("Terazi Burcusunuz.");
                } else {
                    System.out.println("Geçersiz tarih girdiniz!");
                }
                break;
            case "ekim":
                if (gun >= 1 && gun <= 23) {
                    System.out.println("Terazi burcusunuz.");
                } else if (gun >= 24 && gun <= 31) {
                    System.out.println("Akrep Burcusunuz.");
                } else {
                    System.out.println("Geçersiz tarih girdiniz!");
                }
                break;
            case "kasım":
                if (gun >= 1 && gun <= 22) {
                    System.out.println("Akrep burcusunuz.");
                } else if (gun >= 23 && gun <= 30) {
                    System.out.println("Yay Burcusunuz.");
                } else {
                    System.out.println("Geçersiz tarih girdiniz!");
                }
                break;
            case "aralık":
                if (gun >= 1 && gun <= 21) {
                    System.out.println("Yay burcusunuz.");
                } else if (gun >= 22 && gun <= 31) {
                    System.out.println("Oğlak Burcusunuz.");
                } else {
                    System.out.println("Geçersiz tarih girdiniz!");
                }
                break;
            case "ocak":
                if (gun >= 1 && gun <= 20) {
                    System.out.println("Oğlak burcusunuz.");
                } else if (gun >= 21 && gun <= 31) {
                    System.out.println("Kova Burcusunuz.");
                } else {
                    System.out.println("Geçersiz tarih girdiniz!");
                }
                break;
            case "şubat":
                if (gun >= 1 && gun <= 19) {
                    System.out.println("Kova burcusunuz.");
                } else if (gun >= 20 && gun <= 29) {
                    System.out.println("Balık Burcusunuz.");
                } else {
                    System.out.println("Geçersiz tarih girdiniz!");
                }
                break;
            default:
                System.out.println("Geçersiz tarih girdiniz!");
        }
    }
}
