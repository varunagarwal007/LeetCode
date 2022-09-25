class Solution {
      private:
    vector<int> nextSmallerElement(vector<int> arr, int n) 
    { 
        
       vector<int> ans(n);
       stack<int> s;
       s.push(-1);
       for(int i = n-1 ; i>= 0; i--) {
           int curr = arr[i];
           while(s.top() != -1 && arr[s.top()] >= curr) {
               s.pop();
           }
           ans[i] = s.top();
           s.push(i);
       }
       return ans;
    } 
    vector<int> prevSmallerElement(vector<int> arr,int n) {
    vector<int> ans(n);
    stack<int> stack;
    stack.push(-1);
    for(int i = 0; i<n; i++) {
        int curr = arr[i];
        while(stack.top() != -1 && arr[stack.top()] >= curr) {
            stack.pop();
        } 
        ans[i] =  stack.top();
        stack.push(i);
    }
    return ans;
}
public:
    int largestRectangleArea(vector<int>& heights) {
        if(heights.size() <= 1) {
            return heights[0];
        }
        int n = heights.size();
        vector<int> next(n);
        next = nextSmallerElement(heights,n);
        vector<int> prev(n);
        prev = prevSmallerElement(heights,n);
        int area = INT_MIN;
        for(int i = 0; i<n; i++) {
            int l = heights[i];
            if(next[i] == -1) {
                next[i] = n;
            }
            int b = next[i] - prev[i] -1;
            int tempArea = l * b;
            area = max(area, tempArea);
        }
        return area;
        
    }
};