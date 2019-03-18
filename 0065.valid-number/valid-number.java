class Solution {
    public boolean isNumber(String s) {
        s = s.trim();
        if (s.length() == 0)
        	return false;
        int i = 0;
        for (;i < s.length(); i ++)
            if (Character.isDigit(s.charAt(i)))
                break;
        if (i == s.length())
            return false;
        boolean decimalPoint = false,e = false;
        int length = 0;
        while (length != s.length()){
        	if (Character.isDigit(s.charAt(length)));
        	else{
        		if (s.charAt(length) == '.' && decimalPoint == false && s.length() != 1){
        			if (e == true)
        				return false;
        			if (length != s.length() - 1){
        				if (s.charAt(length + 1) == '.')
        					return false;
        			}
                    if (length != s.length() - 1)
                        if (s.charAt(length + 1) == '-' || s.charAt(length + 1) == '+')
                            return false;
        			decimalPoint = true;
        		}
        		else if (s.charAt(length) == 'e' && length > 0  && length != s.length() - 1 ){
                    if (e == true)
        				return false;
                    if (length - 1 == 0 && s.charAt(length - 1) == '.')
                    	return false;
                    if (s.charAt(length + 1) == 'e')
        				return false;
        			e = true;
        		}
        		else if ((s.charAt(length) == '-' || s.charAt(length) == '+')){
                    if (length != 0 && s.charAt(length - 1) != 'e')
        				return false;
                    if (length == s.length() - 1 || s.charAt(length + 1) == ' ')
        				return false;
                    if (length != s.length() - 1 )
                        if (s.charAt(length + 1)== 'e')
                            return false;
                    if (length != s.length() - 1 )
                        if ((s.charAt(length + 1) == '-' || s.charAt(length + 1) == '+' ||s.charAt(length + 1) == '.') && length != 0)
                            return false;
        		}
        		else
        			break;
        	}
        	++ length;
        }
        if (length != s.length())
        	return false;
        return true;
    }
}