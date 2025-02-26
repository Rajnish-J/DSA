public class linearSearch {
 
    public static void main(String[] args) {
        
        // * Demo array
        int[] arr = {7,10,17,18,45};

        // * Target element to search
        int target = 18;

        // * Uncomment below line to test element not found
        // int target = 50;

        // * Search for target element in array
        int result = Search(arr, target);

        // * Print the result
        System.out.println((result == -1) ? "Element not found" : "Element found at index: " + result);
    }

    // * Function to search for target element in array
    public static int Search(int[] arr, int target) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

}
