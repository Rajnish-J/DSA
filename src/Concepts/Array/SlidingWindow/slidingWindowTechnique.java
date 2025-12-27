package Concepts.array.SlidingWindow;

/*

! Problem Statement:
Find the max sum of a subarray of size k in a given array.
arr = {2,1,5,1,3,2}
k = 3

ans = 9

*/

/* 

! Brute Force Pseudo code:
maxSum(arr, k)
    int maxSum = 0
    for(int i = 0; i <= arr.length - k; i++)
        int currentSum = 0
        for(int j = 0; j < k+i; j++)
            currentSum += arr[j]
        maxSum = Math.max(maxSum, currentSum)

*/

public class slidingWindowTechnique {
    public static void main(String[] args) {
        int[] arr = { 2, 1, 5, 1, 3, 2 };
        int k = 3;

        System.out.println("Max sum res from brute force approach:" + BruteForceApproach(arr, k));

    }

    public static int BruteForceApproach(int[] arr, int k) {
        // ? Time complexity: O(n square)
        // ? Space complexity: O(1)
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i <= n - k; i++) {
            int currentSum = 0;
            for (int j = 0; k < j + k; j++) {
                currentSum += arr[j];
            }
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }

    public static int SlidingWindowApproach(int [] arr, int k){
        // ? Time complexity: O(N)
        // ? Space complexity: O(1)
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;
        int windowSum = 0;

        for(int i = 0; i < k; i++){
            windowSum += arr[i];
        }
        maxSum = windowSum;

        for(int i = k; i < n; i++){
            windowSum += arr[i] - arr[i-k];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }

}
