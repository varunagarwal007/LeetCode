// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Solution obj = new Solution();
                    System.out.println(obj.longestPalinSubseq(s));
                }
                
        }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
     public String reverseString(String str) {
        String s = ""; 
        for (int i=0; i<str.length(); i++)
      {
        char ch= str.charAt(i); 
        s= ch+s; 
      }
        return s;
    }
    public int longestPalinSubseq(String S)
    {
         String a = S;
        String b = reverseString(S);
        int m = a.length();
        int n = b.length();
        int[][] dp = new int[m+1][n+1];
        
        for(int i = 0; i<m+1;i++) {
            for(int j = 0; j<n+1;j++) {
                if(i==0||j==0) {
                    dp[i][j] = 0;
                }
            }
        }
        
        for(int i = 1; i<m+1;i++) {
            for(int j =1; j<n+1;j++) {
                if(a.charAt(i-1) == b.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
                }
            }
        }
        
        
        
        // int i = m ; int j = n; String ans = ""
        
        return dp[m][n];
        
    }
}