# Time Complexity

## Comparison:

| Old Computer | Brand New Computer |
|-------------|------------------|
| **Task:** Find an unavailable number in an array of size **1 million** | **Same Task** |
| **Time Taken:** 10 seconds | **Time Taken:** 1 second |

🔹 **Conclusion:** Even though the new machine is faster, both machines have the **same time complexity**. **Time complexity ≠ Actual Time Taken**.

---

## 📌 **Definition**
Time complexity is a **mathematical function** that describes how execution time **grows** as input size increases. It tells us the relationship between **input size** and **time taken**.

> "Time Complexity is a function that defines how the execution time increases as the input size grows."

### 🔍 Why Do We Need Time Complexity?
Let's compare **Linear Search** and **Binary Search**:

- **Linear Search**: O(N) 
- **Binary Search**: O(log N)

> ✅ **Key Tip:** Always think about **large inputs**. Ignore small inputs when analyzing complexity.

### Graph Comparison:

```plaintext
    Complexity Growth Chart
    (Y-axis: Time | X-axis: Input Size)

    O(1)   ----
    O(log N)  --/--
    O(N)     ----/----
    O(N^2)   ----/----/----
    O(2^N)   ----/----/----/----
```

✅ **Conclusion:** O(1) < O(log N) < O(N) < O(N²) < O(2^N)

---

## 📌 **Key Considerations When Analyzing Complexity**

1️⃣ Always analyze the **worst-case** complexity.
2️⃣ Always consider the **complexity for large inputs**.
3️⃣ Ignore **constants and less dominant terms** because they don't significantly affect large inputs.

#### Example:
Given complexity:

```plaintext
O(N³ + log N)
```

For **N = 1,000,000 (1 million):**

```plaintext
(1,000,000)³ + log(1,000,000)
= (1,000,000)³ + 6 seconds (since log(1M) ≈ 6)
```

Since **1 million³ is much larger than 6**, we ignore `log N`. 

✅ **Final Complexity** → **O(N³)**

---

## 📌 **Common Time Complexities & Examples**

| Complexity | Notation | Example |
|------------|---------|---------|
| Constant Time | O(1) | Array index access `arr[i]` |
| Logarithmic Time | O(log N) | Binary search |
| Linear Time | O(N) | Looping through an array |
| Linearithmic Time | O(N log N) | Merge sort, Quick sort (average case) |
| Quadratic Time | O(N²) | Nested loops (e.g., Bubble Sort) |
| Cubic Time | O(N³) | Triple nested loops |
| Exponential Time | O(2^N) | Recursive Fibonacci |
| Factorial Time | O(N!) | Traveling Salesman Problem |

---

## 📌 **Example Code Implementations**

### 1️⃣ **O(1) - Constant Time**
```python
# Accessing an element in an array is O(1)
arr = [10, 20, 30, 40, 50]
print(arr[2])  # Always takes the same time
```

### 2️⃣ **O(N) - Linear Time**
```python
# Looping through an array is O(N)
def find_element(arr, target):
    for num in arr:
        if num == target:
            return True
    return False
```

### 3️⃣ **O(log N) - Logarithmic Time**
```python
# Binary Search Algorithm (O(log N))
def binary_search(arr, target):
    left, right = 0, len(arr) - 1
    while left <= right:
        mid = (left + right) // 2
        if arr[mid] == target:
            return mid
        elif arr[mid] < target:
            left = mid + 1
        else:
            right = mid - 1
    return -1
```

### 4️⃣ **O(N²) - Quadratic Time**
```python
# Bubble Sort (O(N²))
def bubble_sort(arr):
    n = len(arr)
    for i in range(n):
        for j in range(n - i - 1):
            if arr[j] > arr[j + 1]:
                arr[j], arr[j + 1] = arr[j + 1], arr[j]
```

---

## **Final Thoughts**
✅ **Focus on worst-case scenarios** when analyzing algorithms.
✅ **Ignore constants and low-order terms** (e.g., O(N³ + log N) → O(N³)).
✅ **Prioritize efficient algorithms** for large input sizes.

🚀 **Mastering time complexity helps in writing optimized code!**
