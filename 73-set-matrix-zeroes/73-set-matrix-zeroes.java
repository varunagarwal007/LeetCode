class Solution {
    public void setZeroes(int[][] matrix) {
       int[] row = new int[matrix[0].length];
        int[] column = new int[matrix.length];
        Arrays.fill(row,-1);
        Arrays.fill(column,-1);
        for(int i = 0;i<matrix.length;i++) {
            for(int j = 0;j<matrix[0].length;j++) {
                if(matrix[i][j] == 0) {
                    row[j] = 0;
                    column[i] = 0;
                }
            }
        }
        
        for(int i = 0; i<matrix.length;i++) {
            for(int j = 0;j<matrix[0].length;j++) {
                if(row[j] == 0 || column[i] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
        
        
        
    }
}