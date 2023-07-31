package week03;

import java.util.Arrays;

public class P11 {

    // Soru 33). Array kullanarak String bir cümleyi Reverse eden (tersine çeviren)
    //           bir Java programı yazın (boşluklar ve özel karakterler dahil).

    public static void main(String[] args) {

        String cumle = "Kodlama harika.";
        String[] arr = cumle.split("");

        String[] tersArr = new String[arr.length];

        for (int i = 0; i <arr.length ; i++) {
            tersArr[arr.length-1-i] = arr[i];
        }

        for (int i = 0; i <tersArr.length ; i++) {
            System.out.print(tersArr[i]); // .akirah amaldoK
        }
    }
}
