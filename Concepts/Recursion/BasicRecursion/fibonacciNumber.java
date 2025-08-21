package Concepts.Recursion.BasicRecursion;

import java.util.*;;

public class fibonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to find the sum of Fibonacci series: ");
        int n = sc.nextInt();
        System.out.println("Sum of Fibonaccie: " + sumfibonacci(n));
        sc.close();
    }

    public static int sumfibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return sumfibonacci(n - 1) + sumfibonacci(n - 2);
        }
    }
}
