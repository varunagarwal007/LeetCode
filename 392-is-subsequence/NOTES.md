```
public boolean isSubsequence(String s, String t) {
if(s.length() == 0) {
return true;
}
if(t.length() == 0) {
return false;
}
if(t.charAt(0) == s.charAt(0) ) {
s = s.substring(1);
t = t.substring(1);
} else {
t = t.substring(1);
}
boolean ans = isSubsequence(s,t);
return ans;
}
```