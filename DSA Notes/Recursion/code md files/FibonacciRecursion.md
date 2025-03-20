# Recursion in Java

1. **Base Case**: A condition that stops recursion to prevent infinite loops.
2. **Recursive Case**: The function calls itself with a modified argument to approach the base case.

---

## Why Recursion?
- It helps in solving bigger or complex problems in a simpler way.
- It breaks down larger problems into smaller, manageable problems.
- Recursive solutions can be converted into iterative ones and vice versa.
- **Space Complexity** is not constant due to recursive function calls (stack usage).

---

## Code Explanation
### **Java Program to Print Numbers Using Recursion**

```java
package Base_Concepts.Recursion;
import java.util.*;

public class NumberExampleRecursion {

    // * Why Recursion?
    // ? It helps us in solving bigger or complex problems in a simple way
    // ? It helps us in breaking bigger problems into smaller problems
    // ? You can convert recursive solutions into iteration and vice versa
    // ? Space complexity is not constant because of recursive calls (functions or methods)

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to print: ");
        long num = sc.nextLong();

        printer(num);
    }

    public static void printer(long n){
        // ? Base condition to stop calling the function repeatedly
        // * Note: If there is no base condition, the function call will go on infinitely and cause a StackOverflowError.
        if(n == 5){
            System.out.println(n);
            return;
        }
        // ? Calling the same function recursively to print the next number
        System.out.println(n);
        printer(n + 1);
    }
}
```

### **Explanation of the Code**

#### **Approach**
- The user enters a number.
- The function `printer(n)` prints `n` and calls itself with `n + 1`.
- When `n == 5`, the base condition stops further recursive calls.
- The recursion ensures numbers are printed in order, **without using loops**.

#### **Key Points**
- **No loop is used** as per the requirement.
- **A single function is used** instead of multiple functions.
- **Recursive calls consume stack memory**, so ensuring a base case is necessary to prevent stack overflow.

---

## **Alternative Approach: More Generalized Recursive Function**
Instead of fixing the stopping condition at `n == 5`, we can make the function more flexible:

```java
public static void printNumbers(long n, long max) {
    if (n > max) return; // Base case
    System.out.println(n);
    printNumbers(n + 1, max); // Recursive case
}
```

To call this function and print numbers from any given `n` to `max`, use:
```java
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the starting number: ");
    long start = sc.nextLong();
    System.out.print("Enter the ending number: ");
    long end = sc.nextLong();
    printNumbers(start, end);
}
```

This approach makes the function **more reusable** and **scalable** for any range of numbers.

---

## **Java Program for Fibonacci Series Using Recursion**

```java
package Base_Concepts.Recursion;
import java.util.*;

public class FibonacciRecursion {
    public static void main(String[] args) {

        // ? Notes:
        // * Break it down into smaller problems
        // * The base condition is represented by answers we already have, in this case W.K.T fibo(0) = 0 and fibo(1) = 1

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to print n Fibonacci number: ");
        int n = sc.nextInt();

        System.out.println(fibo(n));
    }

    static int fibo(int n){
        // * Base condition:
        if(n < 2 && n >= 0){
            return n;
        }
        // * Calling function:
        return fibo(n - 1) + fibo(n - 2);
    }
}
```

### **Explanation of the Fibonacci Code**

#### **Approach**
- The function `fibo(n)` returns `n` if `n` is 0 or 1 (base case).
- Otherwise, it calls itself recursively as `fibo(n - 1) + fibo(n - 2)`.
- This approach follows the mathematical definition of the Fibonacci sequence.

#### **Key Points**
- **Base case stops infinite recursion**.
- **Recursive calls create overlapping subproblems**, making it inefficient for large `n`.
- **Time Complexity:** `O(2^n)`, which is exponential and not optimal for large values.

---

## **Optimized Approach: Using Memoization (Dynamic Programming)**
Instead of recalculating Fibonacci numbers, we can store results in an array:

```java
import java.util.*;

public class FibonacciMemoization {
    static Map<Integer, Integer> memo = new HashMap<>();

    public static int fibo(int n) {
        if (n < 2) return n;
        if (memo.containsKey(n)) return memo.get(n);
        int result = fibo(n - 1) + fibo(n - 2);
        memo.put(n, result);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to find Fibonacci: ");
        int n = sc.nextInt();
        System.out.println(fibo(n));
    }
}
```

### **Advantages of Memoization**
- **Time Complexity:** `O(n)`, much faster than `O(2^n)`.
- **Avoids redundant calculations** by storing results.

This approach is more efficient for computing Fibonacci numbers for large values of `n`.

