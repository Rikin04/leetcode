/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null)
        	return head;
        ListNode p = head;
        ListNode q = p.next;
        ListNode t = null;
        while (p != null && q != null) {
        	p.next = q.next;
        	q.next = p;
        	if (q.next == head) {
        		head = q;
        	}
        	else 
        		t.next = q;
    		t = p;
        	p = p.next;
        	if (p != null)
        		q = p.next;
        }
        return head;
    }
}