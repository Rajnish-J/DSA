public class searchAlgorithms {
 
    public static void main(String[] args) {
        
        // * Demo array
        int[] arr = {7,10,17,18,45};

        // * Target element to search
        int target = 45;

        // * Uncomment below line to test element not found
        // int target = 50;

        // * Search for target element in array
        int resultLinearSearch = linearSearch(arr, target);

        // * Print the resultLinearSearch=> linear search
        System.out.println((resultLinearSearch == -1) ? "Element not found" : "Element found at index using linear search: " + resultLinearSearch);

        // * Search for target element in array using binary search
        int resultBinarySearch = binarySearch(arr, target);

        // * Print the resultBinarySearch=> binary search
        System.out.println((resultBinarySearch == -1) ? "Element not found" : "Element found at index using binary search: " + resultBinarySearch);
    }

    // ? Function to search for target element in array
    public static int linearSearch(int[] arr, int target) {
        long steps = 0;
        for(int i=0; i<arr.length; i++) {
            steps++;
            if(arr[i] == target) {
                System.out.println("Total steps taken in linear search: " + steps);
                return i;
            }
        }
        System.out.println("Total steps taken in linear search: " + steps);
        return -1;
    }

    // ? Function to search for target element in array using binary search
    public static int binarySearch(int[] arr, int target) {
        long steps = 0;
        int left = 0;
        int right = arr.length - 1;
        while(left <= right) {
            steps++;
            int mid = left + (right - left) / 2;
            if(arr[mid] == target) {
                System.out.println("Total steps taken in binary search: " + steps);
                return mid;
            }
            if(arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println("Total steps taken in binary search: " + steps);
        return -1;
    }

}
