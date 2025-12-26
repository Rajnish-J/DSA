# ArrayList in Java

## 📌 Introduction

An **ArrayList** in Java is a resizable array implementation of the `List` interface. Unlike arrays, which have a fixed size, an **ArrayList** can dynamically grow and shrink as elements are added or removed. It is part of the `java.util` package and provides various utility methods for efficient manipulation of collections.

### 🔹 Key Features

- **Dynamic Resizing:** Unlike arrays, `ArrayList` automatically resizes when elements are added or removed.
- **Indexed Access:** Elements can be accessed using their index, just like arrays.
- **Non-Synchronized:** `ArrayList` is not thread-safe, meaning multiple threads modifying it simultaneously may cause issues.
- **Supports Duplicates:** It allows duplicate elements and maintains insertion order.

## 🔍 How It Works

An `ArrayList` internally uses an **array** to store its elements. When the array reaches its capacity, a **new array** with a larger size is created, and the old elements are copied into the new array.

### 🔹 Internal Working of `ArrayList`

1. When an `ArrayList` is created, an internal array is allocated with an **initial capacity** (default: 10).
2. When elements are added and the array reaches its maximum capacity, a **new array** is created with **1.5 times** the previous size.
3. The existing elements are **copied** into this new array.

## 📜 Algorithm

### 🔹 Adding an Element

1. Check if there is available space.
2. If space is available, insert the element at the next index.
3. If the array is full:
   - Create a **new array** with an increased size.
   - Copy all elements from the old array to the new array.
   - Insert the new element.

### 🔹 Removing an Element

1. Locate the element’s index.
2. Shift all subsequent elements one position to the left.
3. Reduce the size of the array if needed.

## 📝 Pseudo Code

```pseudo
class ArrayList:
    initialize array with default capacity (10)
    size = 0

    function add(element):
        if size == capacity:
            resize()
        array[size] = element
        size++

    function remove(index):
        if index < 0 or index >= size:
            throw IndexOutOfBoundsException
        shift elements left from index
        size--

    function get(index):
        return array[index]

    function resize():
        create new array with capacity * 1.5
        copy elements to new array
        set new array as internal array
```

## 💻 Implementation in Java

```java
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        // Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Accessing elements
        System.out.println("First element: " + list.get(0));

        // Removing an element
        list.remove("Banana");

        // Checking size
        System.out.println("Size: " + list.size());

        // Iterating through elements
        for (String fruit : list) {
            System.out.println(fruit);
        }
    }
}
```

## 📚 Theory

### 🔹 Methods in `ArrayList`

| Method                | Description                                     |
| --------------------- | ----------------------------------------------- |
| `add(E e)`            | Adds an element at the end.                     |
| `add(int index, E e)` | Inserts an element at the specified index.      |
| `remove(int index)`   | Removes the element at the given index.         |
| `get(int index)`      | Retrieves the element at the specified index.   |
| `size()`              | Returns the number of elements in the list.     |
| `contains(Object o)`  | Checks if the list contains a specific element. |
| `clear()`             | Removes all elements from the list.             |
| `isEmpty()`           | Checks if the list is empty.                    |

## ⏳ Time and Space Complexity

| Operation       | Time Complexity | Space Complexity |
| --------------- | --------------- | ---------------- |
| Add (end)       | O(1) amortized  | O(N)             |
| Add (middle)    | O(N)            | O(N)             |
| Remove (end)    | O(1)            | O(N)             |
| Remove (middle) | O(N)            | O(N)             |
| Get             | O(1)            | O(N)             |

## ✅ Advantages of `ArrayList`

- **Fast Random Access (O(1))** due to indexing.
- **Resizable**, unlike arrays.
- **Built-in methods** simplify implementation.

## ❌ Disadvantages of `ArrayList`

- **Slower insert/delete (O(N))** compared to `LinkedList`.
- **Memory overhead** due to dynamic resizing.
- **Not thread-safe** unless synchronized manually.

## 🎯 Conclusion

The `ArrayList` class in Java provides a **dynamic, efficient, and easy-to-use** implementation of a resizable array. While it excels in **random access operations**, it has **higher insertion and deletion costs** compared to `LinkedList`. Depending on use cases, `ArrayList` can be an excellent choice for applications that require **fast retrieval** and **moderate modifications**.
