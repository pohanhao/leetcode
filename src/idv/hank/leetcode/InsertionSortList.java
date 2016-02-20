package idv.hank.leetcode;

/**
 * 
 * @author hank_hao
 * @URL https://leetcode.com/problems/Insertion-Sort-List/
 * 
 */
public class InsertionSortList {

	public ListNode insertionSortList(ListNode head) {
		ListNode result = new ListNode(Integer.MIN_VALUE);
		for (ListNode node = head; node != null; node = node.next) {
			insert(result, new ListNode(node.val));
		}
		return result.next;
	}

	private void insert(ListNode result, ListNode target) {
		for (ListNode current = result; current != null; current = current.next) {
			if(current.next == null) {
				current.next = target;
				break;
			}
			if (current.next.val > target.val) {
				target.next = current.next;
				current.next = target;
				break;
			}
		}
	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

}
