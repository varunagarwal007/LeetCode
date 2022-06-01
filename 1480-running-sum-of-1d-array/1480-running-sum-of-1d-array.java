class Solution {
    public int[] runningSum(int[] nums) {
        int prevsum = nums[0];
        for(int i = 1; i<nums.length;i++) {
            nums[i] = nums[i] + prevsum;
            prevsum = nums[i];
        }
        return nums;
    }
}