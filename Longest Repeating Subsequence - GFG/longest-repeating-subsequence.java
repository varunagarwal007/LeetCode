// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String str = br.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.LongestRepeatingSubsequence(str);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int LongestRepeatingSubsequence(String str)
    {
        String a = str;
        String b = str;
        int m = a.length();
        int n = b.length();
        int[][] dp = new int[m+1][n+1];
        for(int i = 0 ; i<m+1;i++) {
            for(int j = 0 ;j<n+1;j++) {
                if(i == 0 || j == 0) {
                    dp[i][j] = 0;
                }
            }
        }
        
        
        
        for(int i =1; i<m+1;i++) {
            for(int j =1;j<n+1;j++) {
                if(a.charAt(i-1) == b.charAt(j-1) && i != j ) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
        
        
        
        
        
        
        
        
        
        
     }
}