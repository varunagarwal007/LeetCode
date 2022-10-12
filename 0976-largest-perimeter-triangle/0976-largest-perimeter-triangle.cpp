class Solution {
public:
    int largestPerimeter(vector<int>& nums) {
         sort(nums.begin(), nums.end());
        
        int i = nums.size()-1;
		
		//Traverse From back so that we get largest perimeter of valid Triangle
        while(i>=2)
        {
		// s1 Will Be Largest Side
            int s1 = nums[i];
            int s2 = nums[i-1];
            int s3 = nums[i-2];
           
		   // Apply Triangle Side i.e. Sum of Smaller Two Sides is greater Than Largest Side
            if(s1 < s3 + s2)
                return s1 + s2 +s3;
            i--;
        }
        return 0;
    }
};