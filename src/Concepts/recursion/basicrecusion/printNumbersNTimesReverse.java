package concepts.Recursion.BasicRecursion;

import java.util.Scanner;

public class printNumbersNTimesReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        printNumbersReverse(n, 1);

        sc.close();
    }

    public static void  printNumbersReverse(int i, int n) {
        if (i < 1) {
            return;
        } else {
            System.out.println(i);
            printNumbersReverse(i - 1, n);
        }
    }
}
