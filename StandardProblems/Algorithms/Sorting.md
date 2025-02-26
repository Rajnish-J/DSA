# **Bubble Sort Algorithm**

## **Introduction**

Bubble Sort is a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. The process is repeated until the list is sorted.

Although Bubble Sort is not the most efficient sorting algorithm, it is widely used for educational purposes as it is easy to understand and implement.

---

## **How Bubble Sort Works?**

Bubble Sort works by repeatedly swapping adjacent elements if they are in the wrong order. The largest element "bubbles" to the end in each iteration, hence the name **Bubble Sort**.

### **Example: Sorting [45, 10, 18, 17, 7] in Ascending Order**

1. Compare `45` and `10`, swap → `[10, 45, 18, 17, 7]`
2. Compare `45` and `18`, swap → `[10, 18, 45, 17, 7]`
3. Compare `45` and `17`, swap → `[10, 18, 17, 45, 7]`
4. Compare `45` and `7`, swap → `[10, 18, 17, 7, 45]`
5. The largest element `45` is now placed at the end.

This process is repeated until the entire array is sorted.

---

## **Algorithm**

1. Repeat for `n-1` passes:
   - Iterate over the list.
   - Compare adjacent elements.
   - Swap if they are in the wrong order.
2. Stop when no swaps are needed.

---

## **Pseudocode**

```pseudo
procedure bubbleSort(array)
    for i from 0 to length(array) - 1 do:
        swapped = false
        for j from 0 to length(array) - i - 1 do:
            if array[j] > array[j+1] then:
                swap(array[j], array[j+1])
                swapped = true
        if swapped = false then
            break
end procedure
```

---

## **Implementation in Java**

```java
import java.util.Arrays;

public class SortingAlgorithms {

    public static void main(String[] args) {

        int[] arr = {45, 10, 18, 17, 7};

        // * Uncomment below line to test bubble sort
        int[] resultBubbleSort = bubbleSort(arr);

        // * Print the resultBubbleSort=> bubble sort
        System.out.print("Sorted array using bubble sort: " + Arrays.toString(resultBubbleSort));

    }

    public static int[] bubbleSort(int[] arr) {
        int size = arr.length;
        for (int i = 0; i < size - 1; i++) { // Corrected loop condition
            for (int j = 0; j < size - i - 1; j++) { // Prevent out-of-bounds access
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

}
```

🔴 **Fix Applied:** The original Java implementation had an `ArrayIndexOutOfBoundsException` because it accessed `arr[j + 1]` even when `j` was at the last index. The corrected code ensures `j` runs only up to `size - i - 1`.

---

## **Theory**

- **Bubble Sort** works by repeatedly **comparing and swapping adjacent elements**.
- The largest element moves to its correct position at the end after each pass.
- **Best case:** Already sorted list → **O(n)**
- **Worst case:** Reverse sorted list → **O(n²)**

---

## **Time Complexity**

| Case         | Complexity                 |
| ------------ | -------------------------- |
| Best Case    | **O(n)** (already sorted)  |
| Worst Case   | **O(n²)** (reverse sorted) |
| Average Case | **O(n²)**                  |

### **Space Complexity**

- **O(1)** (In-place sorting, no extra memory required)

---

## **Advantages**

✅ **Simple and Easy** - Easy to understand and implement.  
✅ **No Extra Space** - Requires only O(1) extra memory.  
✅ **Stable Sort** - Maintains the relative order of equal elements.

---

## **Disadvantages**

❌ **Slow for Large Data** - O(n²) makes it inefficient for large datasets.  
❌ **Unnecessary Comparisons** - Even when sorted, it still checks all elements.

---

## **Conclusion**

Bubble Sort is a basic sorting algorithm that is **easy to implement but inefficient for large datasets**. It is mainly used for **educational purposes** to demonstrate sorting concepts, but in real-world applications, more efficient algorithms like **Merge Sort** or **Quick Sort** are preferred.
