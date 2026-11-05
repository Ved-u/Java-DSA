# 1963. Minimum Number of Swaps to Make the String Balanced

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/minimum-number-of-swaps-to-make-the-string-balanced/
**Tags:** Two Pointers, String, Stack, Greedy, Bracket Sequences

## Approach 1 — 2026-05-18 09:16 (java)

*Runtime: 18 ms (faster than 36.3%) · Memory: 56.4 MB*

```java
class Solution {
    public int minSwaps(String s) {
        int ans=0,open=0,close=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='[')open++;
            else close++;
            if(close>open){
                ans++;
                close--;
                open++;
            }
        }
        return ans;
    }
}
```
