package week04;

import java.util.Arrays;

public class P05 {

    // Soru 40). Parametre olarak 2 Int Array kabul eden ve
    //           2 Array listesini yeni bir Arraye ekleyen ve yazdıran bir method yazın.
    //	 * Input1 = {1,2,3,4}
    //	 * Input2 = {5,6}
    //	 * Çıktı = {1,2,3,4,5,6}

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6};

        arrayleriBirlestir(arr1, arr2); // [1, 2, 3, 4, 5, 6]

    }

    public static void arrayleriBirlestir(int[] arr1, int[] arr2) {

        int yeniArrUzunlugu = arr1.length + arr2.length;

        int[] yeniArr = new int[yeniArrUzunlugu];

        for (int i = 0; i < arr1.length; i++) {
            yeniArr[i] = arr1[i];
        }

        for (int i = 0; i <arr2.length; i++) {
            yeniArr[yeniArrUzunlugu - 1 - i] = arr2[arr2.length-1-i];
        }

        System.out.println(Arrays.toString(yeniArr));
    }

}
