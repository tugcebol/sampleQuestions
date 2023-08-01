package week04;

public class P04 {

    // Soru 39). Bir diziyi (Array) parametre olarak kabul eden ve
    //           dizideki tüm elemanların toplamını döndüren bir method yazın ve
    //           ardından sonucu main methodda yazdırın.
    // input array: {1,2,3,4,5,6,7,8}
    // output: 36

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8};

        System.out.println(elemanlariTopla(arr)); // 36
    }

    public static int elemanlariTopla(int[]arr){

        int toplam = 0;

        for (int i = 0; i <arr.length ; i++) {
            toplam += arr[i];
        }

        return toplam;
    }


}
