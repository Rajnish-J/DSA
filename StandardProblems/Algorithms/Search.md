# **Linear Search and Binary Search**

## **Linear Search**

### **Introduction**
Linear Search is the simplest searching algorithm. It is used to find a target element in a given list or array by checking each element sequentially until the desired element is found or the list ends.

### **How It Works?**
1. Start from the first element of the array.
2. Compare each element with the target element.
3. If a match is found, return the index of the element.
4. If the loop completes and no match is found, return -1 to indicate that the element is not present.

### **Algorithm**
```
1. Start from the first element.
2. Compare the target element with the current element.
3. If it matches, return the index.
4. If not, move to the next element.
5. Repeat steps 2-4 until the element is found or the list ends.
6. If the element is not found, return -1.
```

### **Java Implementation**
```java
public class LinearSearch {
    public static int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Element found, return index
            }
        }
        return -1; // Element not found
    }

    public static void main(String[] args) {
        int[] numbers = {5, 8, 1, 3, 10, 7};
        int target = 3;
        
        int result = search(numbers, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}
```

### **Time Complexity Analysis**
- **Best Case (O(1))**: When the target element is at the first position.
- **Worst Case (O(N))**: When the target element is at the last position or not present in the array.
- **Average Case (O(N))**: On average, the element may be found halfway through the list.

### **Space Complexity**
- **O(1) (Constant Space)**: No extra space is used apart from variables.

### **Advantages of Linear Search**
✔️ Simple and easy to implement.
✔️ Works on both sorted and unsorted arrays.
✔️ Does not require any preprocessing of data.

### **Disadvantages of Linear Search**
❌ Inefficient for large datasets.
❌ Slower than other searching algorithms like Binary Search.

---

## **Binary Search**

### **Introduction**
Binary Search is a more efficient searching algorithm compared to Linear Search. It works on sorted arrays by repeatedly dividing the search space in half until the target element is found or the search space is exhausted.

### **How It Works?**
1. Find the middle element of the array.
2. If the middle element is equal to the target, return its index.
3. If the middle element is greater than the target, search in the left half.
4. If the middle element is less than the target, search in the right half.
5. Repeat the process until the element is found or the search space is empty.

### **Algorithm**
```
1. Set low = 0 and high = array length - 1.
2. Repeat while low <= high:
   a. Find mid = (low + high) / 2.
   b. If array[mid] == target, return mid.
   c. If array[mid] < target, set low = mid + 1.
   d. If array[mid] > target, set high = mid - 1.
3. If the element is not found, return -1.
```

### **Java Implementation**
```java
public class BinarySearch {
    public static int search(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid; // Element found, return index
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1; // Element not found
    }

    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 7, 8, 10};
        int target = 3;
        
        int result = search(numbers, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}
```

### **Time Complexity Analysis**
- **Best Case (O(1))**: When the target element is found at the middle.
- **Worst Case (O(log N))**: The search space is halved in each step.
- **Average Case (O(log N))**: Logarithmic search complexity.

### **Space Complexity**
- **O(1) (Constant Space)**: No extra space is used apart from variables.

### **Advantages of Binary Search**
✔️ Much faster than Linear Search for large datasets.
✔️ Logarithmic time complexity O(log N).
✔️ Efficient for searching in sorted datasets.

### **Disadvantages of Binary Search**
❌ Requires the array to be sorted before searching.
❌ Not suitable for dynamic datasets where elements are frequently inserted or deleted.

### **Comparison with Linear Search**
| Algorithm        | Time Complexity (Worst) | Requires Sorted Data? |
|-----------------|-----------------------|----------------------|
| Linear Search   | O(N)                   | No                   |
| Binary Search   | O(log N)               | Yes                  |

---

### **Conclusion**
Linear Search is simple and works on unsorted datasets but is inefficient for large arrays. Binary Search is much faster with O(log N) complexity but requires a sorted array. Choosing the right search algorithm depends on the dataset and requirements.

