# Recursion in Java

## What is Recursion?
Recursion is a technique in programming where a function calls itself to solve smaller subproblems of the original problem. A recursive function typically has:

1. **Base Case**: A condition that stops recursion to prevent infinite loops.
2. **Recursive Case**: The function calls itself with a modified argument to approach the base case.

---

## Code Explanation
### **Java Program to Print "Hello world" Five Times Using Different Approaches**

```java
package Base_Concepts.Recursion;

class Message {

    // ? Print "Hello world" 5 times using function without altering the function
    public static void main(String[] args) {
        
        // * Approach 1: Using a Loop
        for(int i = 0; i <= 5; i++){
            message();
        }

        // * Approach 2: Using Recursion
        message1();
    }

    public static void message(){
        System.out.println("Hello world");
    }

    public static void message1(){
        System.out.println("Hello world");
        message2();
    }

    public static void message2(){
        System.out.println("Hello world");
        message3();
    }

    public static void message3(){
        System.out.println("Hello world");
        message4();
    }

    public static void message4(){
        System.out.println("Hello world");
        message5();
    }

    public static void message5(){
        System.out.println("Hello world");
    }
}
```

### **Explanation of the Code**

#### **Approach 1: Using a Loop**
- A `for` loop runs from `i = 0` to `i <= 5`.
- Inside the loop, the `message()` method is called, which prints "Hello world" five times.

#### **Approach 2: Using Recursion**
- The `message1()` function prints "Hello world" and calls `message2()`.
- `message2()` prints "Hello world" and calls `message3()`.
- This continues until `message5()`, which only prints "Hello world" without making a recursive call.
- The function chain stops at `message5()`, which acts as the **base case** (stopping condition) for recursion.

---

## **Key Takeaways**
- **Recursion replaces loops** in some cases but uses the call stack.
- If the **base case is missing**, the recursion will continue indefinitely and cause a **StackOverflowError**.
- Recursion can sometimes be less efficient than loops due to **extra function calls** and **stack memory usage**.

---

## **Alternative Approach: A Better Recursive Function**
Instead of writing multiple functions (`message1()` to `message5()`), we can use a single recursive function with an integer parameter:

```java
public static void printMessage(int n) {
    if (n == 0) return; // Base case
    System.out.println("Hello world");
    printMessage(n - 1); // Recursive case
}
```

To call this function and print "Hello world" five times, use:
```java
public static void main(String[] args) {
    printMessage(5);
}
```

This is a more **efficient** and **scalable** recursive approach.

