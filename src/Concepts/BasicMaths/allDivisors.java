package concepts.BasicMaths;

import java.util.*;

public class allDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find all divisors: ");
        int num = sc.nextInt();
        Divisors(num);
        sc.close();
    }

    public static void Divisors(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
        // ? More optimized way:
        // for (int i = 1; i <= Math.sqrt(num); i++) {
        //     if (num % i == 0) {
        //         System.out.print(i + " ");
        //         if ((num / i) != i) {
        //             System.out.print(num / i + " ");
        //         }
        //     }
        // }
    }
}
