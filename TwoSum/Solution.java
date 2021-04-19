package TwoSum;

/**
 * Solution to the TwoSum Problem
 * https://leetcode.com/problems/two-sum/
 * 
 * @author Karl Damus
 */
public class Solution {
	public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i += 1) {
			for (int j = 0; j < nums.length; j += 1) {
				if ((i != j) && (nums[i] + nums[j] == target)) {
					return new int[]{i,j};
				}
			}
		}
		return new int[0];
    }
}
