package Concepts.Array.TUFProblems.Medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twoSum {

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(OptimalApproact(arr, target)));
    }

    public static int[] OptimalApproact(int[] nums, int target) {
        Map<Integer, Integer> arr = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int cur = nums[i];
            int x = target - cur;
            if (arr.containsKey(x)) {
                return new int[]{arr.get(x), i};
            }
            arr.put(cur, i);
        }
        return null;
    }
}
