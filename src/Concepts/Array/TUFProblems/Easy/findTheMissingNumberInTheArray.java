package Concepts.Array.TUFProblems.Easy;

public class findTheMissingNumberInTheArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 6, 7, 8, 9 };
        System.out.println("brute force approach: " + bruteForceApproach(arr));
        System.out.println("better approach: " + optimalSolutionSummationApproach(arr));
        System.out.println("Optimatial solution approach: " + optimalSolutionXORApproach(arr));
    }

    public static int bruteForceApproach(int[] arr) {
        int len = arr.length + 1;
        for (int i = 1; i <= len; i++) {
            boolean found = false;
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] == i) {
                    found = true;
                    break;
                }
            }
            if (!found)
                return i;
        }
        return -1;
    }

    public static int optimalSolutionSummationApproach(int[] arr) {
        int n = arr.length;
        int sum = (n * (n + 1)) / 2;
        int missing = 0;
        for (int i = 0; i < n - 1; i++) {
            missing += arr[i];
        }
        return (sum - missing);
    }

    public static int optimalSolutionXORApproach(int[] arr) {
        int n = arr.length + 1;
        int xor1 = 0, xor2 = 0;

        for (int num : arr) {
            xor2 ^= num;
        }

        for (int i = 1; i <= n; i++) {
            xor1 ^= i;
        }

        return xor1 ^ xor2;
    }
}
