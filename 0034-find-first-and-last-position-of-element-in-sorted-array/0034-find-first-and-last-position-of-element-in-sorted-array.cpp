class Solution {
    private: int lastPosition(vector<int> nums,int target) {
        int start = 0;
        int end = nums.size() -1;
        int pos = -1;
        while(start <= end) {
            int mid = end + (start - end)/ 2;
            if(nums[mid] == target) {
                pos = mid;
                start = mid+1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return pos;
    }
    private:  int firstPosition(vector<int> nums,int target) {
        int start = 0;
        int end = nums.size() -1;
        int pos = -1;
        while(start <= end) {
            int mid = end + (start - end)/ 2;
            if(nums[mid] == target) {
                pos = mid;
                end = mid-1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return pos;
    }
public:
    vector<int> searchRange(vector<int>& nums, int target) {
        vector<int> ans(2);
        ans[0] = firstPosition(nums,target);
        ans[1] = lastPosition(nums,target);
        return ans;
    }
};