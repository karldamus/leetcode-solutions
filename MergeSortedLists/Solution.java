package MergeSortedLists;

public class Solution {
	
	public static ListNode mergeKLists(ListNode[] lists) {
        if (lists == null) { return new ListNode(); } // base case

		ListNode returnList = new ListNode();

		// create one large list (loop through each list : lists)
		for (int i = 0; i < lists.length; i++) {
			ListNode tmpNode = lists[i];
			printList(tmpNode);
			
			while (tmpNode != null) {
				
				if (returnList == null) { 
					returnList = tmpNode; 
				} else {
					returnList.next = tmpNode;
				}
				
				tmpNode = tmpNode.next; // increase tmpNode
			}
		}

		return returnList;
    }

	public static void main(String[] args) {
		ListNode list1 = new ListNode(1, new ListNode(4, new ListNode(5)));
		ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
		ListNode list3 = new ListNode(2, new ListNode(6));

		ListNode[] lists = new ListNode[] {
			list1, list2, list3
		};

		// printList(mergeKLists(lists));
		mergeKLists(lists);

	}

	public static void printList(ListNode list) {
		ListNode tmp = list;
		while (tmp != null) {
			System.out.println(tmp.val);
			tmp = tmp.next;
		}
	}
}
