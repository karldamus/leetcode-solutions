package MedianOfTwoSortedArrays;

import java.util.Arrays;

/**
 * Solution to the Median Of Two Sorted Arrays Problem
 * https://leetcode.com/problems/median-of-two-sorted-arrays
 * 
 * @author Karl Damus
 * 
 * runtime: 14ms
 */
public class Solution {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergedArray = new int[nums1.length + nums2.length];

		// merge array
		for (int i = 0; i < nums1.length; i += 1) {
			mergedArray[i] = nums1[i];
		}
		int start = nums1.length;
		for (int i = 0; i < nums2.length; i += 1) {
			mergedArray[i + start] = nums2[i];
		}

		// sort array
		Arrays.sort(mergedArray);

		if (mergedArray.length % 2 == 0) {
			// even length
			return ((mergedArray[(mergedArray.length / 2) - 1] + mergedArray[mergedArray.length / 2]) / 2.0);
		} else {
			// odd length
			return mergedArray[Math.round(mergedArray.length / 2)];
		}
    }

	public static void main(String[] args) {
		int[] arr1 = new int[] {1, 2};
		int[] arr2 = new int[] {3, 4};

		System.out.println(findMedianSortedArrays(arr1, arr2));
	}
}
