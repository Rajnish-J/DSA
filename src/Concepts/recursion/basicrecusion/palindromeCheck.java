package concepts.Recursion.BasicRecursion;

import java.util.*;

public class palindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to check if it is a palindrome: ");
        String str = sc.nextLine();
        System.out.println((palindrome(0, str)) ? "The String is a Palindrome" : "The String is not a Palindrome");
        sc.close();
    }

    public static boolean palindrome(int i, String str) {
        int size = str.length();
        if (i >= size / 2) {
            return true;
        }
        
        if(str.charAt(i) != str.charAt(size - i - 1)){
            return false;
        }
        return palindrome(i+1, str);
    }
}
