package week03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P03 {

    // Soru 24). 20'den 0'a kadar çift sayıları yazdırın ancak decrement (i--) kullanmayın.
    // Örnek: 20'den 0'a kadar Çift Sayılar şunlardır: 20 18 16 14 12 10 8 6 4 2 0
    // ipucu:
    // Loop içinde if kullanarak çözebilirsiniz. % kullanmak iyi bir fikir olabilir

    public static void main(String[] args) {

        int sayi = 0;
        List<Integer> ciftSayiList = new ArrayList<>();

        while (sayi <= 21){  // 0'dan 20'ye kadar olan çift sayıları increment kullanarak array liste ekledik
            if (sayi % 2 == 0){
                ciftSayiList.add(sayi);
            }
            sayi++;
        }

        System.out.println(ciftSayiList.size()); // array listin uzunluğu 11miş
        System.out.println(ciftSayiList); // [0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20]

        int [] arr = new int[ciftSayiList.size()]; // uzunluğu 11 olan int bir array oluşturduk

        for (int i = 0; i < ciftSayiList.size() ; i++) {        // burada loop içinde, array'in ilk indexine
                                                                // listteki değerleri, listin son elementinden
                                                                // başlayarak ekliyoruz
            arr[i]= ciftSayiList.get(ciftSayiList.size()-1-i);  // böylelikle listi tersten yazmış olduk

        }

        System.out.println(Arrays.toString(arr)); // [20, 18, 16, 14, 12, 10, 8, 6, 4, 2, 0]

        System.out.print("20'den 0'a kadar olan çift sayılar şunlardır: "); // burası outputun bizden istendiği şekilde görünmesi için,
        for (int i = 0; i <arr.length ; i++) {                              // arrayi [] parantezlerden çıkardık
            System.out.print(arr[i] + " ");
        }


    }
}
