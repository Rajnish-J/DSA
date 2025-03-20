package Base_Concepts.Recursion;
import java.util.*;

public class NumberExampleRecursion {

    // * why recursion:
    // ? It helps us in solving bigger or complex problems in the simple way
    // ? It helps us in breaking bigger problems into smaller problems
    // ? you can convert recursion solutions into interation and vice versa
    // ? space complexity is not constant because of recursive calls(functions or methods)

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to print: ");
        long num = sc.nextLong();

        printer(num);
    }   

    public static void printer(long n){
        // ? base condition to stop calling the funtion again & again
        // * note: if there is no base condiion, the function call go for infinite times and give the error of stack overflow error or exception
        if(n == 5){
            System.out.println(n);
            return;
        }
        // ? calling the same funtion to print the next number with updgradation of the number
        System.out.println(n);
        printer(n + 1);
    }

}
