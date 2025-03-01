# Sorting Algorithms: Bubble Sort, Selection Sort, Insertion Sort & Merge Sort

## Introduction

Sorting algorithms are fundamental in computer science and help arrange data in a specific order, typically ascending or descending. Four commonly used sorting algorithms, **Bubble Sort**, **Selection Sort**, **Insertion Sort**, and **Merge Sort**, are widely used for educational purposes due to their simplicity and easy implementation.

---

## Bubble Sort Algorithm

### How Bubble Sort Works?

Bubble Sort repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. The process is repeated until the entire list is sorted.

### Algorithm

1. Repeat for `n-1` passes:
   - Iterate over the list.
   - Compare adjacent elements.
   - Swap if they are in the wrong order.
2. Stop when no swaps are needed.

### Pseudocode

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

### Implementation in Java

```java
public static int[] bubbleSort(int[] arr) {
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
    return arr;
}
```

---

## Selection Sort Algorithm

### How Selection Sort Works?

Selection Sort divides the list into two sections: **sorted** and **unsorted**. It repeatedly finds the **minimum (or maximum) value** in the unsorted section and swaps it with the first unsorted element, reducing the number of swaps compared to Bubble Sort.

### Algorithm

1. Iterate over the array.
2. Find the minimum element from the unsorted part.
3. Swap it with the first unsorted element.
4. Repeat until the list is sorted.

### Pseudocode

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

### Implementation in Java

```java
public static int[] selectionSort(int[] arr) {
    int size = arr.length;
    for (int i = 0; i < size - 1; i++) {
        int minIndex = i;
        for (int j = i + 1; j < size; j++) {
            if (arr[j] < arr[minIndex]) {
                minIndex = j;
            }
        }
        int temp = arr[minIndex];
        arr[minIndex] = arr[i];
        arr[i] = temp;
    }
    return arr;
}
```

---

## Insertion Sort Algorithm

### How Insertion Sort Works?

Insertion Sort builds a sorted array one element at a time. It picks an element and inserts it at its correct position in the already sorted part of the array.

### Algorithm

1. Assume the first element is sorted.
2. Pick the next element.
3. Insert it at its correct position by shifting larger elements to the right.
4. Repeat until the array is sorted.

### Pseudocode

```pseudo
procedure insertionSort(array)
    for i from 1 to length(array) - 1 do:
        key = array[i]
        j = i - 1
        while j >= 0 and array[j] > key do:
            array[j + 1] = array[j]
            j = j - 1
        array[j + 1] = key
end procedure
```

### Implementation in Java

```java
public static int[] insertionSort(int[] arr) {
    for (int i = 1; i < arr.length; i++) {
        int key = arr[i];
        int j = i - 1;
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j = j - 1;
        }
        arr[j + 1] = key;
    }
    return arr;
}
```

---

## Merge Sort Algorithm

### How Merge Sort Works?

Merge Sort is a divide-and-conquer algorithm that splits an array into two halves, sorts them recursively, and then merges them back together in sorted order.

### Algorithm

1. If the array has one or zero elements, return it.
2. Split the array into two halves.
3. Recursively sort both halves.
4. Merge the sorted halves back together.

### Pseudocode

```pseudo
procedure mergeSort(array)
    if length(array) <= 1 then
        return array
    mid = length(array) / 2
    left = mergeSort(array[0:mid])
    right = mergeSort(array[mid:length(array)])
    return merge(left, right)
```

### Implementation in Java

```java
public static int[] mergeSort(int[] arr) {
    if (arr.length <= 1) {
        return arr;
    }
    int mid = arr.length / 2;
    int[] left = Arrays.copyOfRange(arr, 0, mid);
    int[] right = Arrays.copyOfRange(arr, mid, arr.length);
    return merge(mergeSort(left), mergeSort(right));
}
```

---

## Time & Space Complexity

| Algorithm      | Best Case (Ω) | Average Case (Θ) | Worst Case (O) | Space Complexity | Time Taken (nano seconds) |
| -------------- | ------------- | ---------------- | -------------- | ---------------- | ----------------------|
| Bubble Sort    | O(n)          | O(n²)            | O(n²)          | O(1)             | 7800                  |
| Selection Sort | O(n²)         | O(n²)            | O(n²)          | O(1)             | 8000                  |
| Insertion Sort | O(n)          | O(n²)            | O(n²)          | O(1)             | 7900                  |
| Merge Sort     | O(n log n)    | O(n log n)       | O(n log n)     | O(n)             | 45800                 |

---

## Conclusion

Bubble Sort, Selection Sort, Insertion Sort, and Merge Sort each serve different purposes. While the first three are useful for small datasets and educational purposes, Merge Sort is more efficient for large datasets due to its **O(n log n)** time complexity.
