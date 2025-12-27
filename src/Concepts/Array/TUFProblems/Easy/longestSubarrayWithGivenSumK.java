package Concepts.array.TUFProblems.Easy;

public class longestSubarrayWithGivenSumK {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 1, 4, 2, 3};
        int k = 3;
        System.out.println("Max length of the sub array: " + maxLength(arr, k));
    }

    public static int maxLength(int[] arr, int k) {
        int left = 0;
        int right = 0;
        long sum = 0;
        int maxLength = 0;
        int n = arr.length;
        while (right < n) {
            sum += arr[right];
            while (sum > k && left <= right) {
                sum -= arr[left];
                left++;
            }
            if (sum == k) {
                maxLength = Math.max(maxLength, right - left + 1);
            }
            right++;
        }

        return maxLength;
    }
}
