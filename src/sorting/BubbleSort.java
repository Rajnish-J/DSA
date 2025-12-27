package sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        System.out.println("Sorted Array: " + Arrays.toString(BubbleSortAlgorithm(arr)));
    }

    public static int[] BubbleSortAlgorithm(int[] arr) {
        int length = arr.length;
        for (int i = length - 1; i >= 1; i--) {
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swapper(arr, j, j + 1);
                }
            }
        }
        return arr;
    }

    public static int[] swapper(int[] arr, int a, int b) {
        int temp = arr[b];
        arr[b] = arr[a];
        arr[a] = temp;
        return arr;
    }
}
