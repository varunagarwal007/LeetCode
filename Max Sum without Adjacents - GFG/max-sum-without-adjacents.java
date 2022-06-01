// { Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().findMaxSum(arr, n);
            System.out.println(ans);
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    int findMaxSumHelper(int[] arr, int index,int[] dp) {
        if(index == 0) {
            return arr[index];
        }
        if(index < 0) {
            return 0;
        }
        int ans1, ans2;
        if(dp[index] != -1) return dp[index];
        ans1 = arr[index] + findMaxSumHelper(arr,index-2,dp);
        ans2 = findMaxSumHelper(arr,index-1,dp);
        dp[index] =  Math.max(ans1,ans2);
        return dp[index];
    }
    int findMaxSum(int arr[], int n) {
        int[] dp = new int[n];
        for(int i = 0 ; i<n;i++) {
            dp[i] = -1;
        }
        
        return findMaxSumHelper(arr,n-1,dp);
    }
}