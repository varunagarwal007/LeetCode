class Solution {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length -1;
        int n = nums.length;
        int res = nums[0];
        while(start <= end) {
            if(nums[start] <= nums[end]) {
                res = nums[start];
                break;
            } 
            int mid = start + (end - start) / 2;
            int prev = (mid + n -1) % n;
            int next = (mid + 1) % n;
            if(nums[mid]<= nums[prev] && nums[mid] <= nums[next]){
                res = nums[mid];
                break;
            }
            else if(nums[mid] >= nums[start]){
                start = mid+1;
            }
            else {
                end= mid-1;
            }
        }
        return res;
    }
}