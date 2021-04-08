package PalindromeLinkedList;

/**
 * Solution to the Palindrome Linked List Problem
 * https://leetcode.com/explore/featured/card/april-leetcoding-challenge-2021/593/week-1-april-1st-april-7th/3693/
 * 
 * @author Karl Damus
 * 
 * runtime: 8ms (85 test cases)
 */

public class Solution {

	public static void printList(ListNode root) {
		ListNode tmp = root;
		while (tmp != null) {
			System.out.println(tmp.val);
			tmp = tmp.next;
		}
	}

	/**
	 * Check to see if the LinkedList is the same backwards and forwards
	 * @param head the head of the list
	 * @return true or false
	 */
	public static boolean isPalindrome(ListNode head) {
		int size = sizeOfList(head);
		int[] arrInOrder = new int[size];
		int[] arrInReverseOrder = new int[size];

		// create array in order
		ListNode tmp = head;
		for (int i = 0; i < size; i++) {
			arrInOrder[i] = tmp.val;

			tmp = tmp.next;
		}

		// create array in reverse order
		tmp = head;
		for (int i = size-1; i >= 0; i = i - 1) {
			arrInReverseOrder[i] = tmp.val;
			tmp = tmp.next;
		}

		// simple check to see if Reverse and InOrder arrays are the same for each value
		for (int i = 0; i < size; i++) {
			if (arrInOrder[i] != arrInReverseOrder[i]) {
				return false;
			}
		}

		return true;
    }

	/**
	 * Retrieve the size of a LinkedList
	 * @param head the head of the list (starting point)
	 * @return the number of items in the linked list (size); 0 if empty.
	 */
	public static int sizeOfList(ListNode head) {
		int size = 0;
		ListNode tmp = head;

		while (tmp != null) {
			size += 1;
			tmp = tmp.next;
		}

		return size;
	}

	/**
	 * Simple test
	 */
	public static void main(String[] args) {
		ListNode LN = new ListNode(1);				// list[0] = 1
		LN.next = new ListNode(2);					// list[1] = 2
		LN.next.next = new ListNode(2);				// list[2] = 2
		LN.next.next.next = new ListNode(1);		// list[3] = 1

		System.out.println(isPalindrome(LN)); 		// true (1,2,2,1 is a palindrome)
	}

}
