# Recursion

## Introduction

Recursion is a fundamental concept in computer science and programming. It involves a function calling itself to solve smaller instances of a problem. This video emphasizes its importance, particularly for data structures, algorithms, and coding interviews.

Key Points:
- **Importance**: Understanding recursion is crucial for mastering topics like binary trees, linked lists, binary search trees, dynamic programming, heaps, graphs, and traversals.
- **Challenges**: Beginners often find recursion complex and may face difficulties initially. However, persistence is key.
- **Learning Steps**:
  - Understand the problem and break it down into smaller sub-problems.
  - Formulate a recurrence relation.
  - Draw the recursive tree.
  - Follow the flow of function calls and values returned at each step.
  - Identify the base case to ensure termination.
  - Consider the time and space complexity for optimization.

### Real-World Examples of Recursion
- **Mathematical Computations**: Factorial, Fibonacci sequence, exponentiation.
- **Data Structures**: Tree and graph traversals (DFS, BFS), linked list reversals.
- **Sorting Algorithms**: Merge Sort, Quick Sort.
- **Backtracking**: Solving mazes, Sudoku, N-Queens problem.
- **Divide and Conquer Algorithms**: Binary Search, Karatsuba Algorithm for multiplication.

## How It Works

### Function Calls and Stack Memory
- Functions are stored in stack memory when called.
- Each function call remains in the stack until it finishes executing.
- The program flow returns to where the function was called once it completes execution.

### Example: Printing Numbers
1. **Function Definition**:
   ```java
   public static void print(int n) {
       if (n == 5) {
           System.out.println(n);
           return;
       }
       System.out.println(n);
       print(n + 1);
   }
   ```
2. **Execution Flow**:
   - The `print` function calls itself with `n+1` until `n` equals 5.
   - Once `n` equals 5, it prints and returns, unwinding the stack.

### Recursive Tree Visualization
- Visualize recursion using a tree structure to understand how each function call branches out.
- Helps in identifying base cases and ensuring proper termination.

### Understanding Base Case
The base case is the condition that stops the recursive calls. Without a base case, recursion may lead to an infinite loop and a stack overflow error.

Example:
```java
public static void countdown(int n) {
    if (n == 0) {  // Base case
        System.out.println("Done!");
        return;
    }
    System.out.println(n);
    countdown(n - 1); // Recursive call
}
```

## Algorithm

1. **Identify Base Case**: Determine when the recursion should stop.
2. **Divide Problem**: Break the problem into smaller sub-problems.
3. **Recursive Call**: Call the function on these sub-problems.
4. **Combine Results**: Combine results from sub-problems to solve the original problem.
5. **Optimize (if needed)**: Use techniques like memoization to avoid redundant calculations.

## Pseudo Code

```
function recursiveFunction(input):
    if baseCaseCondition(input):
        return baseCaseValue
    else:
        subProblem = divideProblem(input)
        result = recursiveFunction(subProblem)
        combineResults(result)
        return finalResult
```

## Implementation in Java

### Fibonacci Numbers Example

```java
public class Fibonacci {
    public static int fibo(int n) {
        if (n < 2) {
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println(fibo(n)); // Output: 8
    }
}
```

### Binary Search Using Recursion

```java
public class BinarySearch {
    public static int search(int[] array, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (array[mid] == target) {
            return mid;
        } else if (target < array[mid]) {
            return search(array, target, start, mid - 1);
        } else {
            return search(array, target, mid + 1, end);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 55, 66, 78};
        int target = 66;
        System.out.println(search(array, target, 0, array.length - 1)); // Output: 5
    }
}
```

## Theory

### Types of Recurrence Relations
- **Linear Recurrence Relation**: Problems reduced linearly (e.g., Fibonacci).
- Commonly inefficient due to repeated calculations unless optimized with techniques like memoization.
  
- **Divide and Conquer Recurrence Relation**: Problems divided by a factor (e.g., Binary Search).
- Generally more efficient compared to linear recurrences.

### Tail Recursion
- When the recursive call is the last operation in the function.
- Can be optimized by some compilers to prevent additional stack usage.

Example of Tail Recursion:
```java
public static void tailRecursiveFunction(int n) {
    if (n == 0) {
        return;
    }
    System.out.println(n);
    tailRecursiveFunction(n - 1);
}
```

## Time and Space Complexity Calculations

### Fibonacci Numbers
- **Time Complexity**: Approximately \(O(\phi^n)\), where \(\phi\) is the golden ratio (≈1.618).
- **Space Complexity**: O(n) due to the depth of the recursion tree.

### Binary Search
- **Time Complexity**: O(log n) as the problem size reduces by half each time.
- **Space Complexity**: O(log n) due to the depth of the recursion tree.

## Advantages and Disadvantages

### Advantages
- Simplifies complex problems.
- Elegant solutions for problems like tree traversals, sorting algorithms, etc.
- Facilitates conversion between iterative and recursive solutions.

### Disadvantages
- Can lead to stack overflow errors if not managed properly.
- Inefficient for certain problems without optimization (e.g., naive Fibonacci implementation).
- Sometimes difficult to debug due to nested function calls.

## Conclusion

Understanding recursion is pivotal for excelling in programming and technical interviews. By following structured approaches—identifying base cases, breaking down problems, visualizing recursive trees, and practicing extensively—you can master recursion. Remember, recursion is not just about watching tutorials; it requires hands-on practice and visualization on paper.

### Action Items
- Practice drawing recursive trees.
- Implement recursive solutions for various problems.
- Debug and trace recursive calls to understand their flow.
- Share insights and seek help within communities to reinforce learning.

For further learning, explore advanced topics like dynamic programming, merge sort, quicksort, and detailed space-time complexity analysis.
