
import java.util.Arrays;
import java.util.Scanner;

public class SortingAlgorithms {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {45, 10, 18, 17, 7};

        System.out.println("Available Sorting Algorithms:");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Selection Sort");
        System.out.println("3. Insertion Sort");
        System.out.println("4. Merge Sort");
        System.out.print("Enter the number corresponding to the sorting algorithm you want to use: ");

        int choice = sc.nextInt();
        int[] sortedArray = {};
        long startTime, endTime;

        switch (choice) {
            case 1 -> {
                startTime = System.nanoTime();
                sortedArray = bubbleSort(arr.clone());
                endTime = System.nanoTime();
                System.out.println("Sorted array using Bubble Sort: " + Arrays.toString(sortedArray));
            }
            case 2 -> {
                startTime = System.nanoTime();
                sortedArray = selectionSort(arr.clone());
                endTime = System.nanoTime();
                System.out.println("Sorted array using Selection Sort: " + Arrays.toString(sortedArray));
            }
            case 3 -> {
                startTime = System.nanoTime();
                sortedArray = insertionSort(arr.clone());
                endTime = System.nanoTime();
                System.out.println("Sorted array using Insertion Sort: " + Arrays.toString(sortedArray));
            }
            case 4 -> {
                startTime = System.nanoTime();
                sortedArray = mergeSort(arr.clone());
                endTime = System.nanoTime();
                System.out.println("Sorted array using Merge Sort: " + Arrays.toString(sortedArray));
            }
            default -> {
                System.out.println("Invalid choice! Please enter a number between 1 and 4.");
                return;
            }
        }

        System.out.println("Time taken: " + (endTime - startTime) + " nanoseconds");
        sc.close();
    }

    // * Bubble Sort
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

    // * Selection Sort
    public static int[] selectionSort(int[] arr) {
        int size = arr.length;
        for (int i = 0; i < size - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    // * Insertion Sort
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

    // * Merge Sort
    public static int[] mergeSort(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);
        return merge(mergeSort(left), mergeSort(right));
    }

    private static int[] merge(int[] left, int[] right) {
        int[] merged = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                merged[k++] = left[i++];
            } else {
                merged[k++] = right[j++];
            }
        }
        while (i < left.length) {
            merged[k++] = left[i++];
        }
        while (j < right.length) {
            merged[k++] = right[j++];
        }
        return merged;
    }
}
