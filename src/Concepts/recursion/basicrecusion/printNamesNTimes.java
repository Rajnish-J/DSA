package concepts.Recursion.BasicRecursion;

import java.util.*;

public class printNamesNTimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to print names: ");
        int n = sc.nextInt();

        printNames(1, n);

        sc.close();
    }

    public static void printNames(int i, int n) {
        if (i > n) {
            return;
        } else {
            System.out.println("Rajnish");
            printNames(i + 1, n);
        }
    }
}