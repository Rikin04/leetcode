class Solution {
    public int romanToInt(String s) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] keys = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        for (int i = 0; i < values.length; i ++)
        	map.put(keys[i], values[i]);
        int x = 0, number = 0;
        while (x < s.length() - 1) {
        	String s1 = s.substring(x, x + 1);
        	if (map.get(s.substring(x, x + 1)) < map.get(s.substring(x + 1, x + 2))) {
        		s1 = s1 + s.substring(x + 1, x + 2);
        		x ++;
        	}
        	x ++;
        	number = number + map.get(s1);
        }
        if (x == s.length() - 1) 
        	number = number + map.get(s.substring(x));
        return number;
    }
}