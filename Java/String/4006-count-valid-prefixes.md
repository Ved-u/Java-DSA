# 4006. Count Valid Prefixes

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/count-valid-prefixes/
**Tags:** String, Counting

## Approach 1 — 2026-08-02 16:03 (java)

*Runtime: 8 ms (faster than 6.4%) · Memory: 46.3 MB*

```java
class Solution {
    public int countValidPrefixes(String s) {
        int ans = 0;
        for(int i=0;i<s.length();i++){
            if(check(s.substring(0,i+1)))ans++;
        }
        return ans;
    }
    boolean check(String x){
        int one=0,zero=0;
        for(int i=0;i<x.length();i++){
            char ch = x.charAt(i);
            if(ch == '0')zero++;
            else one++;
        }
        return Math.abs(one-zero)<=1;
    }
}
```
