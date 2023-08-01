package week04;

import java.util.Arrays;

public class P03 {

    // Soru 38). Bir tamsayı dizisini (Int Array) girdi olarak kabul eden ve
    //           verilen bu Arrayden minimum ve maksimum sayıları yazdıran bir method yazın.
    //Input : {3,2,5,4,1,6}
    //Output :
    //min: 1
    //max: 6

    public static void main(String[] args) {

        int[] arr = {3, 2, 5, 4, 1, 6};

        minMaxBulma(arr);     // Arraydeki en küçük eleman: 1
        // Arraydeki en büyük eleman: 6

        minMaxBulmaSort(arr); // Arraydeki en küçük eleman: 1
        // Arraydeki en büyük eleman: 6
    }

    public static void minMaxBulma(int[] arr) {

        int enKucukEleman = arr[0];
        int enBuyukEleman = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < enKucukEleman) {
                enKucukEleman = arr[i];
            }
            if (arr[i] > enBuyukEleman) {
                enBuyukEleman = arr[i];
            }
        }

        System.out.println("Arraydeki en küçük eleman: " + enKucukEleman +
                "\nArraydeki en büyük eleman: " + enBuyukEleman);
    }

    public static void minMaxBulmaSort(int[] arr) {

        Arrays.sort(arr);
        int enKucukEleman = arr[0];
        int enBuyukEleman = arr[arr.length - 1];

        System.out.println("Arraydeki en küçük eleman: " + enKucukEleman +
                "\nArraydeki en büyük eleman: " + enBuyukEleman);

    }
}
