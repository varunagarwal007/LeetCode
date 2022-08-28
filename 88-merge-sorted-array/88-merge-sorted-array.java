class Solution {
    public void merge(int[] a, int m, int[] b, int n) {
        int i = 0,j = 0,k= 0;;
        int[] ans = new int[m+n];
        while(i<m && j<n) {
            if(a[i] < b[j]) {
             ans[k] = a[i];
                k++;
                i++;
            } else {
                ans[k] = b[j];
                k++;
                j++;
            }
        }
        
        
        while(i<m) {
            ans[k] = a[i];
            k++;
            i++;
        }
        while(j<n) {
            ans[k] = b[j];
            k++;
            j++;
        }
        k=0;
        while(k<(m+n)) {
            a[k] = ans[k];
            k++;
        }
        
        
    }
}