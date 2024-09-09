/*
 * Given an array of size N and an integer 'target'. Find the indices(i, j) of two
   numbers such that their sum is equal to target. (i != J)
   You can assume that there will be exactly one solution.
   
   Time complexity = O(nSquare)
   Space complexity = O(1)
   
   Logic: Required number = (Target - arr[i]);
   Using: HashMap traversing each and every element in the array, if the target does not reaches the condition, 
   it adds in the HashMap, if the condition meets the current answers stored in the answer array and breaks the condition.
 */

package Arrays;

import java.util.HashMap;

public class twoSum {
	public static void main(String[] args) {
		int[] arr = { 11, 3, 7, 9, 14, 2 };
		int target = 17;
		int[] ans = new int[2];

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			int secondNumber = target - arr[i];
			if (map.containsKey(secondNumber)) {
				ans[0] = map.get(secondNumber);
				ans[1] = i;
				break;
			}
			map.put(arr[i], i);
		}

		System.out.println(ans[0] + " " + ans[1]);
	}
}