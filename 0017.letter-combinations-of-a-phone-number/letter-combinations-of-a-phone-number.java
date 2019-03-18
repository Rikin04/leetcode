class Solution {
    public List<String> letterCombinations(String digits) {
    	List<String> list = new ArrayList<String>();
    	if (digits.length() == 0)
    		return list;
    	if (digits.length() == 1 && (digits.equals("0") || digits.equals("1")))
    		return list;
    	String[] number = {" ","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    	if (digits.length() == 1) {
    		char[] chdi = number[Integer.parseInt(digits)].toCharArray();
    		for (char c : chdi) {
    			list.add(c + "");
    		}
    		return list;
    	}
    	int x = 1;
    	char[] chdi = digits.toCharArray();
    	list.add(number[Integer.parseInt(chdi[0] + "")].substring(0, 1));
    	list.add(number[Integer.parseInt(chdi[0] + "")].substring(1, 2));
    	list.add(number[Integer.parseInt(chdi[0] + "")].substring(2, 3));
    	if (Integer.parseInt(chdi[0] + "") == 9 || Integer.parseInt(chdi[0] + "") == 7)
    		list.add(number[Integer.parseInt(chdi[0] + "")].substring(3, 4));
    	while (x < chdi.length) {
    		ArrayList<String> l = new ArrayList<String>();
    		char[] ch = number[Integer.parseInt(chdi[x] + "")].toCharArray();
    		while (!list.isEmpty()) {
    			String s = list.get(0);
    			list.remove(0);
    			for (int i = 0; i < ch.length; i ++)
    				l.add(s + ch[i]);
    		}
    		list = (List<String>)l.clone();
    		++ x;
    	}
    	return list;
    }
}