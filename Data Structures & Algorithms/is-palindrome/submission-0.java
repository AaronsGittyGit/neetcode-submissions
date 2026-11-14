class Solution {
    public boolean isPalindrome(String s) {

        String newString;
        
            newString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
         
        
        int length = newString.length();
        String firstBlock, secondBlock;


        if (length <= 1) {
            return true;
        }

        boolean valid = false;

        for (int i = 0; i < length/2; i++) {
            firstBlock = String.valueOf(newString.charAt(i));
            secondBlock = String.valueOf(newString.charAt(length - 1 - i));
            if (firstBlock.equalsIgnoreCase(secondBlock)) {
                valid = true;
            } else {
                valid = false;
                break;
            }
        }


        return valid;

    }
}
