# Understanding Recursion and Recurrence Relations

## Variables in Recursive Functions
In recursive functions, variables are used in three key places:

1. **In the Arguments**  
   - These variables are passed to the next recursive calls.
   - Example: `Search(arr, target, start, end)` in a recursive binary search.

2. **In the Return Type**  
   - The return type determines what value is returned from the function.
   - Example: Returning an index in a search function.

3. **In the Function Body**  
   - These variables are used for processing within the function before passing them to recursive calls.
   - Example: Calculating the middle index in binary search.

### **Important Note:**
Make sure to **return the result** of a function call in the return statement to maintain recursion properly.

## Types of Recurrence Relations
Recurrence relations describe how problems are broken down in recursion. There are two main types:

### 1. **Linear Recurrence Relation**
   - The problem reduces based on previous values in a sequential manner.
   - **Example:** Fibonacci numbers.
     
     ```java
     public static int fibonacci(int n) {
         if (n <= 1) {
             return n;
         }
         return fibonacci(n - 1) + fibonacci(n - 2);
     }
     ```

### 2. **Divide and Conquer Recurrence Relation**
   - The problem size is reduced by a factor (often halved) in each step.
   - **Example:** Binary Search.
     
     ```java
     public static int binarySearch(int[] arr, int target, int start, int end) {
         if (start > end) {
             return -1;
         }
         int middle = start + (end - start) / 2;
         if (target == arr[middle]) {
             return middle;
         }
         if (target < arr[middle]) {
             return binarySearch(arr, target, start, middle - 1);
         }
         return binarySearch(arr, target, middle + 1, end);
     }
     ```

## **Key Takeaways**
- Always ensure that the function returns the result of the recursive call correctly.
- Identify whether a problem follows a **linear recurrence** or a **divide-and-conquer** recurrence pattern.
- Use recursion effectively by reducing problem size and ensuring correct base cases.

🚀 **Happy Coding!**

