package Base_Concepts.Recursion;
import java.util.*;

public class FibonacciRecursion {
    public static void main(String[] args) {

        // ? notes:
        // * Break it down into smaller problems
        // * the base condition is represented by answer we already have, in this case W.K.T fibo(0) = 0 and fibo(1) = 1

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to print n fibonaci number: ");
        int n = sc.nextInt();

        System.out.println(fibo(n));
    }

     static int fibo(int n){

        // * base condition:
        if(n < 2){
            return n;
        }

        // * calling function:
        return fibo(n - 1) + fibo(n - 2);
    }
}
