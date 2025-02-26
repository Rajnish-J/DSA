import java.util.Arrays;

public class SortingAlgorithms {

    public static void main(String[] args) {

        int[] arr = {45, 10, 18, 17, 7};

        // * Print original array
        System.out.println("Original array: " + Arrays.toString(arr));

        // * Call bubble sort and print result
        bubbleSort(arr);
        System.out.println("Sorted array using bubble sort: " + Arrays.toString(arr));

        // * Reset the array to original order
        arr = new int[]{45, 10, 18, 17, 7};

        // * Call selection sort and print result
        selectionSort(arr);
        System.out.println("Sorted array using selection sort: " + Arrays.toString(arr));

    }

    public static void bubbleSort(int[] arr) {
        int size = arr.length;
        for (int i = 0; i < size - 1; i++) { // Fixed loop condition
            for (int j = 0; j < size - i - 1; j++) { // Prevent out-of-bounds access
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int[] arr) {
        int size = arr.length;
        int minIndex;
        for (int i = 0; i < size - 1; i++) { // Fixed loop condition
            minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap elements after finding the minimum
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

}
