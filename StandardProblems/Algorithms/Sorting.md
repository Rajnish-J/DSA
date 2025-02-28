# **Sorting Algorithms: Bubble Sort, Selection Sort & Insertion Sort**

## **Introduction**

Sorting algorithms are fundamental in computer science and help arrange data in a specific order, typically ascending or descending. Three basic sorting algorithms, **Bubble Sort**, **Selection Sort**, and **Insertion Sort**, are widely used for educational purposes due to their simplicity and easy implementation.

---

# **Bubble Sort Algorithm**

## **How Bubble Sort Works?**

Bubble Sort repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. The process is repeated until the entire list is sorted.

### **Example: Sorting [45, 10, 18, 17, 7] in Ascending Order**

1. Compare `45` and `10`, swap → `[10, 45, 18, 17, 7]`
2. Compare `45` and `18`, swap → `[10, 18, 45, 17, 7]`
3. Compare `45` and `17`, swap → `[10, 18, 17, 45, 7]`
4. Compare `45` and `7`, swap → `[10, 18, 17, 7, 45]`
5. The largest element `45` is now placed at the end.

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
        bubbleSort(arr);
        System.out.print("Sorted array using bubble sort: " + Arrays.toString(arr));
    }
    public static void bubbleSort(int[] arr) {
        int size = arr.length;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
```

---

# **Selection Sort Algorithm**

## **How Selection Sort Works?**

Selection Sort divides the list into two sections: **sorted** and **unsorted**. It repeatedly finds the **minimum (or maximum) value** in the unsorted section and swaps it with the first unsorted element, reducing the number of swaps compared to Bubble Sort.

### **Example: Sorting [6, 5, 2, 8, 3, 7] in Ascending Order**

- Find the minimum value (`2`), swap it with the first element → `[2, 5, 6, 8, 3, 7]`
- Find the next minimum (`3`), swap with second element → `[2, 3, 6, 8, 5, 7]`
- Find the next minimum (`5`), swap with third element → `[2, 3, 5, 8, 6, 7]`
- Find the next minimum (`6`), swap with fourth element → `[2, 3, 5, 6, 8, 7]`
- Find the next minimum (`7`), swap with fifth element → `[2, 3, 5, 6, 7, 8]`
- The list is now sorted.

---

## **Algorithm**

1. Iterate over the array.
2. Find the minimum element from the unsorted part.
3. Swap it with the first unsorted element.
4. Repeat until the list is sorted.

---

## **Pseudocode**

```pseudo
procedure selectionSort(array)
    for i from 0 to length(array) - 1 do:
        minIndex = i
        for j from i + 1 to length(array) - 1 do:
            if array[j] < array[minIndex] then:
                minIndex = j
        swap(array[i], array[minIndex])
end procedure
```

---

## **Implementation in Java**

```java
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {6, 5, 2, 8, 3, 7};
        selectionSort(arr);
        System.out.println("Sorted array using selection sort: " + Arrays.toString(arr));
    }
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
```

---

# **Insertion Sort Algorithm**

## **How Insertion Sort Works?**

Insertion Sort builds a sorted array one element at a time. It picks an element and inserts it at its correct position in the already sorted part of the array.

### **Example: Sorting [7, 3, 5, 2, 8] in Ascending Order**

1. Take `3`, insert before `7` → `[3, 7, 5, 2, 8]`
2. Take `5`, insert between `3` and `7` → `[3, 5, 7, 2, 8]`
3. Take `2`, insert before `3` → `[2, 3, 5, 7, 8]`
4. The list is now sorted.

---

## **Implementation in Java**

```java
import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {7, 3, 5, 2, 8};
        insertionSort(arr);
        System.out.println("Sorted array using insertion sort: " + Arrays.toString(arr));
    }
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}
```

---

## **Conclusion**

Bubble Sort, Selection Sort, and Insertion Sort are simple sorting algorithms mainly used for educational purposes. More efficient sorting methods, such as Merge Sort and Quick Sort, are preferred for larger datasets.
