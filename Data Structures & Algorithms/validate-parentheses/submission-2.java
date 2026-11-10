class Solution {
    public boolean isValid(String s) {
        
       Deque<Character> stack = new ArrayDeque<>();
       
       char currentChar;
       boolean valid = true;
       for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
                valid = false;
            } 
            
            else if (s.charAt(i) == ')') {

                if (stack.isEmpty()) {
                    return false;
                } else {
                   currentChar = stack.pop(); 
                }
                
                if (currentChar != '(') {
                    valid = false;
                    break;
                } else {valid = true;}

            } 
            
            else if (s.charAt(i) == ']') {
                if (stack.isEmpty()) {
                    return false;
                } else {
                   currentChar = stack.pop(); 
                }
                if (currentChar != '[') {
                    valid = false;
                    break;
                } else {valid = true;}
            } 
            
            else if (s.charAt(i) == '}') {
                if (stack.isEmpty()) {
                    return false;
                } else {
                   currentChar = stack.pop(); 
                }
                if (currentChar != '{') {
                    valid = false;
                    break;
                } else {valid = true;}
            }

       }

       if (!stack.isEmpty()) {
        valid = false;
       }

       return valid;


    }
}
