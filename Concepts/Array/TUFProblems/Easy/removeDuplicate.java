package Concepts.Array.TUFProblems.Easy;

public class removeDuplicate {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 2, 3, 3 };
        System.out.println("Count of unique elements in the array: " + uniqueCount(arr));
    }

    public static int uniqueCount(int[] arr) {
        int len = arr.length;
        int i = 0;
        for (int j = 1; j < len; j++) {
            if (arr[i] != arr[j]) {
                arr[i + 1] = arr[j];
                i++;
            }
        }
        return i + 1;
    }
}
