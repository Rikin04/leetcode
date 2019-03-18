class Solution {
   public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       int c = 0;
       ListNode l3 = new ListNode(0);
       ListNode l = l3;
       while (l1 != null || l2 != null) {
    	   if (l1 != null && l2 != null) {
    		   int sum = l1.val + l2.val + c;
    		   c = sum / 10;
    		   sum  = sum % 10;
    		   ListNode n = new ListNode(sum);
    		   l.next = n;
        	   l1 = l1.next;
        	   l2 = l2.next;
    	   }
    	   else if (l1 == null) {
    		   int sum = 0 + l2.val + c;
    		   c = sum / 10;
    		   sum  = sum % 10;
    		   ListNode n = new ListNode(sum);
    		   l.next = n;
    		   l2 = l2.next;
    	   }
    	   else {
    		   int sum = 0 + l1.val + c;
    		   c = sum / 10;
    		   sum  = sum % 10;
    		   ListNode n = new ListNode(sum);
    		   l.next = n;
    		   l1 = l1.next;
    	   }
    	   l = l.next;
       }
       if (c != 0) {
    	   ListNode p = l3;
    	   while (p.next != null)
    		   p = p.next;
    	   ListNode q = new ListNode(c);
    	   p.next = q;
       }
       l3 = l3.next;
       return l3;
   }
}