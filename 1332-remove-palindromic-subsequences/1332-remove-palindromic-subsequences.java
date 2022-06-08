class Solution {
    public boolean isPalindrome(String string) {
        boolean flag = true;
        for(int i = 0; i < string.length()/2; i++){  
            if(string.charAt(i) != string.charAt(string.length()-i-1)){  
                flag = false;  
                break;  
            }  
        }
        return flag;
    }

    public int removePalindromeSub(String s) {
        if(isPalindrome(s)) {
            return 1; 
        } else return 2;
        
    }
}