package idv.hank.leetcode;

/**
 * 
 * @author hank_hao
 * @URL https://leetcode.com/problems/remove-nth-node-from-end-of-list/
 *
 */
public class RemoveNthNodeFromEndOfList {

	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode result = null;
		int length = getLength(head) - n;
		int index = 0;
		for (ListNode node = head; node != null; node = node.next) {
			if (index++ != length) {
				result = insert(new ListNode(node.val), result);
			}
		}
		if (result == null) {
			return null;
		} else {
			return revert(result);
		}
	}

	private ListNode insert(ListNode head, ListNode rest) {
		head.next = rest;
		return head;
	}

	private ListNode revert(ListNode head) {
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

	private int getLength(ListNode head) {
		int count = 0;
		for (ListNode node = head; node != null; node = node.next) {
			count++;
		}
		return count;
	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

}
