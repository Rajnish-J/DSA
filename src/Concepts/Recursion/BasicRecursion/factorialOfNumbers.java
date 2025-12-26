package Concepts.Recursion.BasicRecursion;

import java.util.*;;

public class factorialOfNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to Find Factorial: ");
        int n = sc.nextInt();
        System.out.println("Result: " + Factorial(n));
        sc.close();
    }

    public static int Factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * Factorial(n - 1);
        }
    }

}
