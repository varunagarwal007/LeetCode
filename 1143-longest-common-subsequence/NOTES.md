**APPROACH-1: Using Recursion**
```
class Solution {
public int longestCommonSubsequence(String s,String t, int i , int j) {
if(i == s.length() || j== t.length()) {
return 0;
}
int myans;
if(s.charAt(i) == t.charAt(j)) {
myans =1+ longestCommonSubsequence(s,t,i+1,j+1);
} else {
int ans1 = longestCommonSubsequence(s,t,i,j+1);
int ans2 = longestCommonSubsequence(s,t,i+1,j);
myans = Math.max(ans1,ans2);
}
return myans;
}
public int longestCommonSubsequence(String s, String t) {
return longestCommonSubsequence(s,t,0,0);
}
}
```
**APPROACH-2:Using Memoization**
​