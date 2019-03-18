class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (words.length == 0 || s.length() < words.length * words[0].length())
        	return list;
        HashMap<String, Integer> mapWords = new HashMap<String, Integer>();
        for (String s1 : words) {
        	mapWords.put(s1, mapWords.getOrDefault(s1, 0) + 1);
        }
        HashMap<String, Integer> mapS1 = new HashMap<String, Integer>();
        int index = 0, wordLength = words[0].length(), num = (words.length * wordLength);
        while (index +num <= s.length()) {
        	int begin = index;
            String s2 = s.substring(begin, begin + wordLength);
        	while (mapWords.containsKey(s2)) {
        		mapS1.put(s2, mapS1.getOrDefault(s2, 0) + 1);
        		if (mapWords.get(s2) < mapS1.get(s2))        		
        			break;
        		begin = begin + wordLength;
                if (begin + wordLength <= index +num)
                    s2 = s.substring(begin, begin + wordLength);
                else
                    break;
        	}
    		if (mapWords.equals(mapS1))
    			list.add(index);
        	++ index;
        	mapS1.clear();
        }
        return list;
    }
}