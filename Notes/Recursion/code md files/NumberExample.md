## Code Explanation
### **Java Program to Print Numbers Using Recursion**

```java
package Base_Concepts.Recursion;

public class NumbersExample {

    // ? Ask a number from user and print it using recursion
    // ? Restrictions:
    // * The function could be called once
    // * Do not use any loop
    // ? Example: n = 5 => 1, 2, 3, 4, 5

    public static void main(String[] args) {
        print1(1);
    }

    public static void print1(int n){
        System.out.println(n);
        print2(2);
    }

    public static void print2(int n){
        System.out.println(n);
        print3(3);
    }

    public static void print3(int n){
        System.out.println(n);
        print4(4);
    }

    public static void print4(int n){
        System.out.println(n);
        print5(5);
    }

    public static void print5(int n){
        System.out.println(n);
    }
}
```

### **Explanation of the Code**

#### **Approach**
- The function `print1()` prints `1` and calls `print2(2)`.
- `print2()` prints `2` and calls `print3(3)`, and so on.
- `print5()` prints `5` and **does not make any further recursive calls**, acting as the **base case**.
- The recursion stops at `print5()`, ensuring the function doesn't run indefinitely.

#### **Key Points**
- **No loop is used** as per the restriction.
- **Multiple functions are used instead of one recursive function**, which is not an optimal approach but follows the given constraints.
- **Each function call adds a new stack frame**, leading to a deeper recursion depth.

---

## **Optimized Approach: Using a Single Recursive Function**
Instead of writing multiple functions (`print1()` to `print5()`), we can use a single recursive function with an integer parameter:

```java
public static void printNumbers(int n, int max) {
    if (n > max) return; // Base case
    System.out.println(n);
    printNumbers(n + 1, max); // Recursive case
}
```

To call this function and print numbers from `1` to `5`, use:
```java
public static void main(String[] args) {
    printNumbers(1, 5);
}
```

This is a more **efficient** and **scalable** recursive approach.

