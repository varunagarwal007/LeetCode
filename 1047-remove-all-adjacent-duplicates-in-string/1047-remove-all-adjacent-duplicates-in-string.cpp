class Solution {
public:
    string removeDuplicates(string s) {
        if(s.length() == 1) {
            return s;
        }
        string answer ;
        stack<char> stack;
       
        for(int i =0; i<s.length();i++) {
            if(stack.empty()) {
                stack.push(s[i]);
            } else {
                if(stack.top() == s[i]) {
                    stack.pop();
                } else {
                    stack.push(s[i]);
                }
            }
        }
       while(!stack.empty()) {
           answer = stack.top() + answer;
           stack.pop();
       }
        return answer;
       
    }
};