class Solution {
public:
    int finalValueAfterOperations(vector<string>& operations) {
        int answer = 0;
        for(int i = 0; i<operations.size(); i++) {
            string operation = operations[i];
            if(operation[0] == '-' || operation[1] == '-') {
                --answer;
            } else if (operation[0] == '+' || operation[1] == '+') {
                ++answer;
            } 
        }
        return answer;
    }
};