# 3330. Find the Original Typed String I

**Difficulty:** Easy
**Link:** https://leetcode.com/problems/find-the-original-typed-string-i/
**Tags:** String

## Approach 1 — 2024-10-26 20:07 (java)

*Runtime: 1 ms (faster than 86.3%) · Memory: 42.1 MB*

```java
class Solution {
    public int possibleStringCount(String word) {
        int ans=1;
        for(int i=1;i<word.length();i++){
            if(word.charAt(i)==word.charAt(i-1))ans++;
        }
    return ans;
    }
}
```
