package concepts.Recursion.BasicRecursion;

import java.util.Scanner;

public class sumOfNNumbersParameterized {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to sum: ");
        int n = sc.nextInt();
        sumOfNNumbers(n, 0);
        sc.close();
    }

    public static void sumOfNNumbers(int i, int sum) {
        if (i < 1) {
            System.out.println(sum);
            return;
        } else {
            sumOfNNumbers(i - 1, sum + i);
        }
    }
}
