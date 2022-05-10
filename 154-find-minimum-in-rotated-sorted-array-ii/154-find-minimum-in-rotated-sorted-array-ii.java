class Solution {
    public int findMin(int[] nums) {
//         int n = nums.length;
//         int start = 0;
//         int end = n -1;
//         if(nums[start] <= nums[end]) {
//             return nums[start];
//         } 
        
//         int res = nums[0];
//         while(start <= end) {
//             int mid = start + (end - start) / 2;
//             int prev = (mid + n -1) % n;
//             int next = (mid + 1) % n;
//             if()
//         }
        
        Arrays.sort(nums);
        return nums[0];
    }
}