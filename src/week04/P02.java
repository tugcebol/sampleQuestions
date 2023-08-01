package week04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class P02 {

    // 37). (Eliminate duplicates)
    //       Write a method that returns a new array by eliminating the duplicate values
    //       in the array using the following method header
    //       Write a test program that reads in ten integers, invokes the method, and displays the result.

    public static void main(String[] args) {

        int[] arr = arrayMaker();

        arr = eliminateDuplicates(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] eliminateDuplicates(int[] arr) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] && i != j && !list.contains(arr[i])) {
                    list.add(arr[i]);
                }
            }
        }

        int[] newArr = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            newArr[i] = list.get(i);
        }

        arr = newArr;

        return arr;
    }

    public static int[] arrayMaker() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the length of the Array you want to create: ");
        int length = scanner.nextInt();

        int[] arr = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.print("Please enter an element to add inside the Array: ");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Array: " + Arrays.toString(arr));

        return arr;
    }
}

    // Please enter the length of the Array you want to create: 10
    // Please enter an element to add inside the Array: 1
    // Please enter an element to add inside the Array: 2
    // Please enter an element to add inside the Array: 3
    // Please enter an element to add inside the Array: 2
    // Please enter an element to add inside the Array: 1
    // Please enter an element to add inside the Array: 6
    // Please enter an element to add inside the Array: 3
    // Please enter an element to add inside the Array: 4
    // Please enter an element to add inside the Array: 5
    // Please enter an element to add inside the Array: 2
    // Array: [1, 2, 3, 2, 1, 6, 3, 4, 5, 2]
    // [1, 2, 3]
