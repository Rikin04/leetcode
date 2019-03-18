class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
    	if (head == null || k <= 1)
    		return head;
        ListNode p = head;
        ListNode q = p.next;
        ListNode t = head;
        ListNode h = head;
        ListNode n = head;
        int judge = 0;
        while (true) {
        	int i = 0;
        	while (i < k) {
        		if (t == null)
        			return h;
        		t = t.next;
        		++ i;
        	}
        	while (q != t) {
        		p.next = q.next;
        		q.next = head;
        		head = q;
        		q = p.next;
        	}
        	if (judge == 0)
        		h = head;
        	if (judge == 1)
        		n.next = head;
        	head = q;
        	n = p;
        	p = q;
            if (p != null)
        	    q = q.next;
        	judge = 1;
        }
    }
}