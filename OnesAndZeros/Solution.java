package OnesAndZeros;

/**
 * Solution to the Ones and Zeroes Problem
 * https://leetcode.com/explore/challenge/card/april-leetcoding-challenge-2021/593/week-1-april-1st-april-7th/3694/
 * 
 * You are given an array of binary strings strs and two integers m and n.
 * Return the size of the largest subset of strs such that there are at most m 0's and n 1's in the subset.
 * A set x is a subset of a set y if all elements of x are also elements of y.
 * 
 * @author Karl Damus
 */
public class Solution {
	
	public static int findMaxForm(String[] strings, int m, int n) {
		


		return -1;
	}

	public static char[] arrOfChars(String string) {
		char[] returnArr = new char[string.length()];

		for (int i = 0; i < string.length(); i++) {
			returnArr[i] = string.charAt(i);
		}

		return returnArr;
	}

	public static void main(String[] args) {
		String[] strings = new String[] { "10","0001","111001","1","0" };
		int m = 5;
		int n = 3;

		System.out.println(findMaxForm(strings, m , n));
	}

}
