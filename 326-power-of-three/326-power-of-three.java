class Solution {
    public boolean isPowerOfThree(int n) {
        
        
        while(n %3 == 0) {
            if(n==0) return false;
            n = n /3;
        }
    
    return n==1 || n==3;
    }
    
}