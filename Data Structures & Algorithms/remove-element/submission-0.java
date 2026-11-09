class Solution {
    public int removeElement(int[] nums, int val) {
        int[] newArray = new int[nums.length];

        int notEqualTo = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[notEqualTo] = nums[i];
                notEqualTo++;
            } 
        }

        return notEqualTo;

    }
}