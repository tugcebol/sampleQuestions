package week02.methodOlusturma;

import java.util.Scanner;

public class P01 {

    // Soru 18). Girilen araç hızı ve yol kilometresinden,
    //           gidilen yere varış süresini hesaplayan bir method yazalım.
    //           Kullanıcıya hızını ve kilometreyi soralım,
    //           bunu methoda gönderelim ve bize varış süremizi hesaplasın

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen hızı ve gidilecek yolu km cinsinden girin");
        System.out.print("Hız: ");
        double hiz = scanner.nextDouble();
        System.out.print("Gidilecek yol: ");
        double yol = scanner.nextDouble();

        varisSuresiniHesapla(hiz, yol);
    }

    public static void varisSuresiniHesapla(double hiz, double yol) {

        double sure = yol/hiz;
        System.out.println("Tahmini varış süresi " + sure + " saat.");
    }
}
