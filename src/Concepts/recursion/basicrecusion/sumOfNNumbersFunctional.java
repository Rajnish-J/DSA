package concepts.Recursion.BasicRecursion;

import java.util.*;;

public class sumOfNNumbersFunctional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to sum: ");
        int n = sc.nextInt();
        System.out.println("Result: " + sumOfNumbers(n));
        sc.close();
    }

    public static int sumOfNumbers(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + sumOfNumbers(n - 1);
        }
    }
}
