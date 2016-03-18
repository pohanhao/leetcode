package idv.hank.leetcode;

/**
 * 
 * @author hank_hao
 * @URL https://leetcode.com/problems/remove-linked-list-elements/
 *
 */
public class RemoveLinkedListElements {

	public ListNode removeElements(ListNode head, int val) {
		if (head == null) {
			return null;
		}
		ListNode result = new ListNode(0);
		for (ListNode node = head; node != null; node = node.next) {
			if (node.val != val) {
				insert(result, node.val);
			}
		}
		return reverseList(result.next);
	}

	private void insert(ListNode head, int value) {
		ListNode node = new ListNode(value);
		node.next = head.next;
		head.next = node;
	}

	private ListNode reverseList(ListNode head) {
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
