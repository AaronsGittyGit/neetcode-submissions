class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // Track the frequent elements in a hashmap 
        /* Then use a for-loop from K to print the "K" 
            most frequent elements in an array
        */

        HashMap<Integer,Integer> map = new HashMap<>();
        

        for (int i = 0 ; i < nums.length; i++) {
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

                
        }

        ArrayList<Integer> list = new ArrayList<>(map.keySet());
        list.sort((a,b) -> Integer.compare(map.get(b), map.get(a)));
        

       
        int[] storeK = new int[k];
        for (int i = 0; i < storeK.length; i++) {
        
            storeK[i] = list.get(i);
        }

        return storeK;

    }
}
