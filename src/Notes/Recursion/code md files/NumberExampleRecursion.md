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

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to print: ");
        long num = sc.nextLong();

        printer(num);
    }

    public static void printer(long n){
        if(n == 5){
            System.out.println(n);
            return;
        }
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

