class Solution {
    public String reverse(String orig)
{
    char[] s = orig.toCharArray();
    int n = s.length;
    int halfLength = n / 2;
    for (int i=0; i<halfLength; i++)
    {
        char temp = s[i];
        s[i] = s[n-1-i];
        s[n-1-i] = temp;
    }
    return new String(s);
}
    public int minInsertions(String s) {
        String a = s;
        String b = reverse(s);
        int m = a.length();
        int n = b.length();
        
        int[][] dp = new int[m+1][n+1];
        for(int i = 1;i<m+1;i++) {
            for(int j = 1;j<n+1;j++) {
                if(a.charAt(i-1) == b.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1] +1;
                } else {
                    dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        int lps = dp[m][n];
        int ans = m - lps;
        return ans;
    }
}