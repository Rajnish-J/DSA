package Concepts.BasicMaths;

import java.util.*;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers to check the GCD");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("The GCD of given two numbers is: " + findGCD(num1, num2));
        sc.close();
    }

    public static int findGCD(int num1, int num2) {
        while (num1 > 0 && num2 > 0) {
            if (num1 > num2) {
                num1 = num1 % num2;
            } else {
                num2 = num2 % num1;
            }

        }
        return (num1 == 0) ? num2 : num1;
    }
}
