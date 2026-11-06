class Solution {
public:
    int singleNumber(vector<int>& nums) {
        
        int currentNumber;
        unordered_map<int, int> map;
        for (int i = 0; i < nums.size(); i++) {
            if (!(map[nums[i]])) {
                map[nums[i]] = 1;
                
            } else {
                map[nums[i]]++;
            }
        }

        for (int i = 0; i < nums.size(); i++) {
            if (map[nums[i]] == 1) {
                return nums[i];
            }
        }
        return 0;
    }
};
