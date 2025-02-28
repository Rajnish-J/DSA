
import java.util.Arrays;

public class SortingAlgorithms {

    public static void main(String[] args) {

        int[] arr = {45, 10, 18, 17, 7};

        // * Print original array
        System.out.println("Original array: " + Arrays.toString(arr));

        // * Call bubble sort and print result
        int[] sortedBubbleSort = bubbleSort(arr);
        System.out.println("Sorted array using bubble sort: " + Arrays.toString(sortedBubbleSort));

        // * Reset the array to original order
        arr = new int[]{45, 10, 18, 17, 7};

        // * Call selection sort and print result
        int[] sortedSelectionSort = selectionSort(arr);
        System.out.println("Sorted array using selection sort: " + Arrays.toString(sortedSelectionSort));

        // * Reset the array to original order
        arr = new int[]{45, 10, 18, 17, 7};

        int[] sortedInsertionSort = insertionSort(arr);
        System.out.println("Sorted array using insertion sort: " + Arrays.toString(sortedInsertionSort));

    }

    public static int[] bubbleSort(int[] arr) {
        int size = arr.length;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] selectionSort(int[] arr) {
        int size = arr.length;
        int minIndex;
        for (int i = 0; i < size - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // ? Swap elements after finding the minimum
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public static int[] insertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }

        return arr;
    }

}
