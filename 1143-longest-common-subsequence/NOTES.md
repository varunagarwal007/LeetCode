int ans1, ans2;
if(dp[i][j+1] == -1) {
ans1 =longestCommonSubsequence(s,t,i,j+1,dp);
dp[i][j+1] = ans1;
} else {
ans1 = dp[i][j+1];
}
if(dp[i+1][j] == -1) {
ans2 =longestCommonSubsequence(s,t,i+1,j,dp);
dp[i+1][j] = ans2;
} else {
ans2 = dp[i+1][j];
}
myans = Math.max(ans1,ans2);
}
return myans
}
public int longestCommonSubsequence(String s, String t) {
// return longestCommonSubsequence(s,t,0,0);
int[][] dp = new int[s.length() + 1][t.length() + 1];
for(int i = 0 ; i<dp.length; i++) {
for(int j = 0 ; j<dp[0].length; j++) {
dp[i][j] = -1;
}
}
return longestCommonSubsequence(s,t,0,0,dp);
}
```