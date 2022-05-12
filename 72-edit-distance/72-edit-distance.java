class Solution {    
    
//     public int minDistance(String s, String t) {
//       if(s.length() == 0 && t.length() == 0) {
//             return 0;
//         }  
//         if(s.length() == 0) {
//             return t.length();
//         } 
//         if(t.length() == 0) {
//             return s.length();
//         }
//         int myans;
//         if(s.charAt(0) == t.charAt(0)) {
//             myans = minDistance(s.substring(1),t.substring(1));
//         }else {
//             int ans1 = minDistance(s,t.substring(1));
//             int ans2 = minDistance(s.substring(1),t);
//             int ans3 = minDistance(s.substring(1),t.substring(1));
//             myans = 1 + Math.min(Math.min(ans1,ans2),ans3);
//         }
//         return myans;
          
//     }
    public int minDistance(String s, String t) {
        
         int m = s.length();
        int n = t.length();
        
        if(m == 0 && n == 0) {
            return m;
        } 
        if(m==0) {
            return n;
        }
        if(n == 0) {
            return m;
        }
        
                
        
        int[][] dp = new int[m+1][n+1];
        dp[0][0] = 0;
        
        for(int i = 1; i<dp.length;i++) {
            dp[i][0] = i;
        }
        
        for(int j = 1; j<dp[0].length;j++) {
            dp[0][j] = j;
        }
        
        for(int i = 1; i<dp.length;i++) {
            for(int j = 1 ; j<dp[0].length; j++) {
                if(s.charAt(m-i)==t.charAt(n-j))
               {
                   dp[i][j]=dp[i-1][j-1];
               }
               else{
                   dp[i][j]=1+Math.min(Math.min(dp[i-1][j],dp[i][j-1]),dp[i-1][j-1]);
               }
            }
        }
       
        
     
        
        return dp[m][n];
        
        
        
        
        
    }
}