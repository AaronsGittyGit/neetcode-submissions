class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        
        int num1, num2;
        int total;

        vector<int> pair;
        
        for (int i = 0; i < nums.size(); i++) {
            num1 = nums[i];
            for (int j = i + 1; j < nums.size(); j++) {
                num2 = nums[j];
                total = num1 + num2;

                if (total == target) {
                    pair.push_back(i);
                    pair.push_back(j);
                    break;
                }

            }
        }

        return pair;

    }
};
