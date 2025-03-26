package Base_Concepts.Recursion;

public class BinarysearchRecursion {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 18, 55, 66, 78};
        int target = 18;
        System.out.println(Search(arr, target, 0, arr.length-1 ));
    }

    public static int Search(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }

        int middle = start + (end - start) / 2;

        if (target == arr[middle]) {
            return middle;
        }

        if (target < arr[middle]) {
            return Search(arr, target, start, middle - 1);
        }

        return Search(arr, target, middle + 1, end);
    }

}
