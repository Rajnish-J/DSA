package Concepts.Array.TUFProblems.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class rotateArrayDthPlaces {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        System.out.print("Enter the number to rotate Dth time: ");
        int D = sc.nextInt();
        System.out.println("Rotated Array: " + Arrays.toString(rotateDPlaces(arr, D)));
        sc.close();
    }

    public static int[] rotateDPlaces(int[] arr, int D) {
        int len = arr.length;
        D = D % len;
        arr = reverse(arr, 0, D - 1);
        arr = reverse(arr, D, len - 1);
        arr = reverse(arr, 0, len - 1);

        return arr;
    }

    public static int[] reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
}
