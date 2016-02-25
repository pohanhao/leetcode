package idv.hank.leetcode;

/**
 * 
 * @author hank_hao
 * @URL https://leetcode.com/problems/rotate-list/
 *
 */
public class RotateList {

	public ListNode rotateRight(ListNode head, int k) {
		if (head == null || head.next == null) {
			return head;
		}

		int length = getLength(head);
		while (k >= length) {
			k %= length;
		}

		ListNode result = head;
		for (int i = 0; i < k; i++) {
			result = shift(result);
		}
		return result;
	}

	private ListNode shift(ListNode head) {
		ListNode result = null;
		for (ListNode current = head; current != null; current = current.next) {
			if (current.next == null) {
				result = insertHead(new ListNode(current.val), result);
			} else {
				result = insert(result, new ListNode(current.val));
			}
		}
		return result;
	}

	private ListNode insertHead(ListNode head, ListNode rest) {
		head.next = rest;
		return head;
	}

	private ListNode insert(ListNode result, ListNode target) {
		if (result == null) {
			return new ListNode(target.val);
		}
		for (ListNode current = result; current != null; current = current.next) {
			if (current.next == null) {
				current.next = target;
				break;
			}
		}
		return result;
	}

	private int getLength(ListNode node) {
		int length = 0;
		while (node != null) {
			node = node.next;
			length++;
		}
		return length;
	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

}
