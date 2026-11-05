# 8. String to Integer (atoi)

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/string-to-integer-atoi/
**Tags:** String

## Approach 1 — 2026-06-30 17:41 (java)

*Runtime: 3 ms (faster than 4.0%) · Memory: 43.7 MB*

```java
class Solution {
    public int myAtoi(String s) {
        StringBuilder ans = new StringBuilder();
        s = s.trim();
        boolean neg = false;
        for(int i=0;i<s.length();i++){
            if(i==0){
                if(s.charAt(0)=='-' || s.charAt(0)=='+'){
                    if(s.charAt(0)=='-')neg = true;
                    continue;
                }
            }
            if(!Character.isDigit(s.charAt(i)))break;
            ans.append(s.charAt(i));
        }
        if(ans.isEmpty())return 0;
        if(ans.length()>18){
            int idx = 0;
            while (idx < ans.length() && ans.charAt(idx) == '0') 
                ans.deleteCharAt(idx);
            if(ans.length()>18)
            if(neg)return Integer.MIN_VALUE;
            else return Integer.MAX_VALUE;
        }
        if(neg)ans.insert(0,'-');
        long x = Long.parseLong(ans.toString());
        if(x>Integer.MAX_VALUE)return Integer.MAX_VALUE;
        if(x<Integer.MIN_VALUE)return Integer.MIN_VALUE;
        return Integer.parseInt(ans.toString());
    }
}
```
