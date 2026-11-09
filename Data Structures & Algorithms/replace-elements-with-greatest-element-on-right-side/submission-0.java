class Solution {
    public int[] replaceElements(int[] arr) {
        
        if (arr.length == 1) {
            arr[0] = -1;
            return arr;
        } 
        
        int current;
        for (int i = 0; i < arr.length; i++) {
            current = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (current < arr[j]) {
                    current = arr[j];
                }
               
            }
            arr[i] = current; 
        }

        arr[arr.length-1] = -1;

        return arr;

    }
}