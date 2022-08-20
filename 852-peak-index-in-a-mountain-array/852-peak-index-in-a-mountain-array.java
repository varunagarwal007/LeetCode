class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int si = 0;
        int ei = arr.length-1;
        int mid = si + (ei - si)/2;
        while(si<ei) {
            if(arr[mid] < arr[mid+1]) {
                si = mid + 1;
            } else {
                ei  =  mid;
            }
            mid = si + (ei - si)/2;
        }
        return si;
    }
}