package idv.hank.leetcode;

/**
 * 
 * @author hank_hao
 * @URL https://leetcode.com/problems/reverse-linked-list/
 *
 */
public class ReverseLinkedList {

	public ListNode reverseList(ListNode head) {
		ListNode revertNode = new ListNode(0);
		for (ListNode node = head; node != null; node = node.next) {
			if (revertNode.next != null) {
				ListNode tmp = new ListNode(node.val);
				tmp.next = revertNode.next;
				revertNode.next = tmp;
			} else {
				revertNode.next = new ListNode(node.val);
			}
		}
		return revertNode.next;
	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

}
