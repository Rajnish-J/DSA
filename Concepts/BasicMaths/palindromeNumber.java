package Concepts.BasicMaths;

import java.util.Scanner;

public class palindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        int n = sc.nextInt();
        System.out.println("Reversed Number:" + reverseNumber(n));
        System.out.println(isPalindrome(
                n) ? "The Given number is a Palindrome number" : "The Given Number is not a Palindrome number");
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

    public static boolean isPalindrome(int num) {
        return num == reverseNumber(num);
    }
}
