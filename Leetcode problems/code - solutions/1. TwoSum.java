
import java.util.HashMap;
import java.util.Map;

class Solution {

    // * Function to find two numbers in the array that add up to the target
    public int[] twoSum(int[] nums, int target) {
        // * Create a HashMap to store numbers and their indices
        Map<Integer, Integer> map = new HashMap<>();

        // * Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // * Current number
            int cur = nums[i];
            // * Complement that would sum up to the target
            int complement = target - cur;

            // * Check if the complement is already in the map
            if (map.containsKey(complement)) {
                // * Return indices of the two numbers
                return new int[]{map.get(complement), i};
            }

            // * Store the current number and its index in the map
            map.put(cur, i);
        }

        // * Return null if no solution is found (as per problem constraints, this won't happen)
        return null;
    }

    // ? Main method to test the function
    public static void main(String[] args) {
        // * Create an instance of Solution class
        Solution solution = new Solution(); 

        // * Input array
        int[] nums = {2, 7, 11, 15};
        // * Target sum
        int target = 9;

        // * Call twoSum function
        int[] result = solution.twoSum(nums, target);
        
        // * Print the result
        if (result != null) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No two sum solution found.");
        }
    }
}
