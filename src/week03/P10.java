package week03;

import java.util.Arrays;
import java.util.Scanner;

public class P10 {

    // Soru 31). Kullanıcıdan Arrayin uzunlugunu isteyin.
    //           Ardından kullanıcıdan Arrayin elemanlarını girmesini isteyin.
    // Soru 32). Kullanıcıdan alacagınız bilgilerle oluşturdugunuz bir
    //           Integer Array dizesini Reverse olarak (tersten) yazdırınız.


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen oluşturmak istediğiniz Array'in uzunluğunu girin: ");
        int uzunluk = scanner.nextInt();

        int[] arr = new int[uzunluk];

        for (int i = 0; i <uzunluk ; i++) {
            System.out.print("Lütfen eklemek istediğiniz elemanı girin: ");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Oluşturulan Array: " + Arrays.toString(arr));

        int[] reverseArr = new int[uzunluk];

        for (int i = 0; i <uzunluk ; i++) {
            reverseArr[uzunluk-1-i] = arr[i];
        }

        System.out.println("Ters Array: " + Arrays.toString(reverseArr));

        // Lütfen oluşturmak istediğiniz Array'in uzunluğunu girin: 3
        // Lütfen eklemek istediğiniz elemanı girin: 1
        // Lütfen eklemek istediğiniz elemanı girin: 2
        // Lütfen eklemek istediğiniz elemanı girin: 3
        // Oluşturulan Array: [1, 2, 3]
        // Ters Array: [3, 2, 1]


    }
}
