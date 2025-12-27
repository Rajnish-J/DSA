package sorting;
import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        System.out.println("Sorted Array: " + Arrays.toString(SelectionSortAlgorithm(arr)));
    }

    public static int[] SelectionSortAlgorithm(int[] arr) {
        int length = arr.length;
        for (int i = 0; i <= length - 2; i++) {
            int minIndex = i;
            for (int j = i; j <= length - 1; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            swapper(arr, i, minIndex);
        }
        return arr;
    }

    public static int[] swapper(int[] arr, int i, int minIndex) {
        int temp = arr[minIndex];
        arr[minIndex] = arr[i];
        arr[i] = temp;
        return arr;
    }
}
