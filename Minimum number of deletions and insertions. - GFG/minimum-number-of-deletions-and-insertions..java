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
                    String s1 = sc.next();
                    String s2 = sc.next();
                    Solution ob = new Solution();
                    System.out.println(ob.minOperations(s1,s2));
                }
        }
}    // } Driver Code Ends


//User function Template for Java

class Solution
{
	public int minOperations(String s, String t) 
	{ 
	    int m  = s.length();
	    int n = t.length();
	    int[][] dp = new int[m+1][n+1];
	    for(int i = 0 ; i<m+1; i++) {
	        for(int j = 0 ; j<n+1;j++) {
	            if(i == 0 || j == 0) {
	                dp[i][j] = 0;
	            } 
	        }
	    }
	    
	    for(int i = 1; i<m+1;i++) {
	        for(int j = 1;j<n+1;j++) {
	            if(s.charAt(i-1) == t.charAt(j-1)) {
	                dp[i][j] = 1 + dp[i-1][j-1];
	            } else {
	                dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
	            }
	        }
	    }
	    
	    
	    int len = dp[m][n];
	    int insertion = n - len;
	    int deletions = m - len;
	    return insertion + deletions;
	    
	    
	    
	    
	    
	    
	    
	} 
}