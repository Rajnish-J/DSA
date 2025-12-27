package concepts.BasicMaths;

import java.util.*;

public class armStrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is a Armstrong Number: ");
        int num = sc.nextInt();
        System.out.println((num == isArmStrong(num) ? "The Give number is an Armstrong number"
                : "The Given Number is not an Arsmstrong number"));
        sc.close();
    }

    public static int isArmStrong(int num) {
        int sum = 0;
        int count = countDigitsUsingLog(num);
        while (num > 0) {
            int lastDigit = num % 10;
            sum = sum + (int) Math.pow(lastDigit, count);
            num /= 10;
        }
        return sum;
    }

    public static int countDigitsUsingLog(int num) {
        if (num == 0) {
            return 1;
        } else {
            return (int) Math.log10(num) + 1;
        }
    }
}
