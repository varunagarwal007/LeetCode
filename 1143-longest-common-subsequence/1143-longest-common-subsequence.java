class Solution {
//     public int longestCommonSubsequence(String s,String t, int i , int j) {
//         if(i == s.length() || j== t.length()) {
//             return 0;
//         }
//         int myans;
//         if(s.charAt(i) == t.charAt(j)) {
//             myans =1+ longestCommonSubsequence(s,t,i+1,j+1);
//         } else {
//             int ans1 = longestCommonSubsequence(s,t,i,j+1);
//             int ans2 = longestCommonSubsequence(s,t,i+1,j);
//             myans = Math.max(ans1,ans2);
            
//         }
//         return myans;
//     }
    
//     public int longestCommonSubsequence(String s, String t, int i , int j , int[][] dp) {
//         if(i == s.length() || j== t.length()) {
//             return 0;
//         }
//         int myans;
//         if(s.charAt(i) == t.charAt(j)) {
//             int smallans;
//             if(dp[i+1][j+1] == -1) {
//                 smallans = longestCommonSubsequence(s,t,i+1,j+1,dp);
//                 dp[i+1][j+1] = smallans;
//             } else {
//                 smallans = dp[i+1][j+1];
//             }
//             myans = 1 + smallans;
//         } else {
//             int ans1, ans2;
//             if(dp[i][j+1] == -1) {
//                 ans1 =longestCommonSubsequence(s,t,i,j+1,dp);
//                 dp[i][j+1] = ans1;
//             } else {
//                 ans1 = dp[i][j+1];
//             }
//             if(dp[i+1][j] == -1) {
//                 ans2 =longestCommonSubsequence(s,t,i+1,j,dp);
//                 dp[i+1][j] = ans2;
//             } else {
//                 ans2 = dp[i+1][j];
//             } 
//             myans = Math.max(ans1,ans2);        
//         }
//     return myans  
//     }
    
    public int longestCommonSubsequence(String s , String t) {
        int m = s.length();
        int n = t.length();
        int[][] dp = new int[m+1][n+1];
        
        for(int i = m-1; i>=0; i--) {
            for(int j = n-1; j>=0 ; j--) {
                int ans;
                if(s.charAt(i) == t.charAt(j)) {
                    ans = 1 + dp[i+1][j+1];
                } else {
                    int ans1 =dp[i][j+1];
                    int ans2 = dp[i+1][j];
                    ans = Math.max(ans1,ans2);
                }
                dp[i][j] = ans;
            }
        }
       return dp[0][0];
        
    }
    
    
//     public int longestCommonSubsequence(String s, String t) {
//         // return longestCommonSubsequence(s,t,0,0);
        
//         int[][] dp = new int[s.length() + 1][t.length() + 1];
//         for(int i = 0 ; i<dp.length; i++) {
//             for(int j = 0 ; j<dp[0].length; j++) {
//                 dp[i][j] = -1;
//             }
//         }
//         return longestCommonSubsequence(s,t,0,0,dp);
//     }
}