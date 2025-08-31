package Concepts.Array.TUFProblems.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class rotateArrayOnePlace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println(Arrays.toString(rotate(arr)));
        sc.close();
    }

    public static int[] rotate(int[] arr) {
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp;
        return arr;
    }

    
}
