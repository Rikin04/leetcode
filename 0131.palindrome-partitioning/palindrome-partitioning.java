class Solution {
    public List<List<String>> partition(String s) {
        LinkedList<List<String>> list = new LinkedList<List<String>>();
        if (s == null || s.length() == 0)
            return list;
        part(list, new LinkedList<String>(), s);
        return list;
    }
    public void part(LinkedList<List<String>> list, LinkedList<String> l, String s) {
        if (s.length() == 0)
            list.add(new LinkedList<String>(l));
        else {
            for (int length = s.length(); length > 0; length --) {
                if (!isPalindrome(s.substring(0, length)))
                    continue;
                l.add(s.substring(0, length));
                part(list, l, s.substring(length));
                l.remove(l.size() - 1);
            }
        }
    }
    public boolean isPalindrome(String s) {
        if (s.length() <= 1)
            return true;
        int low = 0, high = s.length() - 1;
        while (low <= high) {
            if (s.charAt(low) != s.charAt(high))
                return false;
            low ++;
            high --;
        }
        return true;
    }
}