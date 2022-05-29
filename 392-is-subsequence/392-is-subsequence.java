class Solution {
//     public boolean isSubsequence(String s, String t) {
       
//         if(s.length() == 0) {
//             return true;
//         }
//          if(t.length() == 0) {
//             return false;
//         }
//         if(t.charAt(0) == s.charAt(0) ) {
//             s = s.substring(1);
//             t = t.substring(1);
//         } else {
//             t = t.substring(1);
//         }
//         boolean ans = isSubsequence(s,t);
//         return ans;
        
//     }
      public boolean isSubsequence(String a, String b) {
         int s = a.length();
         int t = b.length();
          int[][] dp = new int[s + 1][t + 1];
          for(int i = 1; i<s+1;i++) {
              for(int j = 1;j<t+1;j++) {
                  if(a.charAt(i-1) == b.charAt(j-1)) {
                      dp[i][j] = dp[i-1][j-1] + 1;
                  } else {
                      dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]);
                  }
              }
          }
          if(dp[s][t] == s) {
              return true;
          } else return false;
          
        
    }
}