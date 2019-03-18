class Solution {
   public ListNode mergeKLists(ListNode[] lists) {
       HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
       ListNode l = null;
       if (lists.length == 0) return l;
       int min = 0, max = 0;
       int m = 0;
       for (ListNode list: lists) {
    	   if (list != null) {
    		   min = list.val;
    		   max = list.val;
    		   break;
    	   }
    	   m ++;
    	   if (m == lists.length)
    		   return l;
       }
       for (ListNode list : lists) {
    	   while (list != null) {
    		   if (list.val < min)
    			   min = list.val;
    		   if (list.val > max)
    			   max = list.val;
    		   if (map.containsKey(list.val)) {
    			   int n = map.get(list.val) + 1;
    			   map.put(list.val, n);
    		   }
    		   else
    			   map.put(list.val, 1);
    		   list = list.next;
    	   }
       }
       ListNode l1 = l;
       while (min <= max) {
    	   int count = 0;
    	   if (map.containsKey(min))
    		   count = map.get(min);
    	   while (count != 0) {
    		   if (l == null) {
    			   l = new ListNode(min);
    			   l1 = l;
    		   }
    		   else {
    			   l.next = new ListNode(min);
    			   l = l.next;
    		   }
    		   -- count;
    	   }
    	   ++ min;
       }
       return l1;
   }
}