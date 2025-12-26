package Concepts.Recursion.BasicRecursion;

import java.util.*;

public class printNumbersNTimes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        printNumbers(1, n);

        sc.close();
    }

    public static void printNumbers(int i, int n) {
        if (i > n) {
            return;
        } else {
            System.out.println(i);
            printNumbers(i + 1, n);
        }
    }
}
