package Concepts.Recursion.BasicRecursion;

import java.util.Arrays;

public class reverseAnArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Reversed Array: " + Arrays.toString(reverse(0, arr.length - 1, arr)));
    }

    public static int[] reverse(int start, int end, int[] arr) {
        int size = arr.length;
        int[] retArr = {};
        if (start >= end) {
            return retArr;
        }
        int temp = arr[start];
        arr[start] = arr[size - start - 1];
        arr[size - start - 1] = temp;
        reverse(start + 1, end - 1, arr);

        retArr = arr;
        return retArr;
    }

}
