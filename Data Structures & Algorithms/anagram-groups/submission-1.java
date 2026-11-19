class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        

        // Hash map will store the sorted 
        HashMap<String,List<String>> map = new HashMap<>();
        



        String currentString;
        for (int i = 0; i < strs.length; i++) {
            currentString = returnSortedString(strs[i]);
            if (!map.containsKey(currentString)) {
                map.put(currentString, new ArrayList<>());
                map.get(currentString).add(strs[i]);
            } else {
                map.get(currentString).add(strs[i]);
            } 
        }

        
        List<List<String>> results = new ArrayList<>(map.values());
        return (results);


        
    }


















    static String returnSortedString(String string) {

        char[] currentChar = string.toCharArray();

        Arrays.sort(currentChar);

        return String.valueOf(currentChar);

    }
}
