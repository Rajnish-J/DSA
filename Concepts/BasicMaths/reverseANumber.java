package Concepts.BasicMaths;

import java.util.Scanner;

public class reverseANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        int n = sc.nextInt();
        System.out.println("Reversed Number:" + reverseNumber(n));
        sc.close();
    }

    public static int reverseNumber(int num) {
        int reversed = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            reversed = (reversed * 10) + lastDigit;
            num /= 10;
        }
        return reversed;
    }
}
