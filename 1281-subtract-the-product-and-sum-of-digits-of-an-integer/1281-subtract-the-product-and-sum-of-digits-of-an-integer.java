class Solution {
    public int product(int n) {
        int product = 1;
        while(n>0) {
            product = product * (n % 10);
            n = n / 10;
        }
        return product;
    }
    
    public int sum(int n) {
        int sum = 0;
        while(n>0) {
            sum = sum + (n % 10);
            n = n/ 10;
        }
        return sum;
    }
    
    public int subtractProductAndSum(int n) {
        return product(n) - sum(n);
    }
}