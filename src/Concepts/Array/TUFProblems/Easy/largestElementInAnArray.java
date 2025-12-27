package Concepts.array.TUFProblems.Easy;

import java.util.*;

public class largestElementInAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to create an array: ");
        int size = sc.nextInt();

        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("The largest element in the given array is: " + largestElement(array));
        sc.close();
    }

    public static int largestElement(int[] array) {
        int largest = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest)
                largest = array[i];
        }
        return largest;
    }
}
