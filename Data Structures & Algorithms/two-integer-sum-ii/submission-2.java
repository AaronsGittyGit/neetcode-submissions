class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int index1, index2, total;
        int[] array = new int[2];
        
        
        index1 = 0;
        index2 = numbers.length - 1;
       

       while (index1 < index2) {
        
        total = numbers[index1] + numbers[index2];

        if (total < target) {
            index1++;
        } else if (total > target){
            index2--;
        } else if (total == target) {
            break;
        }
        
       }

       array[0] = index1 + 1;
       array[1] = index2 + 1;

       return array;
    }
}
