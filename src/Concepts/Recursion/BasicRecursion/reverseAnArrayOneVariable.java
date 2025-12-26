package Concepts.Recursion.BasicRecursion;

import java.util.Arrays;

public class reverseAnArrayOneVariable {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Reversed Array: " + Arrays.toString(reverse(0, arr)));
    }

    public static int[] reverse(int i, int[] arr) {
        int size = arr.length;
        int[] retArr = {};
        if (i >= size / 2) {
            return retArr;
        }
        int temp = arr[i];
        arr[i] = arr[size - i - 1];
        arr[size - i - 1] = temp;
        reverse(i + 1, arr);

        retArr = arr;
        return retArr;
    }
}