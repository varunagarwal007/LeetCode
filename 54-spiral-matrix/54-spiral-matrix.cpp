class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        vector<int> answer; 
        int row = matrix.size();
        int col = matrix[0].size();
        int count = 0;
        int total = row*col;
        int startRow = 0;
        int startCol = 0;
        int endRow = row-1;
        int endCol = col-1;
        
        
        
        while(count<total) {
            for(int index = startCol;count<total && index <=endCol;index++) {
                answer.push_back(matrix[startRow][index]);
                count++;
            }
            startRow++;
            for(int index = startRow;count<total && index<=endRow; index++) {
                answer.push_back(matrix[index][endCol]);
                count++;
            }
            endCol--;
            for(int index = endCol;count<total && index>=startCol; index--) {
                answer.push_back(matrix[endRow][index]);
                count++;
            }
            endRow--;
            for(int index = endRow;count<total && index>=startRow; index--) {
                answer.push_back(matrix[index][startCol]);
                count++;
            }
            startCol++;
        }
        return answer;
    }
};