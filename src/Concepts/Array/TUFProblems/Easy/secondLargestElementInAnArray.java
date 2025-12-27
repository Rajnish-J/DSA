package Concepts.array.TUFProblems.Easy;

import java.util.Arrays;

public class secondLargestElementInAnArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 5, 7, 7, 4, 9 };
        System.out.println("Brute force approach method: " + BruteForceApproach(arr));
    }

    public static int secondLargest(int[] arr) {
        int len = arr.length;
        int largest = arr[0];
        int secondLargest = -1;
        for (int i = 1; i < len; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    public static int secondSmallest(int[] arr) {
        int len = arr.length;
        int smallest = arr[0];
        int secondSmallest = Integer.MAX_VALUE;
        for (int i = 1; i < len; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] != smallest && arr[i] < smallest) {
                secondSmallest = arr[i];
            }
        }
        return secondSmallest;
    }

    public static int BruteForceApproach(int[] arr) {
        int len = arr.length;
        int largest = arr[0];
        int secondLargest = 0;
        Arrays.sort(arr);
        for (int i = len - 2; i >= 0; i--) {
            if (arr[i] != largest) {
                secondLargest = arr[i];
                break;
            }
        }
        return secondLargest;
    }

    public static int BetterSolution(int[] arr) {
        int len = arr.length;
        int largest = arr[0];
        for (int i = 1; i < largest; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < len; i++) {
            if (arr[i] > secondLargest && arr[i] < largest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
}
