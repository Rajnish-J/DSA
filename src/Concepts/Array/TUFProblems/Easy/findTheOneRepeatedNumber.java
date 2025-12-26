package Concepts.Array.TUFProblems.Easy;

public class findTheOneRepeatedNumber {

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 4, 4};
        System.out.println((bruteForce(arr) == -1) ? "There are no single number" : bruteForce(arr));
        System.out.println(OptimalSolution(arr));
    }

    public static int bruteForce(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == num) {
                    count++;
                }
            }
            if (count == 1) {
                return num;
            }
        }
        return -1;
    }

    public static int OptimalSolution(int[] arr) {
        int XOR = 0;
        for (int i = 0; i < arr.length; i++) {
            XOR = XOR ^ arr[i];
        }
        return XOR;
    }
}
