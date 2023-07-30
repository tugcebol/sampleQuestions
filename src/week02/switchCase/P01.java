package week02.switchCase;

import java.util.Scanner;

public class P01 {

    // Char cevap değişkeninin değerini test edelim ve aşağıdaki eylemleri gerçekleştiren bir kod yazalım:
    // Cevap a ise, konsolda 'İsteğiniz işleniyor' mesajı yazsın
    // Yanıt b ise, konsolda 'Değerlendirmeniz için yine de teşekkür ederiz' mesajı yazsın
    // Yanıt c ise 'Üzgünüm şuanda yardımcı olamıyoruz' mesajı,
    // Yanıtın başka bir değeri için ise 'Geçersiz giriş, lütfen tekrar deneyin!' mesajı yazdırılsın.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("LÜtfen cevabınızı 'a', 'b', 'c' şeklinde giriniz: ");
        char cevap = scanner.next().toLowerCase().charAt(0);

        switch (cevap) {
            case 'a':
                System.out.println("İsteğiniz işleniyor...");
                break;
            case 'b':
                System.out.println("Değerlendirmeniz için teşekkür ederiz.");
                break;
            case 'c':
                System.out.println("Üzgünüz, şu anda yardımcı olamıyoruz.");
                break;
            default:
                System.out.println("Geçersiz giriş! Lütfen tekrar deneyin.");
        }
    }
}
