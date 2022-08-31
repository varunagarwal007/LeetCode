Using Stack:
```
string res;
stack<char> st;
for(int i=0;i<s.length();i++){
if(st.empty()==false && s[i]==st.top()){
st.pop();
}else
st.push(s[i]);
}
while(st.empty()==false){
res+=st.top();
st.pop();
}
reverse(res.begin(),res.end());
return res;
```
​
Without using stack
```
​
string ans = "" ;
for(int i = 0 ; i < s.length() ; i++)
{
if(ans.length() != 0 && ans.back() == s[i])
{
ans.pop_back() ;
}
else
{
ans += s[i] ;
}
}
return ans;
```