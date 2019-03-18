/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null)
        	return l2;
        else if (l2 == null)
        	return l1;
        ListNode l3 = null;
        ListNode l = l3;
        while (l1 != null && l2 != null) {
        	if (l1.val <= l2.val) {
        		if (l3 == null) {
        			l3 = new ListNode(l1.val);
                    l = l3;
        			l1 = l1.next;
        		}
        		else {
        			l3.next = l1;
        			l1 = l1.next;
        			l3 = l3.next;
        		}
        	}
        	else {
        		if (l3 == null) {
        			l3 = new ListNode(l2.val);
                    l = l3;
        			l2 = l2.next;
        		}
        		else {
        			l3.next = l2;
        			l2 = l2.next;
        			l3 = l3.next;
        		}
        	}
        }
        if (l1 == null)
        	l3.next = l2;
        else if (l2 == null)
        	l3.next = l1;
        return l;
    }
}