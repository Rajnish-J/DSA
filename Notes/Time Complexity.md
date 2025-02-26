# **Introduction to Algorithms and Algorithm Analysis**

## **What is an Algorithm?**

- An **algorithm** is a set of well-defined steps or instructions used to solve a problem.
- Every problem has multiple solutions, and an algorithm defines the structured approach to solving it.
- Example: **Cooking a dish**
    - Collect ingredients
    - Prepare them (cutting, mixing, etc.)
    - Cook them following steps
    - Serve the dish
- Similarly, in programming, we define an algorithm to solve a problem efficiently.

## **Why Analyze an Algorithm?**

- Different algorithms can solve the same problem, but some are more **efficient** than others.
- Efficiency is measured in terms of:
    1. **Time Complexity** - How fast the algorithm runs
    2. **Space Complexity** - How much memory it uses

## **Time and Space Complexity**

- **Time Complexity:** Measures how execution time increases with input size.
- **Space Complexity:** Measures how much memory is needed.
- Example:
    - If an algorithm takes 1 second for 10 inputs, will it take 10 seconds for 100 inputs?
    - We need a way to measure this without relying on actual execution time since it depends on machine specifications.

## **Measuring Algorithm Efficiency with Big-O Notation**

- We analyze efficiency using **Big-O notation**, which helps us understand how execution time grows with input size.
- Different complexities:
    - **O(1)** – Constant time
    - **O(log N)** – Logarithmic time
    - **O(N)** – Linear time
    - **O(N log N)** – Log-linear time
    - **O(N²)** – Quadratic time
    - **O(2^N)** – Exponential time
    - **O(N!)** – Factorial time

## **Searching Algorithms**

### **1. Linear Search**

- Searches for an element **one by one** in an array.
- Best case: The element is found in the first position (**O(1)**).
- Worst case: The element is at the last position or not present (**O(N)**).
- **Example:**
    
    ```python
    def linear_search(arr, target):
        for i in range(len(arr)):
            if arr[i] == target:
                return i  # Return index of the element
        return -1  # Element not found
    
    arr = [5, 7, 9, 12, 17]
    print(linear_search(arr, 12))  # Output: 3
    print(linear_search(arr, 6))   # Output: -1 (Not found)
    
    ```
    

### **2. Binary Search**

- Works only on **sorted arrays**.
- **Divides the array** into two halves and searches in the appropriate half.
- Significantly reduces the number of comparisons (**O(log N)**).
- **Example:**
    
    ```python
    def binary_search(arr, target):
        left, right = 0, len(arr) - 1
        while left <= right:
            mid = (left + right) // 2
            if arr[mid] == target:
                return mid  # Return index
            elif arr[mid] < target:
                left = mid + 1  # Search in the right half
            else:
                right = mid - 1  # Search in the left half
        return -1  # Element not found
    
    arr = [5, 6, 8, 9, 11, 13, 17]
    print(binary_search(arr, 8))  # Output: 2
    print(binary_search(arr, 10)) # Output: -1 (Not found)
    
    ```
    

## **Comparison of Linear and Binary Search**

| Search Type | Time Complexity (Worst Case) | When to Use? |
| --- | --- | --- |
| **Linear Search** | O(N) | When the array is unsorted or very small |
| **Binary Search** | O(log N) | When the array is sorted |

## **Understanding Big-O with Graphs**

- **O(1) (Constant Time):** Execution time remains the same regardless of input size.
- **O(log N) (Logarithmic Time):** Execution time increases very slowly.
- **O(N) (Linear Time):** Execution time increases proportionally to input size.
- **O(N²) (Quadratic Time):** Execution time grows much faster with input size.
- **O(2^N) (Exponential Time):** Execution time doubles with each new input size.

## **Key Takeaways**

- **Choose the best algorithm** based on efficiency, not just correctness.
- **Linear search** is easy but slow for large inputs.
- **Binary search** is much faster but requires a **sorted** array.
- **Big-O notation** helps in comparing algorithms.
- **Optimizing code** involves improving time and space complexity.

---

These notes provide a structured explanation of algorithms, complexity, and searching techniques discussed in the transcript.