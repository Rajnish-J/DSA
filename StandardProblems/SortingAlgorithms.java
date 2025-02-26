
import java.util.Arrays;

public class SortingAlgorithms {

    public static void main(String[] args) {

        int[] arr = {45, 10, 18, 17, 7};

        // * Uncomment below line to test bubble sort
        int[] resultBubbleSort = bubbleSort(arr);

        // * Print the resultBubbleSort=> bubble sort
        System.out.print("Sorted array using bubble sort: " + Arrays.toString(resultBubbleSort));

    }

    public static int[] bubbleSort(int[] arr) {
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

}
