package week04;

import java.util.Arrays;
import java.util.Scanner;

public class P01 {

    // Soru 36). Verilen bir Array dizisindeki ortadaki degeri döndüren bir kod/method yazın.
    //           (Yapabilirseniz Dinamik kod yazmaya çalışın, Arrayin uzunlugu degişse de ortadaki elemanı getirsin)
    // Örnek:
    // inputarr[]=   {1,2,3,4,5,6,7}
    // output:         4


    public static void main(String[] args) {

        int[] arr = arrayYap();

        int ortadakiIndex = (arr.length - 1) / 2;

        if (arr.length % 2 == 0) {
            System.out.println("Çift uzunluğa sahip Arraylerin orta elemanı olamaz!");
        } else {

            System.out.println("Ortadaki eleman: " + arr[ortadakiIndex]);
        }
    }

    public static int[] arrayYap() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen oluşturmak istediğiniz Array'in uzunluğunu girin: ");
        int uzunluk = scanner.nextInt();

        int[] arr = new int[uzunluk];

        for (int i = 0; i < uzunluk; i++) {
            System.out.print("Lütfen eklemek istediğiniz elemanı girin: ");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Oluşturulan Array: " + Arrays.toString(arr));

        return arr;
    }

}
