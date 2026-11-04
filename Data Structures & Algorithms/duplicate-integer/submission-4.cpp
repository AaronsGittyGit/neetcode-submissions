class Solution {
public:
    bool hasDuplicate(vector<int>& nums) {
        
        int currentValue;
        int comparedValue;
        for (int i = 0; i < nums.size(); i++){
            currentValue = nums[i];
            for (int j = i + 1; j < nums.size(); j++){
                comparedValue = nums[j];
                if (currentValue == comparedValue){
                    return true;
                }
            }
        }

        return false;
    }
};