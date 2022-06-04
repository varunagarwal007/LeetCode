// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String input_line[] = in.readLine().trim().split("\\s+");
            int arr[]= new int[N];
            for(int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.matrixMultiplication(N, arr));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int[][] dp = new int[100][100];
    
 
    static int MatrixChainOrder(int[] p, int i, int j,int[][] dp) {
       
        if (i == j)
           { return 0;}
           if(dp[i][j] != -1) {
               return dp[i][j];
           }
 
        dp[i][j] = Integer.MAX_VALUE;
        for (int k = i; k < j; k++)
        {
           dp[i][j] = Math.min(MatrixChainOrder(p, i, k,dp)
                        + MatrixChainOrder(p, k + 1, j,dp)
                        + p[i - 1] * p[k] * p[j],dp[i][j]);
 
            
        }
 
        // Return minimum count
        return dp[i][j];    
        
    }
    static int matrixMultiplication(int N, int arr[])
    {
        for (int[] row : dp)
      Arrays.fill(row, -1);
        return MatrixChainOrder(arr,1,arr.length-1,dp);
    }
}