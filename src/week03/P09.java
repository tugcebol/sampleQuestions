package week03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class P09 {

    // Soru 30). Bir Stringdeki yinelenen karakterleri Array String olarak döndüren bir kod yazın.
    // Örnek:
    // String str="Javacokkolay"
    // Yinelenen karakterler : [a, o, k]

    public static void main(String[] args) {

        String metin = "Java çok kolay";

        metin = metin.replaceAll("\\s", "");

        String[] arr = metin.split("");
        List<String> arrList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j].equals(arr[i]) && !arrList.contains(arr[j]) && i != j){
                    arrList.add(arr[i]);
                }
            }
        }
        System.out.println("Metindeki yinelenen karakterler: " + arrList); // Metindeki yinelenen karakterler: [a, o, k]

    }
}

