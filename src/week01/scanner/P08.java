package week01.scanner;

import java.util.Scanner;

public class P08 {

    // Soru 10). Kullanıcıdan kilosunu ve boyunu isteyin ve kütleyi hesaplayan bir program yazın
    //
    //           **indeks Hesaplama: İPUCU : Vücut Kitle İndeksi = Ağırlık (kg) / Boy uzunluğunun karesi (m) // If konusunu hatırlayın!***
    //           Kullanıcıya aşağıdaki gibi mesaj verin:
    //
    //           Eğer VKİ 18.5'ten az ise --> zayıfsınız
    //           Eğer VKİ 18.5 ile 25 arasında ise --> kilo idealdir
    //           Eğer VKİ 25 ila 30 arasındaysa --> şişmansınız
    //           VKİ 30'a eşit veya daha fazlaysa --> obezsin, diyet yap!

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen kilo ve boy değerlerinizi kg ve metre cinsinden girin");
        System.out.print("Kilo: ");
        double kilo = scanner.nextDouble();
        System.out.print("Boy: ");
        double boy = scanner.nextDouble();

        double vki = (kilo) / (boy * boy);

        if (vki < 18.5) {
            System.out.println("Zayıfsınız!");
        } else if (vki >= 18.5 && vki < 25) {
            System.out.println("Kilonuz ideal!");
        } else if (vki >= 25 && vki < 30) {
            System.out.println("Şişmansınız!");
        } else {
            System.out.println("Obezsiniz!");
        }


    }
}
