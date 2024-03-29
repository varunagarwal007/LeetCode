**APPROACH-1**
Time Complexity: O(NxM + NxM)
Space Complexity: O(N) + O(M)
​
```
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
```
​
**APPROACH-2**
Explanation:
Time Complexity: O(NxM + NxM)
Space Complexity: O(1)
```
class Solution {
public void setZeroes(int[][] matrix) {
int col0 = 1, rows = matrix.length, cols = matrix[0].length;
for(int i = 0; i< rows;i++) {
if(matrix[i][0] == 0) col0 = 0;
for(int j = 1;j<cols; j++) {
if(matrix[i][j] == 0) {
matrix[i][0] = matrix[0][j] = 0;
}
}
}
for(int i = rows -1;i>= 0;i--) {
for(int j = cols -1;j>=1;j--) {
if(matrix[i][0] == 0 || matrix[0][j] == 0) {
matrix[i][j] = 0;
}
}
if(col0 == 0) matrix[i][0] = 0;
}
}
}
```
​