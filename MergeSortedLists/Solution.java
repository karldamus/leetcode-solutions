package MergeSortedLists;

import java.util.List;

/**
 * Solution to the Merge k Sorted Lists Problem
 * https://leetcode.com/problems/merge-k-sorted-lists/
 * 
 * @author Karl Damus
 * 
 * runtime: 
 */
public class Solution {
	
	public static ListNode mergeKLists(ListNode[] lists) {
        if (lists == null) { return null; } 		// base case: empty
		if (lists.length == 1) { return lists[0]; } // base case: 1 list (it's already sorted)

		ListNode returnList = new ListNode();

		// multiple lists
		int[] arr = new int[getLengthOfAllLists(lists)];

		for (int i = 0; i < lists.length; i++) {
			while (lists[i] != null) {
				
			}
		}

		return returnList;
    }

	public static int getLengthOfAllLists(ListNode[] lists) {
		int returnValue = 0;

		for (int i = 0; i < lists.length; i++) {
			while (lists[i] != null) {
				returnValue += 1;
				lists[i] = lists[i].next;
			}
		}

		return returnValue;
	}

	public static void main(String[] args) {
		ListNode list1 = new ListNode(1, new ListNode(4, new ListNode(5)));
		ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
		ListNode list3 = new ListNode(2, new ListNode(6));

		ListNode[] lists = new ListNode[] {
			list1, list2, list3
		};

		printList(mergeKLists(lists));
	}

	/**
	 * Helper function to print list
	 * @param list the list to be printed
	 */
	public static void printList(ListNode list) {
		ListNode tmp = list;
		while (tmp != null) {
			System.out.println(tmp.val);
			tmp = tmp.next;
		}
	}
}
