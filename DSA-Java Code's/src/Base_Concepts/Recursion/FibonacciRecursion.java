package Base_Concepts.Recursion;

import java.util.*;

public class FibonacciRecursion {
    
    // * hashMap to store the previous value to reduce function calling repeatation
    static Map<Integer, Integer> memo = new HashMap<>();

    public static void main(String[] args) {

        // ? notes:
        // * Break it down into smaller problems
        // * the base condition is represented by answer we already have, in this case W.K.T fibo(0) = 0 and fibo(1) = 1
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to print n fibonaci number: ");
        int n = sc.nextInt();

        int ans = fibo(n);
        System.out.println(ans);

        sc.close();
    }

    static int fibo(int n) {

        // * base condition:
        if (n < 2 && n >= 0) {
            return n;
        }

        // * Check if result is already computed:
        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        // * calling recursive function:
        int result = fibo(n - 1) + fibo(n - 2);
        memo.put(n, result);
        return result;
    }
}
