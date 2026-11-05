# 1221. Split a String in Balanced Strings

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/split-a-string-in-balanced-strings/
**Tags:** String, Greedy, Counting

## Approach 1 — 2024-04-15 21:34 (java)

*Runtime: 0 ms (faster than 100.0%) · Memory: 41.4 MB*

```java
class Solution {
    public int balancedStringSplit(String s) {
        int ans=0;
        int balance=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='R')balance++;
            else balance--;
            if(balance==0)ans++;
        }
    return ans;    
    }
}
```
