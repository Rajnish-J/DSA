package Concepts.Array.TUFProblems.Easy;

import java.util.*;

public class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 6, 7, 8, 1, 2, 4 };
        System.out.println(Arrays.toString(arr));
        System.out.print("Enter the number to get the first occurance: ");
        int num = sc.nextInt();
        System.out.println(search(arr, num));
        sc.close();
    }

    public static int search(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }
}
