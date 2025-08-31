### **Detailed Notes on Arrays and Time Complexity**

---

## **Introduction to Arrays**

- Suppose you have **five values**.
- Instead of storing them in **five different variables**, we can use **one sequence (array)** to store them together.
- This **array** has a **name** and stores values in **memory**.

---

## **Memory Allocation in Arrays**

- Every **data type** takes a specific amount of memory (e.g., `int` might take **2 bytes**).
- When we store **a single variable**, it has:
    1. A **memory location (address)**
    2. A **value**
- Example:
    
    ```c
    int a = 5;  // 'a' is stored at some memory location
    
    ```
    
- Arrays have **multiple values** but **one base address** (memory location of the first element).

---

## **How Memory Works for Arrays?**

- Example: Let’s say an array starts at memory **address 101**.
- If each element takes **2 bytes**, the next elements will be at:
    - **101** (Index 0)
    - **103** (Index 1)
    - **105** (Index 2)
    - **107** (Index 3)
    - **109** (Index 4)
- **Indexing starts from 0**, so the last index will be **size - 1**.

**Example Code (Array in Python):**

```python
# Creating an array (list in Python)
nums = [10, 20, 30, 40, 50]

# Accessing elements
print(nums[0])  # Output: 10 (first element)
print(nums[3])  # Output: 40 (fourth element)

```

---

## **Operations on Arrays**

### **1. Reading a Value**

- **Fast operation** because we directly access an index.
- Example:
    
    ```python
    nums = [10, 20, 30, 40, 50]
    print(nums[3])  # Output: 40
    
    ```
    
- The computer finds the address using:
    
    ```
    Base Address + (Index * Size of Element)
    
    ```
    

### **2. Searching for a Value**

- **Slow operation** (if the array is not sorted).
- The computer **doesn’t know where a value is**.
- It **checks every element** one by one (**Linear Search**).

**Example Code (Linear Search in Python):**

```python
def search(nums, target):
    for i in range(len(nums)):
        if nums[i] == target:
            return i  # Return index if found
    return -1  # Return -1 if not found

nums = [10, 20, 30, 40, 50]
print(search(nums, 30))  # Output: 2

```

- **Worst case scenario**: The value is at the **last position** or **not present**, meaning we check all elements.

---

### **3. Inserting a Value**

### **Case 1: Inserting at the End (Fast)**

- If we add a value at the **end**, we just **increase the size** of the array.
- **Very efficient!**

### **Case 2: Inserting in the Middle (Slow)**

- If we insert **between elements**, we must **shift all elements to the right**.
- **Takes more time** because every element after the position must be moved.

**Example Code (Insert in Python List):**

```python
nums = [10, 20, 30, 40, 50]

# Insert 25 at index 2
nums.insert(2, 25)

print(nums)  # Output: [10, 20, 25, 30, 40, 50]

```

- The **higher the index**, the **more shifting** we need.

---

### **4. Deleting a Value**

### **Case 1: Deleting from the End (Fast)**

- We **just remove the last element**.
- **No shifting required!**

### **Case 2: Deleting from the Middle (Slow)**

- If we delete from the **middle**, we must **shift elements to the left**.

**Example Code (Delete in Python List):**

```python
nums = [10, 20, 30, 40, 50]

# Remove element at index 2
nums.pop(2)

print(nums)  # Output: [10, 20, 40, 50]

```

- **More elements to shift = More time required.**

---

## **Why Is Time Important?**

- **Operations take time**, especially when working with **large arrays (thousands/millions of values)**.
- The time taken is measured in **steps**, not CPU speed.

### **Example: Printing Even Numbers from 1 to 10**

**Method 1 (Inefficient)**:

```python
for i in range(1, 11):
    if i % 2 == 0:
        print(i)

```

- This **checks every number**, even if it’s **not needed**.

**Method 2 (Efficient)**:

```python
for i in range(2, 11, 2):
    print(i)

```

- This **only loops through even numbers**, saving **time**.

---

## **Introduction to Time Complexity**

- Instead of measuring **actual runtime**, we measure **number of steps**.
- More **steps = Slower algorithm**.
- The **faster algorithm** is always preferred!

### **Sorting and Inserting in a Sorted Array**

- If an **array is already sorted**, inserting a new element is tricky.
- Example: Insert **11** into a sorted array `[5, 9, 15, 20]`.
    - We **search for the correct position**.
    - We **shift elements to make space**.
    - Then **insert** the new value.
- The more **elements after the insertion point**, the **slower the operation**.

---

## **Conclusion**

- **Arrays store multiple values in a single variable.**
- **Memory allocation is sequential.**
- **Basic operations:**
    - **Reading (Fast)**
    - **Searching (Slow if unsorted, Fast if sorted)**
    - **Inserting (Fast at the end, Slow in the middle)**
    - **Deleting (Fast at the end, Slow in the middle)**
- **Time complexity is important** because:
    1. Different computers have different speeds.
    2. We measure efficiency using **steps**, not time.

---

### **What’s Next?**

- Next, we will learn about **Time Complexity (Big O Notation)** in detail.
- Stay excited! 🚀