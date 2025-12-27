package concepts.BasicMaths;

import java.util.*;

public class countDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to count digit: ");
        int n = sc.nextInt();
        System.out.println("Number of dogits: " + countDigit(n));
        System.out.println("Number of digits using log method:" + countDigitsUsingLog(n));
        sc.close();
    }

    public static int countDigit(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    public static int countDigitsUsingLog(int num) {
        if (num == 0) {
            return 1;
        } else {
            return (int) Math.log10(num) + 1;
        }
    }
}
