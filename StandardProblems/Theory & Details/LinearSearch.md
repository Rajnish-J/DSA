# **Linear Search**

## **Introduction**
Linear Search is the simplest searching algorithm. It is used to find a target element in a given list or array by checking each element sequentially until the desired element is found or the list ends.

## **How It Works?**
1. Start from the first element of the array.
2. Compare each element with the target element.
3. If a match is found, return the index of the element.
4. If the loop completes and no match is found, return -1 to indicate that the element is not present.

## **Algorithm**
```
1. Start from the first element.
2. Compare the target element with the current element.
3. If it matches, return the index.
4. If not, move to the next element.
5. Repeat steps 2-4 until the element is found or the list ends.
6. If the element is not found, return -1.
```

## **Java Implementation**
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

## **Time Complexity Analysis**
- **Best Case (O(1))**: When the target element is at the first position.
- **Worst Case (O(N))**: When the target element is at the last position or not present in the array.
- **Average Case (O(N))**: On average, the element may be found halfway through the list.

## **Space Complexity**
- **O(1) (Constant Space)**: No extra space is used apart from variables.

## **Advantages of Linear Search**
✔️ Simple and easy to implement.
✔️ Works on both sorted and unsorted arrays.
✔️ Does not require any preprocessing of data.

## **Disadvantages of Linear Search**
❌ Inefficient for large datasets.
❌ Slower than other searching algorithms like Binary Search.

## **When to Use Linear Search?**
✅ When the dataset is **small**.
✅ When the dataset is **unsorted**.
✅ When elements are **dynamic and frequently updated**.

## **Comparison with Binary Search**
| Algorithm        | Time Complexity (Worst) | Requires Sorted Data? |
|-----------------|-----------------------|----------------------|
| Linear Search   | O(N)                   | No                   |
| Binary Search   | O(log N)               | Yes                  |

## **Conclusion**
Linear Search is a fundamental algorithm used for searching elements in an array. It is simple but inefficient for large datasets. When dealing with sorted arrays, Binary Search is a better alternative.

