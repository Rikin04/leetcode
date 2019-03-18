/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int end = 0;
        ListNode p = head;
        while (p != null) {
            ++ end;
            p = p.next;
        }
        if (end < n)
            return head;
        if (end == 1 && n == 1)
        {
            head = head.next;
            return head;
        }
        if (end == n) {
            head = head.next;
            return head;
        }
        int begin = 0;
        p = head;
        while (p != null) {
            ++ begin;
            if (end - begin == n) {
                p.next = p.next.next;
                break;
            }
            p = p.next;
        }
        return head;
    }
}